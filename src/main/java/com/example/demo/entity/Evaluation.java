package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "evaluation", schema = "phonedb")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "KULLANIMI_KOLAY_MI")
    private Integer usefull;
    @Column(name = "ANLASILIR_MI")
    private Integer understandable;
    @Column(name = "SONUCA_FAYDALI_MI")
    private Integer usefullForResult;
    @Column(name = "ACIKLAMA")
    private String evaluationDescription;
    @Column(name = "DEVICE_ID")
    private Integer deviceId;
    @Column(name = "ENTER_PERSON")
    private String enterPerson;
    @Column(name = "duration")
    private String duration;
    
    public Evaluation() {
    }

    public String getEnterPerson() {
        return enterPerson;
    }

    public void setEnterPerson(String enterPerson) {
        this.enterPerson = enterPerson;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsefull() {
        return usefull;
    }

    public void setUsefull(Integer usefull) {
        this.usefull = usefull;
    }

    public Integer getUnderstandable() {
        return understandable;
    }

    public void setUnderstandable(Integer understandable) {
        this.understandable = understandable;
    }

    public Integer getUsefullForResult() {
        return usefullForResult;
    }

    public void setUsefullForResult(Integer usefullForResult) {
        this.usefullForResult = usefullForResult;
    }

    public String getEvaluationDescription() {
        return evaluationDescription;
    }

    public void setEvaluationDescription(String evaluationDescription) {
        this.evaluationDescription = evaluationDescription;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}