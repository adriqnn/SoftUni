package com.example.jsonprocessing.model.dto.viewModel.query2;

import com.google.gson.annotations.Expose;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarDTO {

    @Expose
    @XmlAttribute
    private Long id;
    @Expose
    @XmlAttribute
    private String make;
    @Expose
    @XmlAttribute
    private String model;
    @Expose
    @XmlAttribute(name = "travelled-distance")
    private Long travelledDistance;

    public CarDTO() {
    }

    public CarDTO(Long id, String make, String model, Long travelledDistance) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.travelledDistance = travelledDistance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(Long travelledDistance) {
        this.travelledDistance = travelledDistance;
    }
}