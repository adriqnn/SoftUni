package com.example.xmlprocessing.model.dto.view.xmlViewModels.productsInrangeModel;

import com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductInRangeWrapper {

    @XmlElement(name = "product")
    List<ProductInRangeViewModel> viewModels;

    public ProductInRangeWrapper() {
    }

    public List<ProductInRangeViewModel> getViewModels() {
        return viewModels;
    }

    public void setViewModels(List<ProductInRangeViewModel> viewModels) {
        this.viewModels = viewModels;
    }
}
