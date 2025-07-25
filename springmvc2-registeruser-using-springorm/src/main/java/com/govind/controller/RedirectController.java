package com.govind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * This RedirectController is used for demonstrating how to redirect in spring mvc
 */
@Controller
public class RedirectController {

    // redirecting using redirect prefix in return
//    @GetMapping("/one")
//    public String one() {
//        System.out.println("This is handler one");
//        return "redirect:/two";
//    }


    // Redirecting using RedirectView
    @GetMapping("/one")
    public RedirectView one() {
        System.out.println("This is handler one");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("two"); // we could even use www.google.com or any other link
        return redirectView;
    }

    @GetMapping("/two")
    public String two() {
        System.out.println("This is handler two");
        return "final";
    }


}
