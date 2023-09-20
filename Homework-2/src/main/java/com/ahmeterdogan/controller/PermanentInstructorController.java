package com.ahmeterdogan.controller;

import com.ahmeterdogan.data.entity.PermanentInstructor;
import com.ahmeterdogan.service.PermanentInstructorService;

import java.util.List;

public class PermanentInstructorController {
    private PermanentInstructorService permanentInstructorService;

    public PermanentInstructorController(PermanentInstructorService permanentInstructorService) {
        this.permanentInstructorService = permanentInstructorService;
    }

    public void save(PermanentInstructor permanentInstructor) {
        permanentInstructorService.save(permanentInstructor);
    }

    public List<PermanentInstructor> findAll() {
        return permanentInstructorService.findAll();
    }

    public PermanentInstructor findById(Long id) {
        return permanentInstructorService.findById(id);
    }

    public void delete(PermanentInstructor permanentInstructor) {
        permanentInstructorService.delete(permanentInstructor);
    }

    public void delete(Long id) {
        permanentInstructorService.delete(id);
    }

    public void update(PermanentInstructor permanentInstructor) {
        permanentInstructorService.update(permanentInstructor);
    }
}
