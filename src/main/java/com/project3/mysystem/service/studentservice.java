package com.project3.mysystem.service;


import com.project3.mysystem.model.student;

import java.util.List;


public interface studentservice {
    public student savestudent(student student);
    public List<student> getAllstudents();
}
