package com.RestProject2.example.RestProject2.service;

import com.RestProject2.example.RestProject2.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);

}
