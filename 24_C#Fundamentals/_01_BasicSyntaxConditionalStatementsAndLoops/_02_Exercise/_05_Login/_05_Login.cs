using System;
using System.Text;

public class _05_Login
{
    public static void Main(string[] args)
    {
        // Read input values
        string username = Console.ReadLine();
        string console = Console.ReadLine();

        // Add variables
        StringBuilder reverseUsername = new StringBuilder();
        int count = 0;

        // Reverse the username
        for (int i = username.Length - 1; i >= 0; i--)
        {
            reverseUsername.Append(username[i]);
        }

        // Check if the user can log in or block after few unsuccessful attempts
        while (console != reverseUsername.ToString())
        {
            count++;

            if (count == 4)
            {
                Console.WriteLine($"User {username} blocked!");
                return;
            }

            Console.WriteLine("Incorrect password. Try again.");
            console = Console.ReadLine();
        }

        Console.WriteLine($"User {username} logged in.");
    }
}
