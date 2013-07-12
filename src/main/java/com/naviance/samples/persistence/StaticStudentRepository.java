/**
 *
 */
package com.naviance.samples.persistence;

import java.util.ArrayList;
import java.util.List;

import com.naviance.samples.domain.model.Student;
import com.naviance.samples.domain.model.StudentRepository;

public class StaticStudentRepository implements StudentRepository {

    private final double startingGpa = 4.0;
    private final double gpaDecrement = 0.1;
    private final int startingStudentIdNumericPart = 9912345;
    private final String[] names = {"Optimus Prime", "Ultra Magnus",
            "Metroplex", "Omega Supreme", "Perceptor", "Megatron",
            "Starscream", "Skywarp", "Thundercracker", "Soundwave", "Ravage",
            "Laserbeak", "Rumble", "Shockwave", "Trypticon", "Shockwave",
            "Grimlock", "Slag", "Sludge", "Snarl", "Swoop", "Cyclonus",
            "Jetfire", "Ramjet", "Dirge", "Thrust", "Devastator", "Bruticus",
            "Superion", "Frenzy"};
    private int listCount = 25;

    /*
     * (non-Javadoc)
     *
     * @see com.naviance.samples.domain.model.StudentRepository#findAll()
     */
    public List<Student> findAll() {

        List<Student> students = new ArrayList<Student>();
        double currentGpa = this.startingGpa;
        for (int i = 0; i < this.listCount; i++) {

            String currentStudentId = String.format("%dUS",
                    this.startingStudentIdNumericPart + i);
            Student student = new Student(currentStudentId, names[i]);
            student.setGpa(currentGpa);
            students.add(student);
            currentGpa -= gpaDecrement;

        }
        return students;
    }

    public Student find(String aStudentId) {
        // To Implement
        return null;
    }
}
