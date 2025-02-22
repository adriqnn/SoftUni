using System;

public class _04_PasswordValidator
{
    public static void Main(string[] args)
    {
        // Read input value
        string password = Console.ReadLine();

        // Determine if a password is valid
        if (isPasswordValidLength(password) && hasLettersAndDigitsOnly(password) && hasAtLeast2Digits(password))
        {
            Console.WriteLine("Password is valid");
        }
        else
        {
            if (!isPasswordValidLength(password))
            {
                Console.WriteLine("Password must be between 6 and 10 characters");
            }
            if (!hasLettersAndDigitsOnly(password))
            {
                Console.WriteLine("Password must consist only of letters and digits");
            }
            if (!hasAtLeast2Digits(password))
            {
                Console.WriteLine("Password must have at least 2 digits");
            }
        }
    }

    private static bool hasAtLeast2Digits(string password)
    {
        int count = 0;

        for (int i = 0; i < password.Length; i++)
        {
            char symbol = password[i];

            if (char.IsDigit(symbol))
            {
                count++;
            }
        }
        return count >= 2;
    }

    private static bool hasLettersAndDigitsOnly(string password)
    {
        for (int i = 0; i < password.Length; i++)
        {
            char symbol = password[i];

            if (!char.IsLetterOrDigit(symbol))
            {
                return false;
            }
        }
        return true;
    }

    private static bool isPasswordValidLength(string password)
    {
        if (password.Length >= 6 && password.Length <= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
