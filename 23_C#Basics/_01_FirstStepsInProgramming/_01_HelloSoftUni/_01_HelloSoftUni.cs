using System;
using System.Text;

public class _01_ReverseStrings
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Reverse strings
        while (!input.Equals("end"))
        {
            string original = input;
            string reversed = new string(input.Reverse().ToArray());

            // Print result
            Console.WriteLine($"{original} = {reversed}");

            input = Console.ReadLine();
        }
    }
}
