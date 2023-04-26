package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "evaluation", schema = "phonedb")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "step1Question1")
    private Integer step1Question1;

    @Column(name = "step1Question2")
    private Integer step1Question2;

    @Column(name = "step1Question3")
    private Integer step1Question3;

    @Column(name = "step1Question4")
    private Integer step1Question4;

    @Column(name = "step1Question5")
    private Integer step1Question5;

    @Column(name = "step2Question1")
    private Integer step2Question1;

    @Column(name = "step2Question2")
    private Integer step2Question2;

    @Column(name = "step2Question3")
    private Integer step2Question3;

    @Column(name = "step2Question4")
    private Integer step2Question4;

    @Column(name = "step2Question5")
    private Integer step2Question5;

    @Column(name = "step2Question6")
    private Integer step2Question6;

    @Column(name = "step3Question1")
    private Integer step3Question1;

    @Column(name = "step3Question2")
    private Integer step3Question2;

    @Column(name = "step3Question3")
    private Integer step3Question3;

    @Column(name = "step3Question4")
    private Integer step3Question4;

    @Column(name = "step3Question5")
    private Integer step3Question5;

    @Column(name = "step3Question6")
    private Integer step3Question6;

    @Column(name = "step3Question7")
    private Integer step3Question7;

    @Column(name = "step3Question8")
    private Integer step3Question8;
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

    public Integer getStep1Question1() {
        return step1Question1;
    }

    public void setStep1Question1(Integer step1Question1) {
        this.step1Question1 = step1Question1;
    }

    public Integer getStep1Question2() {
        return step1Question2;
    }

    public void setStep1Question2(Integer step1Question2) {
        this.step1Question2 = step1Question2;
    }

    public Integer getStep1Question3() {
        return step1Question3;
    }

    public void setStep1Question3(Integer step1Question3) {
        this.step1Question3 = step1Question3;
    }

    public Integer getStep1Question4() {
        return step1Question4;
    }

    public void setStep1Question4(Integer step1Question4) {
        this.step1Question4 = step1Question4;
    }

    public Integer getStep1Question5() {
        return step1Question5;
    }

    public void setStep1Question5(Integer step1Question5) {
        this.step1Question5 = step1Question5;
    }

    public Integer getStep2Question1() {
        return step2Question1;
    }

    public void setStep2Question1(Integer step2Question1) {
        this.step2Question1 = step2Question1;
    }

    public Integer getStep2Question2() {
        return step2Question2;
    }

    public void setStep2Question2(Integer step2Question2) {
        this.step2Question2 = step2Question2;
    }

    public Integer getStep2Question3() {
        return step2Question3;
    }

    public void setStep2Question3(Integer step2Question3) {
        this.step2Question3 = step2Question3;
    }

    public Integer getStep2Question4() {
        return step2Question4;
    }

    public void setStep2Question4(Integer step2Question4) {
        this.step2Question4 = step2Question4;
    }

    public Integer getStep2Question5() {
        return step2Question5;
    }

    public void setStep2Question5(Integer step2Question5) {
        this.step2Question5 = step2Question5;
    }

    public Integer getStep2Question6() {
        return step2Question6;
    }

    public void setStep2Question6(Integer step2Question6) {
        this.step2Question6 = step2Question6;
    }

    public Integer getStep3Question1() {
        return step3Question1;
    }

    public void setStep3Question1(Integer step3Question1) {
        this.step3Question1 = step3Question1;
    }

    public Integer getStep3Question2() {
        return step3Question2;
    }

    public void setStep3Question2(Integer step3Question2) {
        this.step3Question2 = step3Question2;
    }

    public Integer getStep3Question3() {
        return step3Question3;
    }

    public void setStep3Question3(Integer step3Question3) {
        this.step3Question3 = step3Question3;
    }

    public Integer getStep3Question4() {
        return step3Question4;
    }

    public void setStep3Question4(Integer step3Question4) {
        this.step3Question4 = step3Question4;
    }

    public Integer getStep3Question5() {
        return step3Question5;
    }

    public void setStep3Question5(Integer step3Question5) {
        this.step3Question5 = step3Question5;
    }

    public Integer getStep3Question6() {
        return step3Question6;
    }

    public void setStep3Question6(Integer step3Question6) {
        this.step3Question6 = step3Question6;
    }

    public Integer getStep3Question7() {
        return step3Question7;
    }

    public void setStep3Question7(Integer step3Question7) {
        this.step3Question7 = step3Question7;
    }

    public Integer getStep3Question8() {
        return step3Question8;
    }

    public void setStep3Question8(Integer step3Question8) {
        this.step3Question8 = step3Question8;
    }
}