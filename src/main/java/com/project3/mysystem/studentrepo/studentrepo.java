package com.project3.mysystem.studentrepo;

import com.project3.mysystem.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepo extends JpaRepository<student,Integer> {

}
