using System;

public class _02_EnglishNameOfTheLastDigit
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Add variables
        int n = num % 10;
        string[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        // Print Result
        Console.WriteLine(word[n]);
    }
}
