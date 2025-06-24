using System;
using System.Text.RegularExpressions;
using System.Text;

public class _03_TreasureFinder
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] key = Console.ReadLine().Split(new[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
        string console = Console.ReadLine();

        // Add variable
        List<string> treasureInformation = new List<string>();

        // Decrypt information
        while (!console.Equals("find"))
        {
            int n = console.Length;

            StringBuilder decrypted = new StringBuilder();
            for (int i = 0; i < n; i++)
            {
                if (key.Length - 1 < i)
                {
                    decrypted.Append((char)(console[i] - key[(i % key.Length)]));
                }
                else
                {
                    decrypted.Append((char)(console[i] - key[i]));
                }
            }

            treasureInformation.Add(decrypted.ToString());

            console = Console.ReadLine();
        }

        string regexTypeOfTreasure = "&(?<type>[A-Za-z]+)&";
        Regex patternTypeOfTreasure = new Regex(regexTypeOfTreasure);

        string regexCoordinates = "<(?<coordinates>[A-Za-z0-9]+)>";
        Regex patternCoordinates = new Regex(regexCoordinates);

        // Find the treasure
        for (int i = 0; i < treasureInformation.Count; i++)
        {
            Match matcherTypeOfTreasure = patternTypeOfTreasure.Match(treasureInformation[i]);
            Match matcherCoordinates = patternCoordinates.Match(treasureInformation[i]);

            string treasure = "";
            string coordinates = "";

            if (matcherTypeOfTreasure.Success)
            {
                treasure = matcherTypeOfTreasure.Groups["type"].Value;
            }

            if (matcherCoordinates.Success)
            {
                coordinates = matcherCoordinates.Groups["coordinates"].Value;
            }

            Console.WriteLine($"Found {treasure} at {coordinates}");
        }
    }
}
