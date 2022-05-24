package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.service.DevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/devices")
public class DevicesController {
    @Autowired
    DevicesService devicesService;

    @CrossOrigin
    @RequestMapping(value = "/getAllDeviceses", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDeviceses() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(devicesService.getAllDeviceses());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getDevicesesByModelId/{modelId}", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getDevicesesByModelId(@PathVariable Integer modelId) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(devicesService.getDevicesesByModelId(modelId));
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllOperatingSystems", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllOperatingSystems() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(devicesService.getAllOperatingSystems());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

}
