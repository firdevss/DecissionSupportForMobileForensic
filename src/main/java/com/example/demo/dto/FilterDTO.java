package com.example.demo.dto;

import com.example.demo.entity.Device;

import java.util.List;

public class FilterDTO {
    private List<Device> dataNotAddFailure;
    private List<Device> dataAddedFailure;
    private List<Device> dataAddedProcess;

    public FilterDTO() {
    }

    public List<Device> getDataNotAddFailure() {
        return dataNotAddFailure;
    }

    public void setDataNotAddFailure(List<Device> dataNotAddFailure) {
        this.dataNotAddFailure = dataNotAddFailure;
    }

    public List<Device> getDataAddedFailure() {
        return dataAddedFailure;
    }

    public void setDataAddedFailure(List<Device> dataAddedFailure) {
        this.dataAddedFailure = dataAddedFailure;
    }

    public List<Device> getDataAddedProcess() {
        return dataAddedProcess;
    }

    public void setDataAddedProcess(List<Device> dataAddedProcess) {
        this.dataAddedProcess = dataAddedProcess;
    }
}
