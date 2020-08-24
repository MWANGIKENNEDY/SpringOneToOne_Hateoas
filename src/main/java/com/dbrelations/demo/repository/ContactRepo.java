/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.repository;

import com.dbrelations.demo.models.Contact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Kennedy
 */
@Repository
public interface ContactRepo extends JpaRepository<Contact,Long> {
    
    List<Contact> findByStudentId(Long studentId);
     
}
