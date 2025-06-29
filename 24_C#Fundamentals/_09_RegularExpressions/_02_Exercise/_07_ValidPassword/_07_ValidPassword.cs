using System;
using System.Text.RegularExpressions;
using System.Text;

public class _07_ValidPassword
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        string regexEmail = "_[.]+[A-Z][A-Za-z0-9]{4,}[A-Z]_[.]+";
        Regex patternEmail = new Regex(regexEmail);

        // Determine if the password is valid or not
        for (int i = 0; i < n; i++)
        {
            string input = Console.ReadLine();
            Match matcherEmail = patternEmail.Match(input);

            // Print result
            if (matcherEmail.Success)
            {
                StringBuilder groupString = new StringBuilder("Group: ");

                for (int j = 0; j < input.Length; j++)
                {
                    char current = input[j];

                    if (char.IsDigit(current))
                    {
                        groupString.Append(current);
                    }
                }

                Console.WriteLine(groupString.Length > 7 ? groupString : groupString + "default");
            }
            else
            {
                Console.WriteLine("Invalid pass!");
            }
        }
    }
}
