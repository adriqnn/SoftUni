using System;

public class _02_VowelsCount
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine().ToLower();

        // Create method that prints vowels sum
        printVowelsSum(console);
    }

    private static void printVowelsSum(String console)
    {
        int count = 0;

        for (int i = 0; i < console.Length; i++)
        {
            switch (console[i])
            {
                case 'a':
                case 'y':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                    count++;
                    break;
            }
        }

        Console.WriteLine(count);
    }
}
