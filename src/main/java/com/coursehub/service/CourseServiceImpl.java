package com.coursehub.service;

import com.coursehub.exception.ResourceNotFoundException;
import com.coursehub.model.Course;
import com.coursehub.model.Role;
import com.coursehub.model.User;
import com.coursehub.repository.CourseRepository;
import com.coursehub.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public CourseServiceImpl(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course createCourseForInstructor(Long instructorId, Course course) {
        User user = userRepository.findById(instructorId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + instructorId));

        if (user.getRole() != Role.INSTRUCTOR) {
            throw new RuntimeException("User with id " + instructorId + " is not an INSTRUCTOR");
        }

        course.setInstructor(user);
        return courseRepository.save(course);
    }
}
