/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbrelations.demo.appconfig;

import com.dbrelations.demo.services.ContactService;
import com.dbrelations.demo.services.ContactServiceImpl;
import com.dbrelations.demo.services.StudentService;
import com.dbrelations.demo.services.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Kennedy
 */
@Configuration
public class AppConfig {
    
    @Bean
    public ContactService contactService(){
        return new ContactServiceImpl();
    }
    
    @Bean
    public StudentService studentService(){
        return new StudentServiceImpl();
    }
    
}
