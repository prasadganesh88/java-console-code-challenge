package com.naviance.samples.domain.model;

import java.util.List;

public interface StudentRepository {

    List<Student> findAll();

    Student find(String aStudentId);

}
