using System;
using System.Text;

public class _05_Messages
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        StringBuilder build = new StringBuilder();

        // Decipher the message
        for (int i = 1; i <= n; i++)
        {
            int console = int.Parse(Console.ReadLine());
            int numDigits = console.ToString().Length;

            int mainDigit = console % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9)
            {
                offset += 1;
            }

            int index = offset + numDigits - 1;
            char symbol = (char)(index + 97);

            if (console == 0)
            {
                build.Append(" ");
            }
            else
            {
                build.Append(symbol);
            }
        }

        Console.WriteLine(build.ToString());
    }
}
