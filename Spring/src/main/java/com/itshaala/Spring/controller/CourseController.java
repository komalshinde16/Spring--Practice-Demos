package com.itshaala.Spring.controller;


import com.itshaala.Spring.model.Course;
import com.itshaala.Spring.service.CourseService;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class CourseController {
    //create the object
    private CourseService courseService;//----> spring container --> DI

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void editCourse(Course course) {
        courseService.editCourse(course);
    }

    public void deleteCourse(Course course) {
        courseService.deleteCourse(course);
    }

    public Course getCourse(int id) {
        return courseService.getCourse(id);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }


}
