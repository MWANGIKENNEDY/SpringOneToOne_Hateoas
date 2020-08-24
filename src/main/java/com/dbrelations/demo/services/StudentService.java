/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.services;

import com.dbrelations.demo.models.Student;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Kennedy
 */
public interface StudentService {
    //Add a new student
    public void registerStudent(Student student);
    //Get all students
    public List<Student> getAllStudents();
    //Get one student
    public Optional<Student> getOneStudent(Long id);  
}
