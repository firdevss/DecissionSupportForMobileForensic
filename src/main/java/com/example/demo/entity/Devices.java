package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "DEVICES", schema = "phonedb")
public class Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BRAND_ID")
    private Integer brandId;

    @Column(name = "BRAND")
    private String brandName;

    @Column(name = "NAME")
    private String modelName;

    @Column(name = "ANNOUNCED")
    private String announced;

    @Column(name = "AUDIO_JACK")
    private String audioJack;

    @Column(name = "BATTERY")
    private String battery;

    @Column(name = "BLUETOOTH")
    private String bluetooth;

    @Column(name = "CPU")
    private String cpu;

    @Column(name = "CHIPSET")
    private String chipSet;

    @Column(name = "COLORS")
    private String color;

    @Column(name = "DIMENSIONS")
    private String dimension;

    @Column(name = "DISPLAY_RESOLUTION")
    private String displayResolution;

    @Column(name = "DISPLAY_SIZE")
    private String displaySize;
    @Column(name = "DISPLAY_TYPE")
    private String displayType;

    @Column(name = "EDGE")
    private String edge;

    @Column(name = "FOURG")
    private String fourG;

    @Column(name = "GPRS")
    private String gprs;

    @Column(name = "GPS")
    private String gps;

    @Column(name = "GPU")
    private String gpu;

    @Column(name = "INTERNAL_MEMORY")
    private String internalMemory;

    @Column(name = "LOUD_SPEAKER")
    private String loudSpeaker;

    @Column(name = "MEMORY_CARD")
    private String memoryCard;

    @Column(name = "NFC")
    private String nfc;

    @Column(name = "NETWORK")
    private String network;

    @Column(name = "NETWORK_SPEED")
    private String networkSpeed;

    @Column(name = "OPERATING_SYSTEM")
    private String operatingSystem;

    @Column(name = "PRIMARY_CAMERA")
    private String primaryCamera;

    @Column(name = "RAM")
    private String ram;

    @Column(name = "RADIO")
    private String radio;

    @Column(name = "SIM")
    private String sim;

    @Column(name = "SECONDARY_CAMERA")
    private String secondaryCamera;

    @Column(name = "SENSORS")
    private String sensor;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "THREEG")
    private String threeG;

    @Column(name = "TWOG")
    private String twoG;

    @Column(name = "USB")
    private String usb;

    @Column(name = "WLAN")
    private String wlan;

    public Devices() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getAudioJack() {
        return audioJack;
    }

    public void setAudioJack(String audioJack) {
        this.audioJack = audioJack;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getChipSet() {
        return chipSet;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getEdge() {
        return edge;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    public String getFourG() {
        return fourG;
    }

    public void setFourG(String fourG) {
        this.fourG = fourG;
    }

    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public String getLoudSpeaker() {
        return loudSpeaker;
    }

    public void setLoudSpeaker(String loudSpeaker) {
        this.loudSpeaker = loudSpeaker;
    }

    public String getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(String memoryCard) {
        this.memoryCard = memoryCard;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetworkSpeed() {
        return networkSpeed;
    }

    public void setNetworkSpeed(String networkSpeed) {
        this.networkSpeed = networkSpeed;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(String primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getSecondaryCamera() {
        return secondaryCamera;
    }

    public void setSecondaryCamera(String secondaryCamera) {
        this.secondaryCamera = secondaryCamera;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThreeG() {
        return threeG;
    }

    public void setThreeG(String threeG) {
        this.threeG = threeG;
    }

    public String getTwoG() {
        return twoG;
    }

    public void setTwoG(String twoG) {
        this.twoG = twoG;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
