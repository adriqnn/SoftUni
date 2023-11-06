package _04_JavaOOP._11_DesignPatternsExercise._03_Strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " in cash");
    }
}
