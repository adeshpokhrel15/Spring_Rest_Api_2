package com.RestProject2.example.RestProject2.dao;

import com.RestProject2.example.RestProject2.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDAOJpiImpl implements StudentDAO {



    // define field for EntityManager
    private EntityManager entitymanager;


    // set up constructor injection
    @Autowired
    public StudentDAOJpiImpl(EntityManager theentitymanager) {
        entitymanager = theentitymanager;
    }
    @Override
    public List<Student> findAll() {
        return null;
    }
}
