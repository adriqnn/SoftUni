package _04_JavaOOP._10_TestDrivenDevelopmentExercise.main.java;

public interface Transaction {
    int getId();
    TransactionStatus getStatus();
    void setStatus(TransactionStatus transactionStatus);
    double getAmount();
    String getFrom();
}
