package com.govind.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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


    // practice @PathVariable annotation
    @GetMapping("/user/{userId}/{userName}")
    public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
        System.out.println("The user name in path variable is: " + userName);
        System.out.println("The user id in path variable is: " + userId);
        return "home";
    }


    //****************** EXCEPTION HANDLING ************************

    // this url will create exception to happen
    @GetMapping("/exception")
    public String createException() {
        String str = null;
        System.out.println(str.length());
        return "home";

    }


    // exception handling using @ExceptionHandler annotation
    // demonstrating Exception handling in Spring MVC, for null
//    @ExceptionHandler(value = NullPointerException.class)
//    public String exceptionHandlerNull(Model model) {
//        model.addAttribute("msg", "Null Pointer exception has occurred.");
//        return "null_page";
//    }
//
//
//    // demonstrating Exception handling in Spring MVC, for null
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = NumberFormatException.class)
//    public String exceptionHandlerNumberFormat(Model model) {
//        model.addAttribute("msg", "Number Format exception has occurred.");
//        return "null_page";
//    }


}
