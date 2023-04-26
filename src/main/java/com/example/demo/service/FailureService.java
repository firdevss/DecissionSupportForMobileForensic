package com.example.demo.service;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.dao.FailureRepository;
import com.example.demo.dto.PieChartDTO;
import com.example.demo.entity.Failure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class FailureService {

    @Autowired
    FailureRepository failureRepository;

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Modifying
    @Transactional
    public Failure createFailure(Failure failure) {
        Date currentDate = new Date();
        failure.setEnterDate(currentDate);
        Failure savedFailure = failureRepository.save(failure);
        deviceRepository.addFailureId(savedFailure.getId(), failure.getDeviceId());

        return savedFailure;
    }

    public List<PieChartDTO> getFailureBarChart() {
        String sql = "SELECT ENTER_PERSON as label, count(*) as value FROM phonedb.failure \n" +
                "where ENTER_PERSON <> '' GROUP BY ENTER_PERSON;";
        List<PieChartDTO> pieChartDTO = jdbcTemplate.query(sql, new BeanPropertyRowMapper<PieChartDTO>(PieChartDTO.class));
        return pieChartDTO;
    }

}
