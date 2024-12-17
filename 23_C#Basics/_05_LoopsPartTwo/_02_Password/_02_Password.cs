using System;

public class _02_Password
{
    public static void Main(string[] args)
    {
        // Read input values
        string username = Console.ReadLine();
        string password = Console.ReadLine();

        string input = Console.ReadLine();

        // Use a while loop to repeatedly ask for the password until it matches
        while (input != password)
        {
            input = Console.ReadLine();
        }

        // Welcome the user after successful login
        Console.WriteLine("Welcome {0}!", username);
    }
}
