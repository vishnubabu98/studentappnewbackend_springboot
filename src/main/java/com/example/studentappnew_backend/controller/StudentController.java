package com.example.studentappnew_backend.controller;

import com.example.studentappnew_backend.dao.StudentDao;
import com.example.studentappnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to my wesite";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddStudent(@RequestBody Students s)
    {
        System.out.println(s.toString());
        dao.save(s);
        return "student added successfully";
    }


}
