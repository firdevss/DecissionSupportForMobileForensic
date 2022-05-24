package com.example.demo.dao;

import com.example.demo.dto.PieChartDTO;
import com.example.demo.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE phonedb.DEVICE SET FAILURE_ID = :failureId WHERE ID = :deviceId", nativeQuery = true)
    void addFailureId(@Param("failureId") Integer failureId, @Param("deviceId") Integer deviceId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE phonedb.DEVICE SET PROCESS_ID = :processId WHERE ID = :deviceId", nativeQuery = true)
    void addProcessId(@Param("processId") Integer processId, @Param("deviceId") Integer deviceId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE phonedb.DEVICE SET EVALUATION_ID = :evaluationId WHERE ID = :deviceId", nativeQuery = true)
    void addEvaluationId(@Param("evaluationId") Integer evaluationId, @Param("deviceId") Integer deviceId);

    @Query(value = "SELECT * FROM phonedb.device WHERE MODEL_ID =  :modelId", nativeQuery = true)
    List<Device> getDevicesByModelId(@Param("modelId") Integer modelId);

    @Query("Select st From Device st where st.failureId is null")
    List<Device> getAllDevicesNotAddFailure();

    @Query("Select st From Device st where st.failureId is null and st.modelId = :modelId")
    List<Device> getDevicesNotAddFailureByModelId(@Param("modelId") Integer modelId);

    @Query("Select st From Device st where st.failureId is not null and st.processId is null")
    List<Device> getAllDevicesAddedFailure();

    @Query("Select st From Device st where st.failureId is not null and st.processId is null and st.modelId = :modelId")
    List<Device> getDevicesAddedFailureByModelId(@Param("modelId") Integer modelId);

    @Query("Select st From Device st where st.processId is not null")
    List<Device> getAllDevicesAddedProcess();

    @Query("Select st From Device st where st.processId is not null and st.modelId = :modelId")
    List<Device> getDevicesAddedProcessByModelId(@Param("modelId") Integer modelId);

    @Query("SELECT COUNT(st) FROM Device st")
    Integer getAllDeviceNumber();

    @Query("SELECT COUNT(st) FROM Device st WHERE st.failureId is null")
    Integer getNotFailureDeviceNumber();

    @Query("SELECT COUNT(st) FROM Device st WHERE st.failureId is not null and st.processId is null")
    Integer getFailureDeviceNumber();

    @Query("SELECT COUNT(st) FROM Device st WHERE st.processId is not null")
    Integer getProcessDeviceNumber();

}
