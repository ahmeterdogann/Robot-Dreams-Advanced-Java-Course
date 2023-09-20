package com.ahmeterdogan.controller;

import com.ahmeterdogan.data.entity.VisitingResearcher;
import com.ahmeterdogan.service.VisitingResearcherService;

import java.util.List;

public class VisitingResearcherController {
    private VisitingResearcherService visitingResearcherService;

    public VisitingResearcherController(VisitingResearcherService visitingResearcherService) {
        this.visitingResearcherService = visitingResearcherService;
    }

    public void save(VisitingResearcher visitingResearcher) {
        visitingResearcherService.save(visitingResearcher);
    }

    public List<VisitingResearcher> findAll() {
        return visitingResearcherService.findAll();
    }

    public VisitingResearcher findById(Long id) {
        return visitingResearcherService.findById(id);
    }

    public void delete(VisitingResearcher visitingResearcher) {
        visitingResearcherService.delete(visitingResearcher);
    }

    public void delete(Long id) {
        visitingResearcherService.delete(id);
    }

    public void update(VisitingResearcher visitingResearcher) {
        visitingResearcherService.update(visitingResearcher);
    }
}
