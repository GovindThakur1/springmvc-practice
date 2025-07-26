package com.govind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/welcome")
    public String welcome(@RequestParam("user") String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "welcome";
    }


}
