using System;

public class _10_Profit
{
    public static void Main(string[] args)
    {
        // Read input values
        int coinsOne = int.Parse(Console.ReadLine());
        int coinsTwo = int.Parse(Console.ReadLine());
        int coinsFive = int.Parse(Console.ReadLine());
        int sum = int.Parse(Console.ReadLine());

        // Print all possible combinations
        for (int i = 0; i <= coinsOne; i++)
        {
            for (int j = 0; j <= coinsTwo; j++)
            {
                for (int k = 0; k <= coinsFive; k++)
                {
                    if (((i * 1) + (j * 2) + (k * 5)) == sum)
                    {
                        Console.WriteLine($"{i} * 1 lv. + {j} * 2 lv. + {k} * 5 lv. = {sum} lv.");
                    }
                }
            }
        }
    }
}
