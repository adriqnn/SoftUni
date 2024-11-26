using System;

public class _02_BonusScore
{
    public static void Main(string[] args)
    {
        // Read the input number
        int inputNumber = int.Parse(Console.ReadLine());
        double bonus = 0;

        // Calculate bonus based on the input number
        if (inputNumber <= 100)
        {
            bonus = 5;
        }
        else if (inputNumber > 1000)
        {
            bonus = inputNumber * 0.1;
        }
        else
        {
            bonus = inputNumber * 0.2;
        }

        // Adjust bonus based on additional conditions
        if (inputNumber % 2 == 0)
        {
            bonus = bonus + 1;
        }
        else if (inputNumber % 10 == 5)
        {
            bonus = bonus + 2;
        }

        // Print the bonus and total score
        Console.WriteLine(bonus);
        Console.WriteLine(inputNumber + bonus);
    }
}
