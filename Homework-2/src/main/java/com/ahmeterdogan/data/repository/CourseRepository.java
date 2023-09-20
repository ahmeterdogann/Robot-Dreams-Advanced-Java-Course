package com.ahmeterdogan.data.repository;

import com.ahmeterdogan.data.entity.Course;
import com.ahmeterdogan.util.EntityManagerUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CourseRepository implements ICrudRepository<Course> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public void save(Course course) {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        try {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Course> findAll() {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        return em.createQuery("FROM Course", Course.class).getResultList();
    }

    @Override
    public Course findById(Long id) {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        return em.find(Course.class, id);
    }

    @Override
    public void delete(Course course) {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        try {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(Course course) {
        save(course);
    }
}
