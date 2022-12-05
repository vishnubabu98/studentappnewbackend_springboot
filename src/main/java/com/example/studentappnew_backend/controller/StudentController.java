package com.example.studentappnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to my wesite";
    }
    @GetMapping("/contact")
    public String ContactPage()
    {
        return  "welcome to my contact page;";
    }
    @GetMapping("/homepage")
    public String HomePages()
    {
        return "welcome to home page";
    }
    @GetMapping("/gallery")
    public  String GalleryPage()
    {
        return  "welcome to my gallery";
    }

}
