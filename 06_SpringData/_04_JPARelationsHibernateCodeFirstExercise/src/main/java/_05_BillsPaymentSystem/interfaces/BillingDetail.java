package _05_BillsPaymentSystem.interfaces;


import _05_BillsPaymentSystem.entities.User;

public interface BillingDetail {

    String getNumber();
    User getOwner();
}
