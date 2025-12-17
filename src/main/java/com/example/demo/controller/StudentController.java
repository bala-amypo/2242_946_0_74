package com.example.demo.controller;
 import java.util.*;
 
 @RestController
 public class StudentController{
    @Autowired
    StudentService ser;
    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }
 }
