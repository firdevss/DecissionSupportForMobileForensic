package com.example.demo.service;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.dao.ProcessRepository;
import com.example.demo.dto.PieChartDTO;
import com.example.demo.entity.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProcessService {

    @Autowired
    ProcessRepository processRepository;

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Modifying
    @Transactional
    public Process createProcess(Process process) {
        Date currentDate = new Date();
        process.setEnterDate(currentDate);
        Process savedProcess = processRepository.save(process);
        deviceRepository.addProcessId(savedProcess.getId(), process.getDeviceId());

        return savedProcess;
    }

    public List<PieChartDTO> getPieChart() {
        List<PieChartDTO> pieChartDTOList = new ArrayList<PieChartDTO>();
        PieChartDTO pieChartDTO = new PieChartDTO();
        pieChartDTO.setLabel("Imaj Alınamadı");
        pieChartDTO.setValue(processRepository.imajNotTakeCount().toString());
        PieChartDTO pieChartDTO2 = new PieChartDTO();
        pieChartDTO2.setLabel("Imaj Alındı");
        Integer imageAlindi = processRepository.imajCount() - processRepository.imajNotTakeCount();
        pieChartDTO2.setValue(imageAlindi.toString());
        pieChartDTOList.add(pieChartDTO);
        pieChartDTOList.add(pieChartDTO2);
        return pieChartDTOList;
    }

    public List<PieChartDTO> getProcessBarChart() {
        String sql = "SELECT ENTER_PERSON as label, count(*) as value FROM phonedb.process \n" +
                "where ENTER_PERSON <> '' GROUP BY ENTER_PERSON;";
        List<PieChartDTO> pieChartDTO = jdbcTemplate.query(sql, new BeanPropertyRowMapper<PieChartDTO>(PieChartDTO.class));
        return pieChartDTO;
    }

}
