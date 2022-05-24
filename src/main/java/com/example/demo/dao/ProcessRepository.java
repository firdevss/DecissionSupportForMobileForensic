package com.example.demo.dao;

import com.example.demo.entity.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Integer> {

    @Query("SELECT COUNT(st) FROM Process st")
    Integer imajCount();

    @Query("SELECT COUNT(st) FROM Process st where st.imaj = 'Imaj Alınamadı'")
    Integer imajNotTakeCount();
        
    void deleteProcessByDeviceId(@Param("deviceId") Integer deviceId);
    
}
