package com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedCategoriesBindingModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "categories")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategorySeedDataWrapper {

    @XmlElement(name = "category")
    List<CategorySeedDataDTO> categories;

    public CategorySeedDataWrapper() {
    }

    public List<CategorySeedDataDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategorySeedDataDTO> categories) {
        this.categories = categories;
    }
}
