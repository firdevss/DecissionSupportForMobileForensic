package com.example.demo.service;
import com.example.demo.dao.VeriRepository;
import com.example.demo.entity.Veri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class VeriService {

    @Autowired
    VeriRepository veriRepository;

    public List<Veri> getVeriForModel(Veri veri) {
        String modelName = veri.getModelName();
        List<Veri> byModelName = veriRepository.getByModelName(modelName);
        if (byModelName.size() <= 0) {
            String brandName = veri.getBrandName();
            byModelName = veriRepository.findVeriByBrandName(brandName);
        }

        return byModelName;
    }

}