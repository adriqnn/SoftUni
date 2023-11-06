package _04_JavaOOP._11_DesignPatternsExercise._03_Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using credit card: " + this.cardNumber + " (Cardholder: " + this.name + ")");
    }
}
