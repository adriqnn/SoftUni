using System;

public class _04_PasswordGuess
{
    public static void Main(string[] args)
    {
        // The correct password to compare against
        string password = "s3cr3t!P@ssw0rd";

        // Read the password input
        string passwordInput = Console.ReadLine();

        // Check if the input matches the correct password
        if (passwordInput.Equals(password))
        {
            Console.WriteLine("Welcome");
        }
        else
        {
            Console.WriteLine("Wrong password!");
        }
    }
}
