using System;
using System.Text.RegularExpressions;

public class _01_DataTypeFinder
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables for regex
        string regexInteger = "^-?[0-9]+$";
        Regex patternInteger = new Regex(regexInteger);
        string regexFloat = "^-?[0-9]+\\.[0-9]+$";
        Regex patternFloat = new Regex(regexFloat);

        // Determine what is the input
        while (!input.Equals("END", StringComparison.OrdinalIgnoreCase))
        {
            // Check for boolean type
            if (input.Equals("true", StringComparison.OrdinalIgnoreCase) || input.Equals("false", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine($"{input} is boolean type");
            }
            // Check for character type (single char that is not a digit)
            else if (input.Length == 1 && (input[0] < '0' || input[0] > '9'))
            {
                Console.WriteLine($"{input} is character type");
            }
            // Check for floating point type using regex
            else if (patternFloat.IsMatch(input))
            {
                Console.WriteLine($"{input} is floating point type");
            }
            // Check for integer type using regex
            else if (patternInteger.IsMatch(input))
            {
                Console.WriteLine($"{input} is integer type");
            }
            // Otherwise, it's a string type
            else
            {
                Console.WriteLine($"{input} is string type");
            }

            input = Console.ReadLine();
        }
    }
}
