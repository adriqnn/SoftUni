package _04_JavaOOP._06_SOLID._02_OpenClosed;

// Abstract class for items that can be added to the cart
public abstract class CartItem {
    // subclasses are forced to implement the method
    public abstract double calculatePrice();
}
