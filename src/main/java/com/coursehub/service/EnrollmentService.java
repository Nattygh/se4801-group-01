package com.coursehub.service;

import com.coursehub.model.Enrollment;
import java.util.List;

public interface EnrollmentService {

    Enrollment saveEnrollment(Enrollment enrollment);

    List<Enrollment> getAllEnrollments();
}
