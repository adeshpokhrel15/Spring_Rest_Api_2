package com.RestProject2.example.RestProject2.service;

// import com.RestProject2.example.RestProject2.dao.StudentDAO;
import com.RestProject2.example.RestProject2.dao.StudentRepository;
import com.RestProject2.example.RestProject2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository theStudentRepository){
        studentRepository = theStudentRepository;
    }
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);
        Student theStudent = null;
        if(result.isPresent()){

                    theStudent = result.get();
        } else {
            throw new RuntimeException("Did not find student id "+ theId);
        }
        return theStudent;
    }

    @Override
    public Student save(Student theStudent) {
        return studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}
