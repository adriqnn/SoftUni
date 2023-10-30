package _04_JavaOOP._06_SOLID._02_OpenClosed;

// Concrete implementation of CartItem for services
class ServiceItem extends CartItem {
    private String description;
    private double cost;

    public ServiceItem(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public double calculatePrice() {
        return this.cost;
    }
}
