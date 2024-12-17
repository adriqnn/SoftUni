using System;

public class _05_AccountBalance
{
    public static void Main(string[] args)
    {
        // Read input value
        string command = Console.ReadLine();

        // Initialize the account balance
        double accountBalance = 0;

        while (!command.Equals("NoMoreMoney"))
        {
            double deposit = double.Parse(command);

            // Exit the loop if the amount is invalid
            if (deposit < 0)
            {
                Console.WriteLine("Invalid operation!");
                break;
            }

            // Update the account balance and display the increase
            accountBalance += deposit;
            Console.WriteLine($"Increase: {deposit:F2}");

            command = Console.ReadLine();
        }

        // Display the final account balance
        Console.WriteLine($"Total: {accountBalance:F2}");
    }
}
