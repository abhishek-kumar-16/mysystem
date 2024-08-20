package com.project3.mysystem.service;

import com.project3.mysystem.model.student;
import com.project3.mysystem.studentrepo.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentserviceimpl implements studentservice{
   @Autowired
   private studentrepo studentrepo;  //   to inject student repo here


    @Override
    public student savestudent(student student) {
        return studentrepo.save(student);
    }
}
