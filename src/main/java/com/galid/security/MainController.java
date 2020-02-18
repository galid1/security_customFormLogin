package com.galid.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/main")
    public String getMain() {
        return "main";
    }

    @GetMapping("/login")
    public String getLoginForm() {
        return "loginPage";
    }
}
