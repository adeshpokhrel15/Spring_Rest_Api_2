package com.RestProject2.example.RestProject2.rest;

// import com.RestProject2.example.RestProject2.dao.StudentDAO;
import com.RestProject2.example.RestProject2.entity.Student;
import com.RestProject2.example.RestProject2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

//    private StudentDAO studentDAO;
    // inject dao student
private StudentService studentService;

    @Autowired
    public StudentRestController (StudentService theStudentService) {
        studentService=theStudentService;
    }

    // expose student and return the list of student
    @GetMapping("/student")
    public List<Student> findAll(){
        return studentService.findAll();
    }


    // add mapping for GET from id
    @GetMapping("/student/{studentId}")
    public Student theStudent(@PathVariable int studentId){
        Student theStudent = studentService.findById(studentId);
        if(theStudent ==null)
        {
            throw new RuntimeException( "Employee id not found - " + studentId);
        }
        return theStudent;
    }

    // add mapping for POST or add new students
    @PostMapping("/student")
    public Student theStudent(@RequestBody Student theStudent){
           // just in case they pass an id in JSON ... set id to - this is to force a save of new item instead of update
        theStudent.setId(0);
        Student dbStudent = studentService.save(theStudent);
        return dbStudent;
    }

    // add mapping for PUT - update existing employee
    @PutMapping ("/student")
    public Student updateStudent(@RequestBody Student theStudent) {
        Student dbStudent = studentService.save(theStudent);
        return dbStudent;
    }

    // add mapping for delete
    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        Student tempStudent = studentService.findById(studentId);

        studentService.deleteById(studentId);

        return "Deleted Student id" + studentId;

    }


}
