package com.naviance.samples.domain.model;

import static org.junit.Assert.*;
import org.junit.Test;

import com.naviance.samples.domain.model.Student;

public class StudentTest {

    private final static String VALID_STUDENT_NAME = "Optimus Prime";
    private final static String VALID_STUDENT_ID = "9912345US";
    private final static double VALID_STUDENT_GPA = 3.93;
    private static final double ASSERTION_DELTA = .001;

    @Test
    public void initializeValidStudent() {

        Student student = new Student(VALID_STUDENT_ID, VALID_STUDENT_NAME);
        student.setGpa(StudentTest.VALID_STUDENT_GPA);
        assertEquals("getStudentId", VALID_STUDENT_ID, student.getStudentId());
        assertEquals("getName", VALID_STUDENT_NAME, student.getName());
        assertEquals("getGpa", VALID_STUDENT_GPA, student.getGpa(),
                ASSERTION_DELTA);

    }

}
