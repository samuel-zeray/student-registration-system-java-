package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get a single course by ID
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    // Save a new course
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    // Delete a course by ID
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
