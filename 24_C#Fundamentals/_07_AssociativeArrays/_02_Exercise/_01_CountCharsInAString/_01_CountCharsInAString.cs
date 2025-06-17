using System;

public class _01_CountCharsInAString
{
    public static void Main(string[] args)
    {
        // Read input value
        string text = Console.ReadLine();

        // Add variable
        Dictionary<char, int> lettersCount = new Dictionary<char, int>();

        // Count chars in a string
        foreach (char currentSymbol in text)
        {
            if (currentSymbol == ' ')
            {
                continue;
            }

            if (!lettersCount.ContainsKey(currentSymbol))
            {
                lettersCount[currentSymbol] = 1;
            }
            else
            {
                lettersCount[currentSymbol]++;
            }
        }

        // Print result
        // Can use var instead!
        foreach (KeyValuePair<char, int> current in lettersCount)
        {
            Console.WriteLine($"{current.Key} -> {current.Value}");
        }
    }
}
