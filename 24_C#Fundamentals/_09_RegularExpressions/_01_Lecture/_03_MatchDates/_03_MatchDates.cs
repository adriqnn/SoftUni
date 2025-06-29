using System;
using System.Text.RegularExpressions;

public class _03_MatchDates
{
    public static void Main(string[] args)
    {
        // Read input value
        string dates = Console.ReadLine();

        // Add variables
        string regex = "\\b(?<day>\\d{2})(?<separator>[\\/\\-.])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Regex pattern = new Regex(regex);
        Match matcher = pattern.Match(dates);

        // Match dates and print result
        while (matcher.Success)
        {
            string day = matcher.Groups["day"].Value;
            string month = matcher.Groups["month"].Value;
            string year = matcher.Groups["year"].Value;

            Console.WriteLine($"Day: {day}, Month: {month}, Year: {year}");
            matcher = matcher.NextMatch();
        }
    }
}
