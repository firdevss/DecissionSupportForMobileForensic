package com.example.demo.service;

import com.example.demo.dao.ModelRepository;
import com.example.demo.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    ModelRepository modelRepository;

    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    public List<Model> getModelByBrandId(Long brandId) {
        return modelRepository.getModelByBrandId(brandId);
    }

}
