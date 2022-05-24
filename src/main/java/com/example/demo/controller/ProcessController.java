package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Process;

@RestController
@RequestMapping(value = "/api/process")
public class ProcessController {

    @Autowired
    ProcessService processService;

    @CrossOrigin
    @RequestMapping(value = "/createProcess", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> createProcess(@RequestBody Process process) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(processService.createProcess(process));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getPieChart", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getPieChart() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(processService.getPieChart());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }
}
