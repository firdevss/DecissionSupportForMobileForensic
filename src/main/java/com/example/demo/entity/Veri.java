package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "data", schema = "phonedb")
public class Veri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATA_ID")
    private Integer id;

    @Column(name = "CIHAZIN_MARKASI")
    private String brandName;

    @Column(name = "CIHAZIN_MODELI")
    private String modelName;

    @Column(name = "SONUC")
    private String result;

    @Column(name = "SURE")
    private String time;

    @Column(name = "ISLEM_YAPAN")
    private String personnel;

    @Column(name = "ISLETIM_SISTEMI_SURUMU")
    private String operatingSystem;
    @Column(name = "HAFIZA_CIPI_MARKASI")
    private String chipSet;
    @Column(name = "CIHAZ_SIFRELIMI")
    private String encrypted;
    @Column(name = "EKRAN_ARIZASI_VAR_MI")
    private String screenFailure;
    @Column(name = "PORT_ARIZASI_VAR_MI")
    private String portFailure;
    @Column(name = "ANAKART_ARIZASI_VAR_MI")
    private String motherboardFailure;
    @Column(name = "CIHAZ_PARCALANMIS_MI")
    private String fullyDamaged;
    @Column(name = "YAZILIMSAL_ARIZA_VAR_MI")
    private String softwareFailure;
    @Column(name = "ROOT_IHTIYACI_VAR_MI")
    private String rootNeed;
    @Column(name = "PORT_DEGISIMI")
    private String portChange;
    @Column(name = "BATARYA_DEGISIMI")
    private String batteryChange;
    @Column(name = "EKRAN_DEGISIMI")
    private String screenChange;
    @Column(name = "BASIT_TAMIR")
    private String basicRepair;
    @Column(name = "J_TAG")
    private String jTag;
    @Column(name = "CHIP_OFF")
    private String chipOff;
    @Column(name = "ROOT")
    private String root;
    @Column(name = "TWRP_CVM_KURULUMU")
    private String twrp;
    @Column(name = "XRY")
    private String xry;
    @Column(name = "XRY_ILE_KULLANILAN_YONTEM")
    private String xryDescription;
    @Column(name = "UFED")
    private String ufed;
    @Column(name = "UFED_ILE_KULLANILAN_YONTEM")
    private String ufedDescription;
    @Column(name = "DIGER_ADLI_BILISIM_YAZILIMLARI")
    private String otherSoftware;
    @Column(name = "SIFRE_KIRMAYA_YONELIK_ISLEM")
    private String otherSoftwareDescription;

    public Veri() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPersonnel() {
        return personnel.substring(1,4);
    }
    public void setPersonnel(String personnel) {
        this.personnel = personnel.substring(1,4);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getChipSet() {
        return chipSet;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    public String getScreenFailure() {
        return screenFailure;
    }

    public void setScreenFailure(String screenFailure) {
        this.screenFailure = screenFailure;
    }

    public String getPortFailure() {
        return portFailure;
    }

    public void setPortFailure(String portFailure) {
        this.portFailure = portFailure;
    }

    public String getMotherboardFailure() {
        return motherboardFailure;
    }

    public void setMotherboardFailure(String motherboardFailure) {
        this.motherboardFailure = motherboardFailure;
    }

    public String getFullyDamaged() {
        return fullyDamaged;
    }

    public void setFullyDamaged(String fullyDamaged) {
        this.fullyDamaged = fullyDamaged;
    }

    public String getSoftwareFailure() {
        return softwareFailure;
    }

    public void setSoftwareFailure(String softwareFailure) {
        this.softwareFailure = softwareFailure;
    }

    public String getRootNeed() {
        return rootNeed;
    }

    public void setRootNeed(String rootNeed) {
        this.rootNeed = rootNeed;
    }
/*
    public String getPortChange() {
        return portChange;
    }

    public void setPortChange(String portChange) {
        this.portChange = portChange;
    }

    public String getBatteryChange() {
        return batteryChange;
    }

    public void setBatteryChange(String batteryChange) {
        this.batteryChange = batteryChange;
    }

    public String getScreenChange() {
        return screenChange;
    }

    public void setScreenChange(String screenChange) {
        this.screenChange = screenChange;
    }

    public String getBasicRepair() {
        return basicRepair;
    }

    public void setBasicRepair(String basicRepair) {
        this.basicRepair = basicRepair;
    }

    public String getjTag() {
        return jTag;
    }

    public void setjTag(String jTag) {
        this.jTag = jTag;
    }

    public String getChipOff() {
        return chipOff;
    }

    public void setChipOff(String chipOff) {
        this.chipOff = chipOff;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getTwrp() {
        return twrp;
    }

    public void setTwrp(String twrp) {
        this.twrp = twrp;
    }

    public String getXry() {
        return xry;
    }

    public void setXry(String xry) {
        this.xry = xry;
    }

    public String getXryDescription() {
        return xryDescription;
    }

    public void setXryDescription(String xryDescription) {
        this.xryDescription = xryDescription;
    }

    public String getUfed() {
        return ufed;
    }

    public void setUfed(String ufed) {
        this.ufed = ufed;
    }

    public String getUfedDescription() {
        return ufedDescription;
    }

    public void setUfedDescription(String ufedDescription) {
        this.ufedDescription = ufedDescription;
    }

    public String getOtherSoftware() {
        return otherSoftware;
    }

    public void setOtherSoftware(String otherSoftware) {
        this.otherSoftware = otherSoftware;
    }

    public String getOtherSoftwareDescription() {
        return otherSoftwareDescription;
    }

    public void setOtherSoftwareDescription(String otherSoftwareDescription) {
        this.otherSoftwareDescription = otherSoftwareDescription;
    }*/
}
