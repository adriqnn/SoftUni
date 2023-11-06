package _04_JavaOOP._11_DesignPatternsExercise._03_Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Select the payment method
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com");
        PaymentStrategy cashPayment = new CashPayment();

        // Use the selected payment method to checkout
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);

        cart.setPaymentStrategy(cashPayment);
        cart.checkout(30);
    }
}
