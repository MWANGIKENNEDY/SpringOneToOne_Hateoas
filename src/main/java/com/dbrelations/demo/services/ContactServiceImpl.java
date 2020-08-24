/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.services;

import com.dbrelations.demo.models.Contact;
import com.dbrelations.demo.repository.ContactRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kennedy
 */
public class ContactServiceImpl implements ContactService {
    
    @Autowired
    ContactRepo contactRepo;

    @Override
    public void createContact(Contact contact) {
        contactRepo.save(contact); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Contact> getOneContact(Long id) {
        return contactRepo.findById(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteContact(Long id) {
        contactRepo.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateContact(Contact contact) {
        contactRepo.save(contact);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> contactById(Long id) {
        return contactRepo.findByStudentId(id); //To change body of generated methods, choose Tools | Templates.
    }


    
}
