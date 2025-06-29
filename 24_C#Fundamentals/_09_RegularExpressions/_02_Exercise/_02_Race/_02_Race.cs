using System;
using System.Text.RegularExpressions;
using System.Text;

public class _02_Race
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        List<string> racers = input.Split(", ", StringSplitOptions.RemoveEmptyEntries).ToList();
        Dictionary<string, int> racersDistance = new Dictionary<string, int>();
        racers.ForEach(racer => racersDistance[racer] = 0);

        string regexLetters = "[A-Za-z]{1}";
        Regex patternLetters = new Regex(regexLetters);

        string regexDistance = "[0-9]";
        Regex patternNumbers = new Regex(regexDistance);

        // Determine the winner of the race
        while (input != ("end of race"))
        {
            StringBuilder nameBuilder = new StringBuilder();

            MatchCollection matcherName = patternLetters.Matches(input);
            MatchCollection matcherDistance = patternNumbers.Matches(input);

            string racerName = string.Concat(matcherName.Cast<Match>().Select(m => m.Value));
            int distance = matcherDistance.Cast<Match>().Sum(m => int.Parse(m.Value));

            if (racersDistance.ContainsKey(racerName))
            {
                racersDistance[racerName] += distance;
            }

            input = Console.ReadLine();
        }

        List<string> firstThreeNames = racersDistance.OrderByDescending(kvp => kvp.Value).Take(3).Select(kvp => kvp.Key).ToList();

        // Print result
        Console.WriteLine($"1st place: {firstThreeNames[0]}");
        Console.WriteLine($"2nd place: {firstThreeNames[1]}");
        Console.WriteLine($"3rd place: {firstThreeNames[2]}");
    }
}
