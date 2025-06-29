using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;
using System.Text;

public class _02_RageQuit
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        StringBuilder result = new StringBuilder();

        string regexInput = "(?<match>(?<string>[^0-9]+)(?<number>[0-9]+))";
        Regex patternInput = new Regex(regexInput);
        MatchCollection matches = patternInput.Matches(input);

        // Decipher the message
        foreach (Match match in matches)
        {
            string stringType = match.Groups["string"].Value.ToUpper();
            int times = int.Parse(match.Groups["number"].Value);

            for (int i = 0; i < times; i++)
            {
                result.Append(stringType);
            }
        }

        // Calculate distinct uppercase symbols in the final result
        long uniqueCount = result.ToString().Distinct().Count();

        // Print result
        Console.WriteLine($"Unique symbols used: {uniqueCount}");
        Console.WriteLine(result);
    }
}
