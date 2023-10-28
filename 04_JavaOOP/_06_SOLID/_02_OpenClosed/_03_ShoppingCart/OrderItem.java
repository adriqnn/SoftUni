package _04_JavaOOP._06_SOLID._02_OpenClosed._03_ShoppingCart;

public class OrderItem {
    private String item;
    private int quantity;

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
