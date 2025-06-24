using System;
using System.Text.RegularExpressions;

public class _01_ValidUsernamesV2
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] console = Console.ReadLine().Split(", ");

        // Define a regular expression pattern for valid usernames
        Regex pattern = new Regex("^[A-Za-z0-9_-]{3,16}$");

        // Validate and print valid usernames
        foreach (string username in console)
        {
            if (pattern.IsMatch(username))
            {
                Console.WriteLine(username);
            }
        }
    }
}
