using System;

public class _05_GodzillaVsKong
{
    public static void Main(string[] args)
    {
        // Read the input values
        double budget = double.Parse(Console.ReadLine());
        int extras = int.Parse(Console.ReadLine());
        double clothesPricePerExtra = double.Parse(Console.ReadLine());

        // Calculate the setting cost
        double settingCost = budget * 0.1;

        // Calculate the total cost for clothes
        double clothesCost = clothesPricePerExtra * extras;

        // Apply discount for clothes if extras are more than 150
        if (extras > 150)
        {
            clothesCost *= 0.9;
        }

        // Calculate the remaining budget after expenses
        double remainingBudget = budget - (settingCost + clothesCost);

        // Print the result based on the remaining budget
        if (remainingBudget >= 0)
        {
            Console.WriteLine("Action!");
            Console.WriteLine("Wingard starts filming with {0:F2} leva left.", remainingBudget);
        }
        else
        {
            Console.WriteLine("Not enough money!");
            Console.WriteLine("Wingard needs {0:F2} leva more.", Math.Abs(remainingBudget));
        }
    }
}
