using System;
using System.Numerics;
using System.Text.RegularExpressions;
using System.Text;

public class _04_StarEnigma
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        string decrypt = "[sStTaArR]";
        Regex decryptMessage = new Regex(decrypt);
        List<string> messages = new List<string>();

        // Decrypt message
        for (int i = 0; i < n; i++)
        {
            string console = Console.ReadLine();

            StringBuilder message = new StringBuilder();
            int count = decryptMessage.Matches(console).Count;

            for (int j = 0; j < console.Length; j++)
            {
                char symbol = (char) (console[j] - count);
                message.Append(symbol);
            }

            messages.Add(message.ToString());
        }

        string regexPlan = "[^@\\-!:>]*?@(?<planet>[A-Z][a-z]*)[^@\\-!:>]*?:(?<population>[0-9]*)[^@\\-!:>]*?!(?<attackType>[DA])![^@\\-!:>]*?->(?<soldierCount>[0-9]*)[^@\\-!:>]*?";
        Regex patternPlan = new Regex(regexPlan);

        List<string> A = new List<string>();
        List<string> D = new List<string>();

        for (int i = 0; i < messages.Count; i++)
        {
            Match matchPlan = patternPlan.Match(messages[i]);

            if (matchPlan.Success)
            {
                string planet = matchPlan.Groups["planet"].Value;
                char attackType = matchPlan.Groups["attackType"].Value[0];

                if (attackType == 'A')
                {
                    A.Add(planet);
                }
                else if (attackType == 'D')
                {
                    D.Add(planet);
                }
            }
        }

        // Print result
        Console.WriteLine($"Attacked planets: {A.Count}");
        A.OrderBy(p => p).ToList().ForEach(p => Console.WriteLine($"-> {p}"));
        Console.WriteLine($"Destroyed planets: {D.Count}");
        D.OrderBy(p => p).ToList().ForEach(p => Console.WriteLine($"-> {p}"));
    }
}

