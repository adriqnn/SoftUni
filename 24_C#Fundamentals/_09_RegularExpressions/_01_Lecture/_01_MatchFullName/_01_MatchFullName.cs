using System;
using System.Text.RegularExpressions;

public class _01_MatchFullName
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        string regexName = "(?<name>\\b[A-Z][a-z]+ [A-Z][a-z]+\\b)";
        Regex patternName = new Regex(regexName);
        Match matcherName = patternName.Match(console);

        // Match the name and print result
        while (matcherName.Success)
        {
            string find = matcherName.Groups["name"].Value;
            Console.Write(find + " ");

            matcherName = matcherName.NextMatch();
        }
    }
}
