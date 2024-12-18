using System;

public class _02_ReportSystem
{
    public static void Main(string[] args)
    {
        // Read input values
        double donationGoal = double.Parse(Console.ReadLine());
        string input = Console.ReadLine();

        // Add variables
        double collectedMoney = 0;
        int order = 1;
        double moneyCash = 0;
        double successfulCashDonations = 0;
        double moneyCard = 0;
        double successfulCardDonations = 0;
        bool moneyCollected = false;

        // Operations
        while (input != "End")
        {
            double currentTransaction = double.Parse(input);

            // Check if it's an even or odd order transaction
            if (order % 2 == 0)
            {
                if (currentTransaction < 10)
                {
                    Console.WriteLine("Error in transaction!");
                }
                else
                {
                    moneyCard += currentTransaction;
                    collectedMoney += currentTransaction;
                    successfulCashDonations++;
                    Console.WriteLine("Product sold!");
                }
            }
            else
            {
                if (currentTransaction > 100)
                {
                    Console.WriteLine("Error in transaction!");
                }
                else
                {
                    moneyCash += currentTransaction;
                    collectedMoney += currentTransaction;
                    successfulCardDonations++;
                    Console.WriteLine("Product sold!");
                }
            }

            order++;

            if (collectedMoney >= donationGoal)
            {
                moneyCollected = true;
                break;
            }

            input = Console.ReadLine();
        }

        // Display the results
        if (moneyCollected)
        {
            Console.WriteLine($"Average CS: {moneyCash / successfulCashDonations:F2}");
            Console.WriteLine($"Average CC: {moneyCard / successfulCardDonations:F2}");
        }
        else
        {
            Console.WriteLine("Failed to collect required money for charity.");
        }
    }
}
