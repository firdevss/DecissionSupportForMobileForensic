package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.entity.Evaluation;
import com.example.demo.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/evaluation")
public class EvaluationController {
    @Autowired
    EvaluationService evaluationService;

    @CrossOrigin
    @RequestMapping(value = "/createEvaluation", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> createFailure(@RequestBody Evaluation evaluation) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(evaluationService.createEvaluation(evaluation));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllEvaluations", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllEvaluations() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(evaluationService.getAllEvaluations());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getEvaluateChart", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getEvaluateChart() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(evaluationService.getEvaluateChart());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }
}
