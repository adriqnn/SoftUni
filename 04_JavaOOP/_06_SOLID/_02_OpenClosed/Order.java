package _04_JavaOOP._06_SOLID._02_OpenClosed;

import java.util.ArrayList;
import java.util.List;

// Abstract class for processing orders
abstract class Order {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addItem(CartItem item) {
        this.cartItems.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0.0;

        for (CartItem item : this.cartItems) {
            total += item.calculatePrice();
        }

        return total;
    }

    public abstract void checkout();
}
