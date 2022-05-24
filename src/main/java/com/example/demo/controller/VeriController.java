package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.entity.Veri;
import com.example.demo.service.VeriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/veri")
public class VeriController {

    @Autowired
    VeriService veriService;

    @CrossOrigin
    @RequestMapping(value = "/getVeriForModel", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> getVeriForModel(@RequestBody Veri veri) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(veriService.getVeriForModel(veri));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

}
