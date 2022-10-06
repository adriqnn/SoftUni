package com.example.xmlprocessing.model.dto.viewModel.query1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerWrapper {

    @XmlElement(name = "customer")
    private List<CustomerViewModel> customers;

    public CustomerWrapper() {
    }

    public CustomerWrapper(List<CustomerViewModel> customers) {
        this.customers = customers;
    }

    public List<CustomerViewModel> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerViewModel> customers) {
        this.customers = customers;
    }
}
