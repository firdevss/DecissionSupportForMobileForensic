package com.example.demo.dao;

import com.example.demo.dto.OperatingSystemDTO;
import com.example.demo.entity.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Integer> {

    Devices getDevicesByModelName(@Param("modelName") String modelName);

}
