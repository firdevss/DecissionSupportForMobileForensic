package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/model")
public class ModelController {

    @Autowired
    ModelService modelService;

    @CrossOrigin
    @RequestMapping(value = "/getAllModels", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllModels() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(modelService.getAllModels());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

    @CrossOrigin
    @RequestMapping(value = "/getModelByBrandId/{brandId}", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getModelByBrandId(@PathVariable Long brandId) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(modelService.getModelByBrandId(brandId));
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

}
