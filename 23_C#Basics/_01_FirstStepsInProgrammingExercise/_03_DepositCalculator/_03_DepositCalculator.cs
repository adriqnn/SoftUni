using System;

public class _03_DepositCalculator
{
    public static void Main(string[] args)
    {
        // Read input data
        double deposit = double.Parse(Console.ReadLine());
        int interestPeriod = int.Parse(Console.ReadLine());
        double interestRate = double.Parse(Console.ReadLine());

        // Calculate yearly and monthly interest
        double yearlyInterest = deposit * (interestRate * 1 / 100);
        double monthlyInterest = yearlyInterest / 12;

        // Calculate final deposit amount
        double finalDeposit = deposit + (monthlyInterest * interestPeriod);

        // Print the final deposit amount
        Console.WriteLine(finalDeposit);
    }
}
