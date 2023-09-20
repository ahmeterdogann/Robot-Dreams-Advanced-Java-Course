package com.ahmeterdogan.service;

import com.ahmeterdogan.data.entity.Student;
import com.ahmeterdogan.data.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public void delete(Long id) {
        studentRepository.delete(id);
    }

    public void update(Student student) {
        studentRepository.update(student);
    }
}
