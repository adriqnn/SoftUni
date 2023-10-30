package _04_JavaOOP._06_SOLID._02_OpenClosed;

// Concrete implementation of an in-store order
public class InStoreOrder extends Order {
    @Override
    public void checkout() {
        // Checkout process for in-store orders
        System.out.println("In-store checkout completed.");
    }
}
