package com.dbrelations.demo.repository;

import com.dbrelations.demo.models.Counties;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountyRepo extends JpaRepository<Counties,Long> {
    
}
