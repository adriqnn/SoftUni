package com.example.jsonprocessing.model.dto.viewModel.query2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarWrapper {

    @XmlElement(name = "car")
    private List<CarDTO> carDTOs;

    public CarWrapper() {
    }

    public CarWrapper(List<CarDTO> carDTOs) {
        this.carDTOs = carDTOs;
    }

    public List<CarDTO> getCarDTOs() {
        return carDTOs;
    }

    public void setCarDTOs(List<CarDTO> carDtos) {
        this.carDTOs = carDtos;
    }
}
