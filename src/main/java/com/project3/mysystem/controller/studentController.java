package com.project3.mysystem.controller;

import com.project3.mysystem.model.student;
import com.project3.mysystem.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {
          @Autowired
          private studentservice studentservice;
          @PostMapping("/add")
          public String add(@RequestBody student student){
              studentservice.savestudent(student);
              return "new student added bro";
          }
}
