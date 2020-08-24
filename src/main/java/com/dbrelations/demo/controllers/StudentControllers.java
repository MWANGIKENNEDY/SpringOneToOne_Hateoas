/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.controllers;

import com.dbrelations.demo.hateoas.StudentModelAssembler;
import com.dbrelations.demo.models.Student;
import com.dbrelations.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Kennedy
 */
@Controller
@RequestMapping("/api/students")
public class StudentControllers {
    
    @Autowired
    StudentService studentService;
    
    @Autowired
    StudentModelAssembler  assembler;
    
    @PostMapping(value="/register")
    public ResponseEntity<?> registerStudents(@RequestBody Student student ){
        studentService.registerStudent(student);
        
        return new ResponseEntity<>("Registered",HttpStatus.CREATED);
    }
    
    @GetMapping(value="/all")
    public ResponseEntity<?> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }
    
    @GetMapping(value="/{id}")
    public ResponseEntity<?> getOneStudent(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getOneStudent(id),HttpStatus.OK);
    }
      
}
