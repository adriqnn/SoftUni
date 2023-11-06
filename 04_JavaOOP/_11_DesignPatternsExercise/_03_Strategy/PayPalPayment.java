package _04_JavaOOP._11_DesignPatternsExercise._03_Strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal (Email: " + email + ")");
    }
}
