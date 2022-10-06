package com.example.jsonprocessing.model.dto.viewModel.query3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "suppliers")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocalSupplierWrapper {

    @XmlElement(name = "supplier")
    private List<LocalSupplierDTO> supplierDTOs;

    public LocalSupplierWrapper() {
    }

    public LocalSupplierWrapper(List<LocalSupplierDTO> supplierDTOs) {
        this.supplierDTOs = supplierDTOs;
    }

    public List<LocalSupplierDTO> getSupplierDTOs() {
        return supplierDTOs;
    }

    public void setSupplierDTOs(List<LocalSupplierDTO> supplierDTOs) {
        this.supplierDTOs = supplierDTOs;
    }
}
