using System;

public class _01_ValidUsernames
{
    public static void Main(string[] args)
    {
        string[] console = Console.ReadLine().Split(", ");

        // Validate usernames
        for (int i = 0; i < console.Length; i++)
        {
            // Validate the length
            if (console[i].Length >= 3 && console[i].Length <= 16)
            {
                bool isValid = true;

                // Validate characters
                for (int j = 0; j < console[i].Length; j++)
                {
                    char symbol = console[i][j];

                    isValid = char.IsLetterOrDigit(symbol) || symbol == '-' || symbol == '_';
                    if (!isValid)
                    {
                        break;
                    }
                }

                // Print result
                if (isValid)
                {
                    Console.WriteLine(console[i]);
                }
            }
        }
    }
}
