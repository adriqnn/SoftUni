package _03_JavaAdvanced._06_DefiningClasses._03_BankAccount;

public class BankAccount {
    private static int accountsCount = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public  BankAccount(){
        this.id = accountsCount++;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterest (int years){
        return interestRate * years * balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return this.id;
    }
}
