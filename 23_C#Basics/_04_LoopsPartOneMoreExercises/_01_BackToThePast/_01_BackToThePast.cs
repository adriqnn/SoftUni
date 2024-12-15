using System;

public class _01_BackToThePast
{
    public static void Main(string[] args)
    {
        // Read input values
        double inheritance = double.Parse(Console.ReadLine());
        double targetYear = double.Parse(Console.ReadLine());

        double money = inheritance;

        // Calculate money spent for each year from 1800 to the target year
        for (int i = 1800; i <= targetYear; i++)
        {
            if (i % 2 == 0)
            {
                money -= 12000;
            }
            else
            {
                money -= 12000 + (((i - 1800) + 18) * 50);
            }
        }

        // Determine and print the result based on the remaining money
        if (money >= 0)
        {
            Console.WriteLine("Yes! He will live a carefree life and will have {0:F2} dollars left.", money);
        }
        else
        {
            Console.WriteLine("He will need {0:F2} dollars to survive.", Math.Abs(money));
        }
    }
}
