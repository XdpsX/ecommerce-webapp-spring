package com.ecommerce.admin.controller;

import com.ecommerce.library.service.impl.AdminServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping("/login")
    public String loginForm(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }
}
