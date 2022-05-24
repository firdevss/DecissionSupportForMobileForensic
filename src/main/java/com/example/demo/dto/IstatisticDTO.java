package com.example.demo.dto;

public class IstatisticDTO {
    private Integer allDevicesNumber;
    private Integer notFailureDevicesNumber;
    private Integer failureDevicesNumber;
    private Integer processDevicesNumber;

    public IstatisticDTO() {
    }

    public Integer getAllDevicesNumber() {
        return allDevicesNumber;
    }

    public void setAllDevicesNumber(Integer allDevicesNumber) {
        this.allDevicesNumber = allDevicesNumber;
    }

    public Integer getNotFailureDevicesNumber() {
        return notFailureDevicesNumber;
    }

    public void setNotFailureDevicesNumber(Integer notFailureDevicesNumber) {
        this.notFailureDevicesNumber = notFailureDevicesNumber;
    }

    public Integer getFailureDevicesNumber() {
        return failureDevicesNumber;
    }

    public void setFailureDevicesNumber(Integer failureDevicesNumber) {
        this.failureDevicesNumber = failureDevicesNumber;
    }

    public Integer getProcessDevicesNumber() {
        return processDevicesNumber;
    }

    public void setProcessDevicesNumber(Integer processDevicesNumber) {
        this.processDevicesNumber = processDevicesNumber;
    }
}
