package com.example.springdataautomappingobjects.model.dto.binding;

import java.math.BigDecimal;
import java.util.Date;

public class AddGameBindingModel {

    private String title;
    private BigDecimal price;
    private Double size;
    private String youtubeId;
    private String imageUrl;
    private String description;
    private Date releaseDate;

    public AddGameBindingModel() {
    }

    public AddGameBindingModel(String title, BigDecimal price, Double size, String youtubeId, String imageUrl, String description, Date releaseDate) {
        this.title = title;
        this.price = price;
        this.size = size;
        this.youtubeId = youtubeId;
        this.imageUrl = imageUrl;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
