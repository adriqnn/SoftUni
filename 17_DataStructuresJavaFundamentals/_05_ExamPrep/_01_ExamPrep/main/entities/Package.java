package entities;

import java.util.Objects;

public class Package {
    private String id;
    private String receiver;
    private String address;
    private String phone;
    private double weight;

    public Package(String id, String receiver, String address, String phone, double weight) {
        this.id = id;
        this.receiver = receiver;
        this.address = address;
        this.phone = phone;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(aPackage.weight, weight) == 0 && Objects.equals(id, aPackage.id) && Objects.equals(receiver, aPackage.receiver) && Objects.equals(address, aPackage.address) && Objects.equals(phone, aPackage.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, receiver, address, phone, weight);
    }
}
