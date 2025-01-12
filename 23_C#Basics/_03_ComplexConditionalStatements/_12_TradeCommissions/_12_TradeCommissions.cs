using System;

public class _12_TradeCommissions
{
    public static void Main(string[] args)
    {
        // Read input values for city and money
        string city = Console.ReadLine();
        double money = double.Parse(Console.ReadLine());

        // Check if the input values are valid
        bool isValidCity = city == "Sofia" || city == "Varna" || city == "Plovdiv";
        bool isValidMoney = money >= 0;

        // End the program if invalid data is entered
        if (!isValidCity || !isValidMoney)
        {
            Console.WriteLine("error");
            return;
        }

        // Commission for the trade
        double commission = 0.0;

        // Calculate the commission
        switch (city)
        {
            case "Sofia":
                if (money <= 500)
                {
                    commission = money * 0.05;
                }
                else if (money <= 1000)
                {
                    commission = money * 0.07;
                }
                else if (money <= 10000)
                {
                    commission = money * 0.08;
                }
                else
                {
                    commission = money * 0.12;
                }
                break;
            case "Varna":
                if (money <= 500)
                {
                    commission = money * 0.045;
                }
                else if (money <= 1000)
                {
                    commission = money * 0.075;
                }
                else if (money <= 10000)
                {
                    commission = money * 0.10;
                }
                else
                {
                    commission = money * 0.13;
                }
                break;
            case "Plovdiv":
                if (money <= 500)
                {
                    commission = money * 0.055;
                }
                else if (money <= 1000)
                {
                    commission = money * 0.08;
                }
                else if (money <= 10000)
                {
                    commission = money * 0.12;
                }
                else
                {
                    commission = money * 0.145;
                }
                break;
        }

        // Print the commission
        Console.WriteLine($"{commission:F2}");
    }
}
