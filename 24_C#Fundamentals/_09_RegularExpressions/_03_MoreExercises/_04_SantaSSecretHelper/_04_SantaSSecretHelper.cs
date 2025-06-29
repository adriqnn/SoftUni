using System;
using System.Text.RegularExpressions;
using System.Text;
using System.Linq;

public class _04_SantaSSecretHelper
{
    public static void Main(string[] args)
    {
        // Read input values
        int subtractNumber = int.Parse(Console.ReadLine());
        string input = Console.ReadLine();

        // Read the message and decipher
        while (!input.Equals("end"))
        {
            StringBuilder message = new StringBuilder();

            for (int i = 0; i < input.Length; i++)
            {
                message.Append((char) (input[i] - subtractNumber));
            }

            string decodeRegex = @"@(?<name>[A-Za-z]+)[^@\-!:>]*!(?<grade>[GN])!";
            Regex decodePattern = new Regex(decodeRegex);
            MatchCollection decodeMatcher = decodePattern.Matches(message.ToString());

            foreach (Match match in decodeMatcher)
            {
                if (match.Groups["grade"].Value.Equals("G"))
                {
                    Console.WriteLine(match.Groups["name"].Value);
                }
            }

            input = Console.ReadLine();
        }
    }
}
