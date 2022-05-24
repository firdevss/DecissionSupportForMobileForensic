package com.example.demo.service;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.dao.FailureRepository;
import com.example.demo.entity.Failure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class FailureService {

    @Autowired
    FailureRepository failureRepository;

    @Autowired
    DeviceRepository deviceRepository;

    @Modifying
    @Transactional
    public Failure createFailure(Failure failure) {
        Date currentDate = new Date();
        failure.setEnterDate(currentDate);
        Failure savedFailure = failureRepository.save(failure);
        deviceRepository.addFailureId(savedFailure.getId(), failure.getDeviceId());

        return savedFailure;
    }


}
