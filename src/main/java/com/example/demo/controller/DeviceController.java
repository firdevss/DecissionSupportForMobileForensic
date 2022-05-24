package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.entity.Device;
import com.example.demo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/device")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @CrossOrigin
    @RequestMapping(value = "/getAllDevices", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDevices() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getAllDevices());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllDevicesNotAddFailure", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDevicesNotAddFailure() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getAllDevicesNotAddFailure());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllDevicesAddedFailure", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDevicesAddedFailure() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getAllDevicesAddedFailure());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllDevicesAddedProcess", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDevicesAddedProcess() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getAllDevicesAddedProcess());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }
    //oguzhan
    @CrossOrigin
    @RequestMapping(value = "/getAllDevicesAddedProcessByID/{processId}", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllDevicesAddedProcessByID(@PathVariable Integer processId) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getAllDevicesAddedProcessByID(processId));
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }


    @CrossOrigin
    @RequestMapping(value = "/getDevicesByModelId/{modelId}", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getDevicesByModelId(@PathVariable Integer modelId) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getDevicesByModelId(modelId));
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getIstatistics", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getIstatistics() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getIstatistics());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getMultiColumnChartDatas", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getMultiColumnChartDatas() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.getMultiColumnChartDatas());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/createDevice", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> createAuthRequest(@RequestBody Device device) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.createDevice(device));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/deleteDevice/{deviceId}", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> deleteDevice(@PathVariable Integer deviceId) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(deviceService.deleteDevice(deviceId));
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

}
