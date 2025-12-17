package com.example.demo.entity.Student;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repo;

    @override
    //create (or) Insert data
     public Student createData(Student stu) {
     return repo.save(stu);
    }

    @Override
    // Fetch all records
    public List<Student> fetchRecord() {
    return repo.findAll();
    }
}