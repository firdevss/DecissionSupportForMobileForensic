package com.example.demo.dto;

import java.util.List;

public class MultiColumnChartDTO {

    private List<PieChartDTO> category;
    private List<PieChartDTO> imaj;
    private List<PieChartDTO> notImaj;

    public MultiColumnChartDTO() {
    }

    public List<PieChartDTO> getCategory() {
        return category;
    }

    public void setCategory(List<PieChartDTO> category) {
        this.category = category;
    }

    public List<PieChartDTO> getImaj() {
        return imaj;
    }

    public void setImaj(List<PieChartDTO> imaj) {
        this.imaj = imaj;
    }

    public List<PieChartDTO> getNotImaj() {
        return notImaj;
    }

    public void setNotImaj(List<PieChartDTO> notImaj) {
        this.notImaj = notImaj;
    }
}
