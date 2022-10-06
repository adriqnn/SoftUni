package com.example.xmlprocessing.model.dto.viewModel.query6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "sales")
@XmlAccessorType(XmlAccessType.FIELD)
public class SaleWrapper {

    @XmlElement(name = "sale")
    private List<SaleViewModel> saleViewModels;

    public SaleWrapper() {
    }

    public SaleWrapper(List<SaleViewModel> saleViewModels) {
        this.saleViewModels = saleViewModels;
    }

    public List<SaleViewModel> getSaleViewModels() {
        return saleViewModels;
    }

    public void setSaleViewModels(List<SaleViewModel> saleViewModels) {
        this.saleViewModels = saleViewModels;
    }
}