package _04_JavaOOP._06_SOLID._02_OpenClosed._03_ShoppingCart;

public abstract class Order {
    protected final Cart cart;

    protected Order(Cart cart) {
        this.cart = cart;
    }
    
    void chekout(){
        //log the order in the p03_Database
    }
}
