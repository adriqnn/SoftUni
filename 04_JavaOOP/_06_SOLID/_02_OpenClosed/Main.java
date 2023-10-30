package _04_JavaOOP._06_SOLID._02_OpenClosed;

public class Main {
    public static void main(String[] args) {
        // Open Closed example

        // Creating items and orders
        CartItem productItem = new ProductItem("Laptop", 1000.0);
        CartItem serviceItem = new ServiceItem("Software Installation", 50.0);

        Order inStoreOrder = new InStoreOrder();
        Order onlineOrder = new OnlineOrder("123 Main St, City");

        inStoreOrder.addItem(productItem);
        inStoreOrder.addItem(serviceItem);

        onlineOrder.addItem(productItem);

        // Calculate and display total prices
        System.out.println("Total Price for In-Store Order: $" + inStoreOrder.calculateTotalPrice());
        inStoreOrder.checkout();

        System.out.println("Total Price for Online Order: $" + onlineOrder.calculateTotalPrice());
        onlineOrder.checkout();
    }
}
