/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.services;

import com.dbrelations.demo.models.Student;
import com.dbrelations.demo.repository.StudentRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kennedy
 */
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    StudentRepo studentRepo;

    @Override
    public void registerStudent(Student student) {
        studentRepo.save(student); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return studentRepo.findById(id); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
