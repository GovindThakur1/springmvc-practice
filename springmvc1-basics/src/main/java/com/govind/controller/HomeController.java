package com.govind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/path")
public class HomeController {

    // using Model for sending data from controller to view
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("Home page called");

        model.addAttribute("name", "Govind Thakur");
        model.addAttribute("roll", 56);

        List<String> friends = new ArrayList<>();
        friends.add("Ram");
        friends.add("Shyam");
        friends.add("Gopal");
        friends.add("Hari");

        model.addAttribute("friends", friends);

        return "index";
    }

    @GetMapping("/about")
    public String about() {
        System.out.println("About page called");
        return "about";
    }


    // using ModelAndView for sending data from controller to the view
    @GetMapping("/help")
    public ModelAndView help() {
        System.out.println("help controller called");

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "gopu");
        mv.addObject("roll", 677);

        LocalDateTime localDateTime = LocalDateTime.now();
        mv.addObject("now", localDateTime);

        // a collection which will be traversed using JSTL
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        mv.addObject("nums", nums);

        mv.setViewName("help");
        return mv;
    }
}
