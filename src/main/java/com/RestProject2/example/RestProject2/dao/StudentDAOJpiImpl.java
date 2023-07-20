//package com.RestProject2.example.RestProject2.dao;
//
//import com.RestProject2.example.RestProject2.entity.Student;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//@Repository
//public class StudentDAOJpiImpl implements StudentDAO {
//
//
//
//    // define field for EntityManager
//    private EntityManager entitymanager;
//
//
//    // set up constructor injection
//    @Autowired
//    public StudentDAOJpiImpl(EntityManager theentitymanager) {
//        entitymanager = theentitymanager;
//    }
//    @Override
//    public List<Student> findAll() {
//
//        // create a query
//        TypedQuery<Student> theQuery = entitymanager.createQuery("from Student", Student.class);
//
//        // execute query and get the result
//        List<Student> student = theQuery.getResultList();
//
//        // return the results
//        return student;
//
//    }
//
//    @Override
//    public Student findById(int theId) {
//        // get student
//        Student theStudent = entitymanager.find(Student.class, theId);
//
//        // return student
//        return theStudent;
//    }
//
//    @Override
//    public Student save(Student theStudent) {
//
//        // save Student
//        Student dbStudent = entitymanager.merge(theStudent);
//
//        // return the dbStudent
//        return dbStudent;
//    }
//
//    @Override
//    public void deleteById(int theId) {
//
//        // find the id
//        Student theStudent = entitymanager.find(Student.class,theId);
//        // remove the student
//        entitymanager.remove(theStudent);
//
//    }
//}
