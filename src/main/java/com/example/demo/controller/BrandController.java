package com.example.demo.controller;

import com.example.demo.dto.ResultVm;
import com.example.demo.entity.Brand;
import com.example.demo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @CrossOrigin
    @RequestMapping(value = "/getAllBrands", method = {RequestMethod.GET})
    public ResponseEntity<ResultVm> getAllBrands() {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(brandService.getAllBrands());
            vm.setIsSuccess(true);
            vm.addMessage("İşlem Başarılı");
        } catch (Exception e) {

            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }

   /* @CrossOrigin
    @RequestMapping(value = "/createBrand", method = {RequestMethod.POST})
    public ResponseEntity<ResultVm> createApplication(@RequestBody Brand brand, HttpServletRequest request) {
        ResultVm vm = new ResultVm();
        try {
            vm.setResultSet(applicationService.createApplication(application, logDTO, registrant == 0 ? null : registrant));
            vm.addMessage("İşlem Başarılı");
            vm.setIsSuccess(true);
        } catch (Exception e) {
            vm.addMessage(e.getMessage());
        }
        return ResponseEntity.accepted().body(vm);
    }*/

}
