package com.ahmeterdogan.service;

import com.ahmeterdogan.data.entity.Course;
import com.ahmeterdogan.data.repository.CourseRepository;

import java.util.List;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void save(Course course) {
        courseRepository.save(course);
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findById(Long id) {
        return courseRepository.findById(id);
    }

    public void delete(Course course) {
        courseRepository.delete(course);
    }

    public void delete(Long id) {
        courseRepository.delete(id);
    }

    public void update(Course course) {
        courseRepository.update(course);
    }
}
