package com.ahmeterdogan.service;

import com.ahmeterdogan.data.entity.PermanentInstructor;
import com.ahmeterdogan.data.repository.PermanentInstructorRepository;

import java.util.List;

public class PermanentInstructorService {
    private PermanentInstructorRepository permanentInstructorRepository;

    public PermanentInstructorService(PermanentInstructorRepository permanentInstructorRepository) {
        this.permanentInstructorRepository = permanentInstructorRepository;
    }

    public void save(PermanentInstructor permanentInstructor) {
        permanentInstructorRepository.save(permanentInstructor);
    }

    public List<PermanentInstructor> findAll() {
        return permanentInstructorRepository.findAll();
    }

    public PermanentInstructor findById(Long id) {
        return permanentInstructorRepository.findById(id);
    }

    public void delete(PermanentInstructor permanentInstructor) {
        permanentInstructorRepository.delete(permanentInstructor);
    }

    public void delete(Long id) {
        permanentInstructorRepository.delete(id);
    }

    public void update(PermanentInstructor permanentInstructor) {
        permanentInstructorRepository.update(permanentInstructor);
    }
}
