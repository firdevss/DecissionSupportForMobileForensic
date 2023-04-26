package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.entity.Failure;
import com.example.demo.service.FailureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/failure")
public class FailureController {

    @Autowired
    FailureService failureService;

    @CrossOrigin
    @RequestMapping(value = "/createFailure", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> createFailure(@RequestBody Failure failure) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(failureService.createFailure(failure));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getFailureBarChart", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getFailureBarChart() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(failureService.getFailureBarChart());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

}
