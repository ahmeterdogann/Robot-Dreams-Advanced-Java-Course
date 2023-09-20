package com.ahmeterdogan.service;

import com.ahmeterdogan.data.entity.VisitingResearcher;
import com.ahmeterdogan.data.repository.VisitingResearcherRepository;

import java.util.List;

public class VisitingResearcherService {
    private VisitingResearcherRepository visitingResearcherRepository;

    public VisitingResearcherService(VisitingResearcherRepository visitingResearcherRepository) {
        this.visitingResearcherRepository = visitingResearcherRepository;
    }

    public void save(VisitingResearcher visitingResearcher) {
        visitingResearcherRepository.save(visitingResearcher);
    }

    public List<VisitingResearcher> findAll() {
        return visitingResearcherRepository.findAll();
    }

    public VisitingResearcher findById(Long id) {
        return visitingResearcherRepository.findById(id);
    }

    public void delete(VisitingResearcher visitingResearcher) {
        visitingResearcherRepository.delete(visitingResearcher);
    }

    public void delete(Long id) {
        visitingResearcherRepository.delete(id);
    }

    public void update(VisitingResearcher visitingResearcher) {
        visitingResearcherRepository.update(visitingResearcher);
    }
}
