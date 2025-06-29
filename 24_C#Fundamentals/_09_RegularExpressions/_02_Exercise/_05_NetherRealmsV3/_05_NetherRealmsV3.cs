using System;
using System.Text.RegularExpressions;

public class _05_NetherRealmsV3
{
    public static void Main(string[] args)
    {
        // Read input values and normalize
        List<string> input = Console.ReadLine().Split(new[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(d => d.Replace(" ", "")).ToList();

        // Add variables
        Dictionary<string, string> map = new Dictionary<string, string>();

        // Regex patterns
        string regexHealth = @"[^0-9*/+\-.]";
        string regexAttack = @"[+-]?\d+\.?\d*";
        string regexActions = @"[*\/]";

        Regex patternHealth = new Regex(regexHealth);
        Regex patternAttack = new Regex(regexAttack);
        Regex patternAction = new Regex(regexActions);

        foreach (string demon in input.OrderBy(d => d))
        {
            // Calculate health
            MatchCollection healthMatches = patternHealth.Matches(demon);
            int health = healthMatches.Cast<Match>().Sum(m => m.Value[0]);

            // Calculate base damage
            MatchCollection attackMatches = patternAttack.Matches(demon);
            double damage = attackMatches.Cast<Match>().Sum(m => double.Parse(m.Value));

            // Apply action modifiers
            MatchCollection actionMatches = patternAction.Matches(demon);
            foreach (Match match in actionMatches)
            {
                if (match.Value == "*")
                {
                    damage *= 2;
                }
                else if (match.Value == "/")
                {
                    damage /= 2;
                }
            }

            map.Add(demon, $"{demon} - {health} health, {damage:F2} damage");
        }

        // Print result
        map.OrderBy(e => e.Key).Select(e => e.Value).ToList().ForEach(e => Console.WriteLine(e));
    }
}
