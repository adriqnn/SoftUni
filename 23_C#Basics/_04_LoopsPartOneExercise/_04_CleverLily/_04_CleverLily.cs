using System;

public class _04_CleverLily
{
    public static void Main(string[] args)
    {
        // Read input values
        int age = int.Parse(Console.ReadLine());
        double washMachinePrice = double.Parse(Console.ReadLine());
        double toyPrice = double.Parse(Console.ReadLine());

        int toysCounter = 0;
        double sumMoney = 0;
        double money = 0;
        int count = 0;

        // Calculate the number of toys received and money saved for each birthday
        for (int i = 1; i <= age; i++)
        {
            if (i % 2 != 0)
            {
                toysCounter++;
            }
            else
            {
                money += 10;
                sumMoney += money;
                count++;
            }
        }

        // Calculate the total money from selling the toys and saved money
        double allToysMoney = toyPrice * toysCounter;
        double totalMoney = allToysMoney + sumMoney - count;
        double diff = Math.Abs(totalMoney - washMachinePrice);

        // Determine if Lily can buy the washing machine and print the result
        if (totalMoney >= washMachinePrice)
        {
            Console.WriteLine($"Yes! {diff:F2}");
        }
        else
        {
            Console.WriteLine($"No! {diff:F2}");
        }
    }
}
