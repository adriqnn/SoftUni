using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;

public class _03_StreamOfLetters
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        List<string> secret = new List<string>();
        HashSet<string> special = new HashSet<string>();
        StringBuilder hiddenMessage = new StringBuilder(); ;

        // Solve the secret message
        while (input != "End")
        {
            // Check if the input is a letter (A-Z or a-z)
            if (Regex.IsMatch(input, "^[a-zA-Z]$"))
            {
                char letter = input[0];

                if (special.Count == 3)
                {
                    // If there are already three special characters, append the hidden message
                    hiddenMessage.Append(String.Join("", secret)).Append(" ");
                    secret.Clear();
                    special.Clear();
                }

                if (letter == 'c' || letter == 'o' || letter == 'n')
                {
                    if (special.Contains(input))
                    {
                        secret.Add(input);
                    }
                    else
                    {
                        special.Add(input);
                    }
                }
                else
                {
                    secret.Add(input);
                }
            }

            input = Console.ReadLine();
        }

        // Append the remaining hidden message if special characters are present
        if (special.Count == 3)
        {
            hiddenMessage.Append(String.Join("", secret));
        }

        // Print the hidden message
        Console.WriteLine(hiddenMessage.ToString());
    }
}
