package com.govind.controller;

import com.govind.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComplexFormController {

    @GetMapping("/complex")
    public String showForm() {
        return "complex_form";
    }


    // using BindingResult for handling errors if user enters anything that is not matching the datatype of student
    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute("student") Student student, BindingResult bindingResult) { // the student will be sent to the view automatically

        // checking if any error has occurred
        if (bindingResult.hasErrors()) {
            System.out.println("error occurred.");
            return "complex_form";
        }

        System.out.println("inside handle form");
        System.out.println(student);
        System.out.println(student.getAddress());
        return "success";
    }


}
