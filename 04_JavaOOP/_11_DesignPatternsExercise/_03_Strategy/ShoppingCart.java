package _04_JavaOOP._11_DesignPatternsExercise._03_Strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        this.paymentStrategy.pay(amount);
    }
}
