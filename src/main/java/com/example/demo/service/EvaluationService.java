package com.example.demo.service;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.dao.EvaluationRepository;
import com.example.demo.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    @Autowired
    EvaluationRepository evaluationRepository;




    @Autowired
    DeviceRepository deviceRepository;

    public String createEvaluation(Evaluation evaluation) {
        Evaluation save = evaluationRepository.save(evaluation);
        deviceRepository.addEvaluationId(save.getId(), evaluation.getDeviceId());
        return "Kayıt Başarılı!";
    }

    public Evaluation getEvaluationById(Integer id) {
        Evaluation byId = evaluationRepository.getById(id);
        return byId;
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }
}