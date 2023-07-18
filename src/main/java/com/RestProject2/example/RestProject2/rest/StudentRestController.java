package com.RestProject2.example.RestProject2.rest;

import com.RestProject2.example.RestProject2.dao.StudentDAO;
import com.RestProject2.example.RestProject2.entity.Student;
import com.RestProject2.example.RestProject2.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

//    private StudentDAO studentDAO;
    // inject dao student
private StudentService studentService;
    public StudentRestController (StudentService theStudentService) {
        studentService=theStudentService;
    }

    // expose student and return the list of student
    @GetMapping("/student")
    public List<Student> findAll(){
        return studentService.findAll();
    }

}
