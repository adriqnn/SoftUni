using System;

public class _03_RecursiveFibonacci
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Method for printing fibonacci
        printRecursiveFibonacci(num);
    }

    private static void printRecursiveFibonacci(int num)
    {
        // 0
        if (num == 0)
        {
            Console.WriteLine("0");
            return;
        }

        // 1
        if (num == 1)
        {
            Console.WriteLine("1");
            return;
        }

        long number1InSequence = 1;
        long number2InSequence = 1;

        // fibonacci
        for (int i = 2; i < num; i++)
        {
            long temporary = number2InSequence;
            number2InSequence = number1InSequence + number2InSequence;
            number1InSequence = temporary;
        }

        Console.WriteLine(number2InSequence);
    }
}
