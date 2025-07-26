package com.govind.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

    // exception handling using @ExceptionHandler annotation
    // demonstrating Exception handling in Spring MVC, for null
    // this is used inside a separate class with @ControllerAdvice due to which it becomes a centralized exception handler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandlerNull(Model model) {
        model.addAttribute("msg", "Null Pointer exception has occurred. sent from controller advice");
        return "null_page";
    }


    // demonstrating Exception handling in Spring MVC, for null
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NumberFormatException.class)
    public String exceptionHandlerNumberFormat(Model model) {
        model.addAttribute("msg", "Number Format exception has occurred.");
        return "null_page";
    }
}
