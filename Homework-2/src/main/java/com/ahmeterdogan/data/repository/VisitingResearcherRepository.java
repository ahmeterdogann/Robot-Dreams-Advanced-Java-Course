package com.ahmeterdogan.data.repository;

import com.ahmeterdogan.data.entity.VisitingResearcher;
import com.ahmeterdogan.util.EntityManagerUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class VisitingResearcherRepository implements ICrudRepository<VisitingResearcher>{
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public void save(VisitingResearcher visitingResearcher) {

    }

    @Override
    public List<VisitingResearcher> findAll() {
        return null;
    }

    @Override
    public VisitingResearcher findById(Long id) {
        return null;
    }

    @Override
    public void delete(VisitingResearcher visitingResearcher) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(VisitingResearcher visitingResearcher) {

    }
}
