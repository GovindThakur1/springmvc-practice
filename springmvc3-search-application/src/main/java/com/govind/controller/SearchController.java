package com.govind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query) {
        String url = "https://www.google.com/search?q=" + query;

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }
}
