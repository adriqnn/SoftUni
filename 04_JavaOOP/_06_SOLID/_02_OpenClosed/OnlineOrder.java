package _04_JavaOOP._06_SOLID._02_OpenClosed;

// Concrete implementation of an online order
class OnlineOrder extends Order {
    private String shippingAddress;

    public OnlineOrder(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void checkout() {
        // Checkout process for online orders
        System.out.println("Online order checkout completed. Shipping to: " + this.shippingAddress);
    }
}
