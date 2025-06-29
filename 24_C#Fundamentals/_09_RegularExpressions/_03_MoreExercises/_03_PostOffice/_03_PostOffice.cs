using System;
using System.Text.RegularExpressions;
using System.Text;

public class _03_PostOffice
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] input = Console.ReadLine().Split("|");

        // Add varaibles
        StringBuilder characters = new StringBuilder();

        string regexCapitalLetters = "([#$%*&]+)(?<string>[A-Z]+)\\1";
        Regex patternCapitalLetters = new Regex(regexCapitalLetters);
        MatchCollection matcherCapitalLetters = patternCapitalLetters.Matches(input[0]);

        foreach (Match match in matcherCapitalLetters)
        {
            characters.Append(match.Groups["string"].Value);
        }

        // Decipher post office message
        for (int i = 0; i < characters.Length; i++)
        {
            char letter = characters[i];

            string regexWordLength = $"{(int)letter}:(?<length>[0-9]{{2}})";
            Regex patternWordLength = new Regex(regexWordLength);
            MatchCollection lengthMatches = patternWordLength.Matches(input[1]);

            int wordLength = 0;
            foreach (Match match in lengthMatches)
            {
                wordLength = int.Parse(match.Groups["length"].Value) + 1;
            }

            if (wordLength == 0)
            {
                continue; // skip if no match
            }

            // Step 3: Find and print matching words
            string[] words = input[2].Split(' ', StringSplitOptions.RemoveEmptyEntries);

            for (int j = 0; j < words.Length; j++)
            {
                string word = words[j];

                if (word.Length == wordLength && word[0] == letter)
                {
                    Console.WriteLine(word);
                }
            }
        }
    }
}
