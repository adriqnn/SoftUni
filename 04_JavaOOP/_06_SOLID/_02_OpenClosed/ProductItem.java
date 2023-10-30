package _04_JavaOOP._06_SOLID._02_OpenClosed;

// Concrete implementation of CartItem for products
class ProductItem extends CartItem {
    private String name;
    private double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
