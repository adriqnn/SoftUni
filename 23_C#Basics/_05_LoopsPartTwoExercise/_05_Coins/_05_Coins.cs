using System;

public class _05_Coins
{
    public static void Main(string[] args)
    {
        // Read input value
        double monetaryValue = double.Parse(Console.ReadLine());

        // Convert to integer representation of cents
        int coinsMonetaryValue = (int)(monetaryValue * 100);
        int coinCount = 0;

        // Use a while loop to calculate the number of coins needed
        while (coinsMonetaryValue > 0)
        {
            if (coinsMonetaryValue >= 200)
            {
                coinCount++;
                coinsMonetaryValue -= 200;
            }
            else if (coinsMonetaryValue >= 100)
            {
                coinCount++;
                coinsMonetaryValue -= 100;
            }
            else if (coinsMonetaryValue >= 50)
            {
                coinCount++;
                coinsMonetaryValue -= 50;
            }
            else if (coinsMonetaryValue >= 20)
            {
                coinCount++;
                coinsMonetaryValue -= 20;
            }
            else if (coinsMonetaryValue >= 10)
            {
                coinCount++;
                coinsMonetaryValue -= 10;
            }
            else if (coinsMonetaryValue >= 5)
            {
                coinCount++;
                coinsMonetaryValue -= 5;
            }
            else if (coinsMonetaryValue >= 2)
            {
                coinCount++;
                coinsMonetaryValue -= 2;
            }
            else
            {
                coinCount++;
                coinsMonetaryValue -= 1;
            }
        }

        // Print the coin count
        Console.WriteLine(coinCount);
    }
}
