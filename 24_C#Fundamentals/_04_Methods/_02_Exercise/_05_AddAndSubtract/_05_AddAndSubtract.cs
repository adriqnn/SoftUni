using System;

public class _05_AddAndSubtract
{
    public static void Main(string[] args)
    {
        // Read input values
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());
        int num3 = int.Parse(Console.ReadLine());

        // Create method that sums num1 and num2
        int result = addMethod(num1, num2);

        // Create method that subtracts the previous result and num3
        subtractMethod(result, num3);
    }

    private static void subtractMethod(int number1, int number2)
    {
        Console.WriteLine(number1 - number2);
    }

    private static int addMethod(int number1, int number2)
    {
        return number1 + number2;
    }
}
