package com.RestProject2.example.RestProject2.dao;

import com.RestProject2.example.RestProject2.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();

    Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);

}
