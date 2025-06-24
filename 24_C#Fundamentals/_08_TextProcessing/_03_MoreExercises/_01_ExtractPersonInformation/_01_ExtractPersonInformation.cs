using System;
using System.Text.RegularExpressions;

public class _01_ExtractPersonInformation
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfStrings = int.Parse(Console.ReadLine());

        // Add variables
        string regexName = "@(?<name>[A-Za-z]+)\\|";
        string regexAge = "#(?<age>[0-9]+)\\*";
        Regex patterName = new Regex(regexName);
        Regex patternAge = new Regex(regexAge);

        // Extract user information
        for (int i = 0; i < numberOfStrings; i++)
        {
            string newLine = Console.ReadLine();

            Match matcherName = patterName.Match(newLine);
            Match matcherAge = patternAge.Match(newLine);

            string name = "";
            string age = "";

            if (matcherName.Success)
            {
                name = matcherName.Groups["name"].Value;
            }

            if (matcherAge.Success)
            {
                age = matcherAge.Groups["age"].Value;
            }

            if (name.Length > 0 && age.Length > 0)
            {
                Console.WriteLine($"{name} is {age} years old.");
            }
        }
    }
}
