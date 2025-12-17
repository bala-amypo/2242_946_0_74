package com.example.demo.service.serviceimplement;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

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
    @Override
    public Optional<Student> fetchDataById(int id){
        return repo.findAllById(id);
    }
}
