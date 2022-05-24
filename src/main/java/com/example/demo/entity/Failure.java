package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FAILURE", schema = "phonedb")
public class Failure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DEVICE_ID")
    private Integer deviceId;

    @Column(name = "ENCRYPTED")
    private Integer encrypted;

    @Column(name = "FULLY_DAMAGED")
    private Integer fullyDamaged;

    @Column(name = "MOTHERBOARD_FAILURE")
    private Integer motherboardFailure;

    @Column(name = "PORT_FAILURE")
    private Integer portFailure;

    @Column(name = "SCREEN_FAILURE")
    private Integer screenFailure;

    @Column(name = "SOFTWARE_FAILURE")
    private Integer softwareFailure;

    @Column(name = "ROOT_NEED")
    private Integer rootNeed;

    @Column(name = "ENTER_PERSON")
    private String enterPerson;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Europe/Istanbul")
    @Column(name = "ENTER_DATE")
    private Date enterDate;

    public Failure() {
    }

    public Integer getRootNeed() {
        return rootNeed;
    }

    public void setRootNeed(Integer rootNeed) {
        this.rootNeed = rootNeed;
    }

    public Integer getId() {
        return id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Integer encrypted) {
        this.encrypted = encrypted;
    }

    public Integer getFullyDamaged() {
        return fullyDamaged;
    }

    public void setFullyDamaged(Integer fullyDamaged) {
        this.fullyDamaged = fullyDamaged;
    }

    public Integer getMotherboardFailure() {
        return motherboardFailure;
    }

    public void setMotherboardFailure(Integer motherboardFailure) {
        this.motherboardFailure = motherboardFailure;
    }

    public Integer getPortFailure() {
        return portFailure;
    }

    public void setPortFailure(Integer portFailure) {
        this.portFailure = portFailure;
    }

    public Integer getScreenFailure() {
        return screenFailure;
    }

    public void setScreenFailure(Integer screenFailure) {
        this.screenFailure = screenFailure;
    }

    public Integer getSoftwareFailure() {
        return softwareFailure;
    }

    public void setSoftwareFailure(Integer softwareFailure) {
        this.softwareFailure = softwareFailure;
    }

    public String getEnterPerson() {
        return enterPerson;
    }

    public void setEnterPerson(String enterPerson) {
        this.enterPerson = enterPerson;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }
}
