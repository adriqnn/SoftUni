using System;
using System.Text;

public class _09_PalindromeIntegers
{
    public static void Main(string[] args)
    {
        // Read input value
        string number = Console.ReadLine();

        // Cycle through and print result
        while (!number.Equals("END"))
        {
            // Create method that determines if the input is palindrome
            Console.WriteLine(isPalindromeInteger(number));

            number = Console.ReadLine();
        }
    }

    private static bool isPalindromeInteger(string number)
    {
        StringBuilder second = new StringBuilder();

        for (int i = number.Length - 1; i >= 0; i--)
        {
            second.Append(number[i]);
        }

        int n1 = int.Parse(number);
        int n2 = int.Parse(second.ToString());

        return n1 == n2;
    }
}
