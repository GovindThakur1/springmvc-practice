package com.govind.controller;

import com.govind.model.User;
import com.govind.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class FormController {
    private final IUserService userService;

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/processform")
    public String handleForm(@ModelAttribute User user) {
        System.out.println(user);
        // redirecting to the form again id any field us null
        if (user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
            return "redirect:/form";
        }
        this.userService.createUser(user);
        return "success";
    }
}
