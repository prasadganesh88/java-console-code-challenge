package com.naviance.samples.persistence;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import com.naviance.samples.domain.model.*;

public class StaticStudentRepositoryTest {

    private final static String VALID_STUDENT_NAME = "Optimus Prime";
    private final static String VALID_STUDENT_ID = "9912345US";
    private final static double VALID_STUDENT_GPA = 4.0;
    private static final double ASSERTION_DELTA = .001;

    @Test
    public void findAllReturnsStaticDataList() {
        StudentRepository studentRepo = new StaticStudentRepository();
        List<Student> students = studentRepo.findAll();
        assertEquals(25, students.size());
        Student student1 = students.get(0);
        assertEquals("student1.getName", VALID_STUDENT_NAME, student1.getName());
        assertEquals("student1.getGpa", VALID_STUDENT_GPA, student1.getGpa(),
                ASSERTION_DELTA);
        assertEquals("student1.getId", VALID_STUDENT_ID,
                student1.getStudentId());

    }

}
