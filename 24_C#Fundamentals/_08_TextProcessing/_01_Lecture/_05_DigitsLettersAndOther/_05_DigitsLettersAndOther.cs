using System;
using System.Text;

public class _05_DigitsLettersAndOther
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        // Separate digits, letters and other
        for (int i = 0; i < console.Count(); i++)
        {
            char symbol = console[i];

            if (char.IsDigit(symbol))
            {
                digits.Append(symbol);
            }
            else if (char.IsLetter(symbol))
            {
                letters.Append(symbol);
            }
            else
            {
                other.Append(symbol);
            }
        }

        // Print result
        Console.WriteLine(digits);
        Console.WriteLine(letters);
        Console.WriteLine(other);

    }
}
