
package com.dbrelations.demo.repository;

import com.dbrelations.demo.models.Regions;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegionsRepo extends JpaRepository<Regions,Long> {
    
}
