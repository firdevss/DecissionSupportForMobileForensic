package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.dto.FilterDTO;
import com.example.demo.dto.IstatisticDTO;
import com.example.demo.dto.MultiColumnChartDTO;
import com.example.demo.dto.PieChartDTO;
import com.example.demo.entity.Process;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    ModelRepository modelRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    FailureRepository failureRepository;

    @Autowired
    ProcessRepository processRepository;

    @Autowired
    EvaluationRepository evaluationRepository;

    @Autowired
    DevicesRepository devicesRepository;

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public List<Device> getAllDevicesNotAddFailure() {
        return deviceRepository.getAllDevicesNotAddFailure();
    }

    public List<Device> getDevicesNotAddFailureByModelId(Integer modelId) {
        return deviceRepository.getDevicesNotAddFailureByModelId(modelId);
    }

    public List<Device> getAllDevicesAddedFailure() {
        List<Device> deviceList = deviceRepository.getAllDevicesAddedFailure();

        for (Device device : deviceList) {
            if (device.getFailureId() != null) {
                Failure failure = failureRepository.findById(device.getFailureId()).get();
                device.setFailure(failure);
            }
        }

        return deviceList;
    }

    public List<Device> getDevicesAddedFailureByModelId(Integer modelId) {
        List<Device> deviceList = deviceRepository.getDevicesAddedFailureByModelId(modelId);

        for (Device device : deviceList) {
            if (device.getFailureId() != null) {
                Failure failure = failureRepository.findById(device.getFailureId()).get();
                device.setFailure(failure);
            }
        }

        return deviceList;
    }

    public List<Device> getAllDevicesAddedProcess() {
        List<Device> deviceList = deviceRepository.getAllDevicesAddedProcess();

        for (Device device : deviceList) {
            if (device.getProcessId() != null) {
                Process process = processRepository.findById(device.getProcessId()).get();
                device.setProcess(process);
            }
            if (device.getFailureId() != null) {
                Failure failure = failureRepository.findById(device.getFailureId()).get();
                device.setFailure(failure);
            }
            if (device.getEvaluationId() != null) {
                Evaluation evaluation = evaluationRepository.findById(device.getEvaluationId()).get();
                device.setEvaluation(evaluation);
            }
        }

        return deviceList;
    }

    //oguzhan
    public List<Device> getAllDevicesAddedProcessByID(Integer processId) {
        List<Device> deviceList = deviceRepository.getAllDevicesAddedProcess();

        for (Device device : deviceList) {
            if (device.getProcessId() != null) {
                Process process = processRepository.findById(processId).get();
                device.setProcess(process);
            }
        }

        return deviceList;
    }


    public List<Device> getDevicesAddedProcessByModelId(Integer modelId) {
        List<Device> deviceList = deviceRepository.getDevicesAddedProcessByModelId(modelId);

        for (Device device : deviceList) {
            if (device.getProcessId() != null) {
                Process process = processRepository.findById(device.getProcessId()).get();
                device.setProcess(process);
            }
        }

        return deviceList;
    }

    public IstatisticDTO getIstatistics() {
        IstatisticDTO istatisticDTO = new IstatisticDTO();

        istatisticDTO.setAllDevicesNumber(deviceRepository.getAllDeviceNumber());
        istatisticDTO.setNotFailureDevicesNumber(deviceRepository.getNotFailureDeviceNumber());
        istatisticDTO.setFailureDevicesNumber(deviceRepository.getFailureDeviceNumber());
        istatisticDTO.setProcessDevicesNumber(deviceRepository.getProcessDeviceNumber());

        return istatisticDTO;
    }

    @Modifying
    @Transactional
    public Device createDevice(Device device) {
        String brandName = brandRepository.getBrandNameById(device.getBrandId());
        String modelName = modelRepository.getModelNameById(device.getModelId());
        if (((device.getBrandId() != null) && (device.getModelId()) != null)) {
            device.setBrandName(brandName);
            device.setModelName(modelName);
        } else {
            device.setBrandName(device.getBrandName());
            device.setModelName(device.getModelName());

            Brand brand = new Brand();
            brand.setName(device.getBrandName());
            Brand saveBrand = brandRepository.save(brand);

            Model model = new Model();
            model.setName(device.getModelName());
            model.setBrandId(saveBrand.getId().toString());
            Model saveModel = modelRepository.save(model);

            Devices devices = new Devices();
            devices.setBrandId(saveBrand.getId());
            devices.setBrandName(device.getBrandName());
            devices.setModelName(device.getModelName());
            devices.setAnnounced(device.getAnnounced());
            devices.setAudioJack(device.getAudioJack());
            devices.setBattery(device.getBattery());
            devices.setBluetooth(device.getBluetooth());
            devices.setChipSet(device.getChipSet());
            devices.setColor(device.getColor());
            devices.setCpu(device.getCpu());
            devices.setDimension(device.getDimension());
            devices.setDisplayResolution(device.getDisplayResolution());
            devices.setDisplaySize(device.getDisplaySize());
            devices.setDisplayType(device.getDisplayType());
            devices.setEdge(device.getEdge());
            devices.setFourG(device.getFourG());
            devices.setGprs(device.getGprs());
            devices.setInternalMemory(device.getInternalMemory());
            devices.setLoudSpeaker(device.getLoudSpeaker());
            devices.setMemoryCard(device.getMemoryCard());
            devices.setNetworkSpeed(device.getNetworkSpeed());
            devices.setNfc(device.getNfc());
            devices.setOperatingSystem(device.getOperatingSystem());
            devices.setPrimaryCamera(device.getPrimaryCamera());
            devices.setRadio(device.getRadio());
            devices.setRam(device.getRam());
            devices.setSensor(device.getSensor());
            devices.setSim(device.getSim());
            devices.setStatus(device.getStatus());
            devices.setThreeG(device.getThreeG());
            devices.setThreeG(device.getThreeG());
            devices.setSecondaryCamera(device.getSecondaryCamera());
            devices.setTwoG(device.getTwoG());
            devices.setGps(device.getGps());
            devices.setUsb(device.getUsb());
            devices.setWlan(device.getWlan());
            devices.setGpu(device.getGpu());
            devices.setNetwork(device.getNetwork());
            devicesRepository.save(devices);
        }

        return deviceRepository.save(device);
    }

    @Modifying
    @Transactional
    public String deleteDevice(Integer deviceId) {
        failureRepository.deleteFailureByDeviceId(deviceId);
        processRepository.deleteProcessByDeviceId(deviceId);
        deviceRepository.deleteById(deviceId);
        return "Silme İşlemi Başarılı";
    }

    public FilterDTO getDevicesByModelId(Integer modelId) {
        FilterDTO filterDTO = new FilterDTO();
        filterDTO.setDataAddedFailure(getDevicesAddedFailureByModelId(modelId));
        filterDTO.setDataNotAddFailure(getDevicesNotAddFailureByModelId(modelId));
        filterDTO.setDataAddedProcess(getDevicesAddedProcessByModelId(modelId));

        return filterDTO;
    }

    public MultiColumnChartDTO getMultiColumnChartDatas() {
        MultiColumnChartDTO multiColumnChartDTO = new MultiColumnChartDTO();

        String sql = "SELECT DISTINCT BRAND_NAME AS label FROM phonedb.device";
        List<PieChartDTO> categoryList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<PieChartDTO>(PieChartDTO.class));


        List<PieChartDTO> imajList = new ArrayList<PieChartDTO>();
        List<PieChartDTO> notImajList = new ArrayList<PieChartDTO>();
        for (PieChartDTO category : categoryList) {
            String sqlImaj = "SELECT count(*) as value \n" +
                    "FROM phonedb.device as d\n" +
                    "LEFT JOIN phonedb.process as p\n" +
                    "ON d.PROCESS_ID = p.ID\n" +
                    "where BRAND_NAME = '" + category.getLabel() + "' and IMAJ = 'Imaj Alınamadı'";
            List<PieChartDTO> tempImajList = jdbcTemplate.query(sqlImaj, new BeanPropertyRowMapper<PieChartDTO>(PieChartDTO.class));
            imajList.add(tempImajList.get(0));

            String sqlNotImaj = "SELECT count(*) as value \n" +
                    "FROM phonedb.device as d\n" +
                    "LEFT JOIN phonedb.process as p\n" +
                    "ON d.PROCESS_ID = p.ID\n" +
                    "where BRAND_NAME = '" + category.getLabel() + "' and IMAJ <> 'Imaj Alınamadı'";
            List<PieChartDTO> tempNotImajList = jdbcTemplate.query(sqlNotImaj, new BeanPropertyRowMapper<PieChartDTO>(PieChartDTO.class));
            notImajList.add(tempNotImajList.get(0));
        }

        multiColumnChartDTO.setCategory(categoryList);
        multiColumnChartDTO.setImaj(imajList);
        multiColumnChartDTO.setNotImaj(notImajList);

        return multiColumnChartDTO;
    }

}
