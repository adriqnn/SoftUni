using System;
using System.Text.RegularExpressions;

public class _02_MatchPhoneNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        string regexPhone = "\\+359(?<separator>[ -])2\\1\\d{3}\\1\\d{4}\\b";
        Regex patternPhone = new Regex(regexPhone);
        Match matcherPhone = patternPhone.Match(console);
        List<string> matchedPhones = new List<string>();

        // Match phone numbers and save them
        while (matcherPhone.Success)
        {
            matchedPhones.Add(matcherPhone.Value);
            matcherPhone = matcherPhone.NextMatch();
        }

        // Print result
        Console.WriteLine(string.Join(", ", matchedPhones));
    }
}
