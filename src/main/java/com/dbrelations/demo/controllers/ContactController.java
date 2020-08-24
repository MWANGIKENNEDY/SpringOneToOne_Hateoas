/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.controllers;

import com.dbrelations.demo.models.Contact;
import com.dbrelations.demo.services.ContactService;
import com.dbrelations.demo.services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kennedy
 */
@Controller
@RequestMapping("/api")
public class ContactController {
    
    @Autowired
    ContactService contactService;
    
    @Autowired
    StudentService studentService;
   
    
    //Get all contacts
    @GetMapping("")
    public ResponseEntity<Object> getAllContacts(){
        return new ResponseEntity<>(contactService.getAllContacts(),HttpStatus.OK);
    }
    //Get one contact
    @GetMapping("/students/{student_id}/contact")
    public ResponseEntity<Object> getOneContact(@PathVariable Long student_id){
        
        if(!studentService.getOneStudent(student_id).isPresent()){
            return new ResponseEntity<>("Student does not exist",HttpStatus.NOT_FOUND);  
        }
        
        List<Contact> contact=contactService.contactById(student_id);
        if(!contact.isEmpty()){
            return new ResponseEntity<>(contact.get(0),HttpStatus.OK);  
        }
        return new ResponseEntity<>("No contact for this student",HttpStatus.NOT_FOUND);  
    }  
}
