using System;
using System.Text.RegularExpressions;

public class _05_NetherRealms
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> console = Console.ReadLine().Split(new[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(s => s.Replace(" ", "")).ToList();

        // Add variables
        string regexHealth = "[^0-9*/+\\-.]";
        Regex patternHealth = new Regex(regexHealth);
        Dictionary<string, string> map = new Dictionary<string, string>();

        string regexAttack = "[+-]?\\d+\\.?\\d*";
        Regex patternAttack = new Regex(regexAttack);

        // Determine the result of the nether realm battle
        for (int i = 0; i < console.Count; i++)
        {
            // Calculate health
            MatchCollection healthMatches = patternHealth.Matches(console[i]);
            int health = healthMatches.Cast<Match>().Sum(m => m.Value[0]);

            // Calculate base damage
            MatchCollection attackMatches = patternAttack.Matches(console[i]);
            double attackDemons = attackMatches.Cast<Match>().Sum(m => double.Parse(m.Value));

            int countMultiply = 0;
            int countDivide = 0;

            for (int i1 = 0; i1 < console[i].Length; i1++)
            {
                if ((char) console[i][i1] == '*')
                {
                    countMultiply++;
                }
                else if ((char) console[i][i1] == '/')
                {
                    countDivide++;
                }
            }

            for (int i1 = 0; i1 < countDivide; i1++)
            {
                attackDemons /= 2;
            }
            for (int i1 = 0; i1 < countMultiply; i1++)
            {
                attackDemons *= 2;
            }

            map.Add(console[i], $"{console[i]} - {health} health, {attackDemons:F2} damage");
        }

        // Print result
        map.OrderBy(e => e.Key).Select(e => e.Value).ToList().ForEach(e => Console.WriteLine(e));
    }
}
