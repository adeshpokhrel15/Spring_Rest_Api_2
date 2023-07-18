package com.RestProject2.example.RestProject2.service;

import com.RestProject2.example.RestProject2.dao.StudentDAO;
import com.RestProject2.example.RestProject2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO theStudentDAO){
        studentDAO = theStudentDAO;
    }
    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }
}
