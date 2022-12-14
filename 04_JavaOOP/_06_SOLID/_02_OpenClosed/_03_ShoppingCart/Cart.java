package _04_JavaOOP._06_SOLID._02_OpenClosed._03_ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<OrderItem> items;

    public String customerEmail;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Iterable<OrderItem> getItems() {
        return new ArrayList<OrderItem>(this.items);
    }


    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void add(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public double getTotalAmount() {
        double total = 0;

        for(var item : this.items)
        {
            if (item.getItem().startsWith("EACH")) {
                total += item.getQuantity() * 5.0;
            } else if (item.getItem().startsWith("WEIGHT")) {
                // quantity is in grams, price is per kg
                total += item.getQuantity() * 4.0 / 1000;
            } else if (item.getItem().startsWith("SPECIAL")) {
                // $0.40 each; 3 for $1.00
                total += item.getQuantity() * 4.0;
                int setsOfThree = item.getQuantity() / 3;
                total -= setsOfThree * 2.0;
            }

            // more rules are coming!
        }

        return total;
    }
}