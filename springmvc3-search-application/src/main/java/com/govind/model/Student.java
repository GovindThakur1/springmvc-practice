package com.govind.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    private List<String> subjects;
    private String gender;
    private String type;

    private Address address;
}

