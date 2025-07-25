package com.govind.controller;

import com.govind.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {


    @ModelAttribute
    public void commonDataForModel(Model model) {
        model.addAttribute("msg", "I love programming");
        model.addAttribute("desc", "This is java");
    }

    @GetMapping("/contact")
    public String showForm(Model model) {
        commonDataForModel(model);
        return "contact";
    }

    // fetching data from form using old method -> HttpServletRequest, which is an old-style way of working with data
    // coming from view
//    @PostMapping("/processform")
//    public String handleForm(HttpServletRequest request) {
//        System.out.println("called process form");
//
//        String email = request.getParameter("email");
//        String name = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println(email);
//        System.out.println(name);
//        System.out.println(password);
//
//        return "";
//    }


    // fetching the form data using @RequestParam
//    @PostMapping("/processform")
//    public String handleForm(
//            @RequestParam(value = "username", required = false) String userName,
//            @RequestParam("email") String email,
//            @RequestParam("password") String password,
//            Model model
//    ) {
//        System.out.println("Called handleForm");
//
//        System.out.println(email);
//        System.out.println(userName);
//        System.out.println(password);
//
//        User user = new User();
//        user.setEmail(email);
//        user.setUsername(userName);
//        user.setPassword(password);
//
//        model.addAttribute("user", user);
//
//        return "success";
//    }


    // fetching the form data using @ModelAttribute
    @PostMapping("/processform")
    public String handleForm(@ModelAttribute("user") User user, Model model) {
        System.out.println("Called handleForm");

        // automatically binding in the method parameters using @ModelAttribute("user") User user,
        // so no need to explicitly addAttribute to model
//        model.addAttribute("user", user);

        return "success";
    }


}
