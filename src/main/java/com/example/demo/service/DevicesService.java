package com.example.demo.service;

import com.example.demo.dao.DevicesRepository;
import com.example.demo.dao.ModelRepository;
import com.example.demo.dto.OperatingSystemDTO;
import com.example.demo.entity.Devices;
import com.example.demo.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicesService {
    @Autowired
    DevicesRepository devicesRepository;

    @Autowired
    ModelRepository modelRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Devices> getAllDeviceses() {
        return devicesRepository.findAll();
    }

    public Devices getDevicesesByModelId(Integer modelId) {
        Model model = modelRepository.findById(modelId).get();
        Devices devicesByModelName = devicesRepository.getDevicesByModelName(model.getName());
        return devicesByModelName;
    }

    public List<OperatingSystemDTO> getAllOperatingSystems() {
        String sql = "SELECT DISTINCT operating_system as id, operating_system as name FROM phonedb.devices where operating_system <> ''";
        List<OperatingSystemDTO> resultList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<OperatingSystemDTO>(OperatingSystemDTO.class));

        return resultList;
    }

}
