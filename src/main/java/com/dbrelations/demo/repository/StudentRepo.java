/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.repository;

import com.dbrelations.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kennedy
 */
public interface StudentRepo extends JpaRepository<Student,Long> {
    
}
