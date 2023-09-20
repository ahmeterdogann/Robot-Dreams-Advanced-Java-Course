package com.ahmeterdogan.data.repository;

import com.ahmeterdogan.data.entity.Student;
import com.ahmeterdogan.util.EntityManagerUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepository implements ICrudRepository<Student> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Student student) {

    }
}
