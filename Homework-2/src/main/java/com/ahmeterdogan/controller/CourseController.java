package com.ahmeterdogan.controller;

import com.ahmeterdogan.data.entity.Course;
import com.ahmeterdogan.service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public void save(Course course) {
        courseService.save(course);
    }

    public List<Course> findAll() {
        return courseService.findAll();
    }

    public Course findById(Long id) {
        return courseService.findById(id);
    }

    public void delete(Course course) {
        courseService.delete(course);
    }

    public void delete(Long id) {
        courseService.delete(id);
    }

    public void update(Course course) {
        courseService.update(course);
    }
}
