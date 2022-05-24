package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PROCESS", schema = "phonedb")
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DEVICE_ID")
    private Integer deviceId;

    @Column(name = "SCREEN_CHANGE")
    private Integer screenChange;

    @Column(name = "PORT_CHANGE")
    private Integer portChange;

    @Column(name = "BATTERY_CHANGE")
    private Integer batteryChange;

    @Column(name = "BASIC_REPAIR")
    private Integer basicRepair;

    @Column(name = "JTAG")
    private Integer jTag;

    @Column(name = "CHIPOFF")
    private Integer chipOff;

    @Column(name = "ROOT")
    private Integer root;

    @Column(name = "TWRP")
    private Integer twrp;

    @Column(name = "XRY")
    private Integer xry;

    @Column(name = "UFED")
    private Integer ufed;

    @Column(name = "OXYGEN")
    private Integer oxygen;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "XRY_DESCRIPTION")
    private String xryDescription;

    @Column(name = "UFED_DESCRIPTION")
    private String ufedDescription;

    @Column(name = "OXYGEN_DESCRIPTION")
    private String oxygenDescription;

    @Column(name = "IMAJ")
    private String imaj;

    @Column(name = "ENTER_PERSON")
    private String enterPerson;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Europe/Istanbul")
    @Column(name = "ENTER_DATE")
    private Date enterDate;

    public Process() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScreenChange() {
        return screenChange;
    }

    public void setScreenChange(Integer screenChange) {
        this.screenChange = screenChange;
    }

    public Integer getPortChange() {
        return portChange;
    }

    public void setPortChange(Integer portChange) {
        this.portChange = portChange;
    }

    public Integer getBatteryChange() {
        return batteryChange;
    }

    public void setBatteryChange(Integer batteryChange) {
        this.batteryChange = batteryChange;
    }

    public Integer getBasicRepair() {
        return basicRepair;
    }

    public void setBasicRepair(Integer basicRepair) {
        this.basicRepair = basicRepair;
    }

    public Integer getjTag() {
        return jTag;
    }

    public void setjTag(Integer jTag) {
        this.jTag = jTag;
    }

    public Integer getChipOff() {
        return chipOff;
    }

    public void setChipOff(Integer chipOff) {
        this.chipOff = chipOff;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Integer getTwrp() {
        return twrp;
    }

    public void setTwrp(Integer twrp) {
        this.twrp = twrp;
    }

    public Integer getXry() {
        return xry;
    }

    public void setXry(Integer xry) {
        this.xry = xry;
    }

    public Integer getUfed() {
        return ufed;
    }

    public void setUfed(Integer ufed) {
        this.ufed = ufed;
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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getOxygen() {
        return oxygen;
    }

    public void setOxygen(Integer oxygen) {
        this.oxygen = oxygen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getXryDescription() {
        return xryDescription;
    }

    public void setXryDescription(String xryDescription) {
        this.xryDescription = xryDescription;
    }

    public String getUfedDescription() {
        return ufedDescription;
    }

    public void setUfedDescription(String ufedDescription) {
        this.ufedDescription = ufedDescription;
    }

    public String getOxygenDescription() {
        return oxygenDescription;
    }

    public void setOxygenDescription(String oxygenDescription) {
        this.oxygenDescription = oxygenDescription;
    }

    public String getImaj() {
        return imaj;
    }

    public void setImaj(String imaj) {
        this.imaj = imaj;
    }
}
