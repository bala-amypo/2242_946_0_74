package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    @Autowired
    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    // Create (or Insert) data
    public Student createData(Student stu) {
        return repo.save(stu);
    }

    @Override
    // Fetch all records
    public List<Student> fetchRecord() {
        return repo.findAll();
    }
}
