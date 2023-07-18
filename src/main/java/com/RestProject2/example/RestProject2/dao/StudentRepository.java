package com.RestProject2.example.RestProject2.dao;

import com.RestProject2.example.RestProject2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // no need to write any code



}
