package com.ahmeterdogan.data.repository;

import com.ahmeterdogan.data.entity.Course;
import com.ahmeterdogan.data.entity.PermanentInstructor;
import com.ahmeterdogan.util.EntityManagerUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class PermanentInstructorRepository implements ICrudRepository<PermanentInstructor> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public void save(PermanentInstructor permanentInstructor) {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        try {
            em.getTransaction().begin();
            em.persist(permanentInstructor);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<PermanentInstructor> findAll() {
        if (!em.isOpen()) {
            em = EntityManagerUtils.getEntityManager("mysqlPU");
        }

        return em.createQuery("FROM PermanentInstructor ", PermanentInstructor.class).getResultList();
    }

    @Override
    public PermanentInstructor findById(Long id) {
        return null;
    }

    @Override
    public void delete(PermanentInstructor permanentInstructor) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(PermanentInstructor permanentInstructor) {

    }
}
