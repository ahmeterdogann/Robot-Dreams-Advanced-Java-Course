package com.ahmeterdogan.controller;

import com.ahmeterdogan.data.entity.Student;
import com.ahmeterdogan.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void save(Student student) {
        studentService.save(student);
    }

    public List<Student> findAll() {
        return studentService.findAll();
    }

    public Student findById(Long id) {
        return studentService.findById(id);
    }

    public void delete(Student student) {
        studentService.delete(student);
    }

    public void delete(Long id) {
        studentService.delete(id);
    }

    public void update(Student student) {
        studentService.update(student);
    }
}
