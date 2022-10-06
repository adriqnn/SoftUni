package com.example.jsonprocessing.model.dto.bindingModel.dtos;

import com.google.gson.annotations.Expose;

public class SaleDTO {

    @Expose
    private Long id;

    public SaleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
