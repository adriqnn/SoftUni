using System;

public class _06_ConcatenateData
{
    public static void Main(string[] args)
    {
        // Read input data
        string firstName = Console.ReadLine();
        string lastName = Console.ReadLine();
        int age = int.Parse(Console.ReadLine());
        string town = Console.ReadLine();

        // Print formatted message
        Console.WriteLine($"You are {firstName} {lastName}, a {age}-years old person from {town}.");
    }
}
