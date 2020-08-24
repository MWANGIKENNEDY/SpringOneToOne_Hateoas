/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.services;

import com.dbrelations.demo.models.Contact;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Kennedy
 */
public interface ContactService {
    //Create contact
    public void createContact(Contact contact);
    //get all contacts
    public List<Contact> getAllContacts();
    //get one contact
    public Optional<Contact> getOneContact(Long id);
    //delete contact
    public void deleteContact(Long id);
    //update cintact
    public void updateContact(Contact contact);
    //Find contact by StudentId
    public List<Contact> contactById(Long id);

   
}
