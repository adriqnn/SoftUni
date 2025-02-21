using System;
using System.Text;

public class _07_RepeatString
{
    public static void Main(string[] args)
    {
        // Read input values
        string console = Console.ReadLine();
        int num = int.Parse(Console.ReadLine());

        // Create method that repeats a string
        repeatString(console, num);
    }

    private static void repeatString(String console, int num)
    {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < num; i++)
        {
            newString.Append(console);
        }

        Console.WriteLine(newString);
    }
}
