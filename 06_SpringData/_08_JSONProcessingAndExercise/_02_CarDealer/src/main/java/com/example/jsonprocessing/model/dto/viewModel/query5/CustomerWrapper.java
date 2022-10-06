package com.example.jsonprocessing.model.dto.viewModel.query5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerWrapper {

    @XmlElement(name = "customer")
    private List<CustomerViewModel> customerViewModels;

    public CustomerWrapper() {
    }

    public CustomerWrapper(List<CustomerViewModel> customerViewModels) {
        this.customerViewModels = customerViewModels;
    }

    public List<CustomerViewModel> setCustomerViewModels() {
        return customerViewModels;
    }

    public void setCustomerViewModels(List<CustomerViewModel> customerViewModels) {
        this.customerViewModels = customerViewModels;
    }
}
