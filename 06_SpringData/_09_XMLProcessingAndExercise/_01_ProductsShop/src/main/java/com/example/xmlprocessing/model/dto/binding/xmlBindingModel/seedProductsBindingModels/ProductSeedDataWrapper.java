package com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductSeedDataWrapper {

    @XmlElement(name = "product")
    List<ProductSeedDataDTO> productDTOs;

    public ProductSeedDataWrapper() {
    }

    public List<ProductSeedDataDTO> getProductDTOs() {
        return productDTOs;
    }

    public void setProductDTOs(List<ProductSeedDataDTO> productDTOs) {
        this.productDTOs = productDTOs;
    }
}
