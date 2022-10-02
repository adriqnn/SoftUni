package _04_JavaOOP._06_SOLID._02_OpenClosed._03_ShoppingCart;

public class OrderItem {
    private String item;
    private int Quantity;

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
