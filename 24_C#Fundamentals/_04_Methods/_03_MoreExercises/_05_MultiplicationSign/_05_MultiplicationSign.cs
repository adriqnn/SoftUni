using System;

public class _05_MultiplicationSign
{
    public static void Main(string[] args)
    {
        // Read input value
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());
        int num3 = int.Parse(Console.ReadLine());

        // Create method that determines math result
        checkMath(num1, num2, num3);
    }

    private static void checkMath(int num1, int num2, int num3)
    {
        if (num1 == 0 || num2 == 0 || num3 == 0)
        {
            Console.WriteLine("zero");
            return;
        }

        int count = 0;
        if (num1 < 0)
        {
            count++;
        }

        if (num2 < 0)
        {
            count++;
        }

        if (num3 < 0)
        {
            count++;
        }

        if (count == 1 || count == 3)
        {
            Console.WriteLine("negative");
        }
        else
        {
            Console.WriteLine("positive");
        }
    }
}
