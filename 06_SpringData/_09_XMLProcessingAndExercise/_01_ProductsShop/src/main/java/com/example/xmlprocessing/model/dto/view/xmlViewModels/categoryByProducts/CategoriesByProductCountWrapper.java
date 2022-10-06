package com.example.xmlprocessing.model.dto.view.xmlViewModels.categoryByProducts;



import com.example.xmlprocessing.model.dto.view.jsonViewModels.CategoryByProductsCountViewModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "categories")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriesByProductCountWrapper {

    @XmlElement(name = "category")
    List<CategoryByProductsCountViewModel> viewModels;

    public CategoriesByProductCountWrapper() {
    }

    public List<CategoryByProductsCountViewModel> getViewModels() {
        return viewModels;
    }

    public CategoriesByProductCountWrapper setViewModels(List<CategoryByProductsCountViewModel> viewModels) {
        this.viewModels = viewModels;
        return this;
    }
}

