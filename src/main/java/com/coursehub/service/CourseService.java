package com.coursehub.service;

import com.coursehub.model.Course;
import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    List<Course> getAllCourses();

    Course createCourseForInstructor(Long instructorId, Course course);
}
