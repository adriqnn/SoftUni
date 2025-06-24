using System;

public class _03_ExtractFile
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] console = Console.ReadLine().Split("\\");

        // Add variable
        string[] file = console[console.Length - 1].Split(".");

        // Print result
        Console.WriteLine($"File name: {file[0]}\nFile extension: {file[1]}", file[0], file[1]);
    }
}
