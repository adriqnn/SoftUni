using System;

public class _10_MultiplyEvensByOdds
{
    public static void Main(string[] args)
    {
        // Read input value
        string num = Console.ReadLine();

        // Create method for multiplication
        whatIf(num);
    }

    private static void whatIf(String number)
    {
        int thisNumber = Math.Abs(int.Parse(number));
        string num = thisNumber.ToString();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < num.Length; i++)
        {
            char symbol = num[i];
            int n = symbol - '0';

            if (n % 2 == 0)
            {
                sumEven += n;
            }
            else
            {
                sumOdd += n;
            }
        }

        Console.WriteLine(sumEven * sumOdd);
    }
}
