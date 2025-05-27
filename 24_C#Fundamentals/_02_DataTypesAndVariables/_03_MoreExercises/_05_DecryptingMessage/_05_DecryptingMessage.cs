using System;
using System.Text;

public class _05_DecryptingMessage
{
    public static void Main(string[] args)
    {
        // Read input values
        int keyToDecrypt = int.Parse(Console.ReadLine());
        int numberOfLines = int.Parse(Console.ReadLine());

        // Add variable
        StringBuilder message = new StringBuilder();

        // Decrypt the message
        for (int i = 0; i < numberOfLines; i++)
        {
            char symbol = Console.ReadLine()[0];
            symbol = (char) (symbol + keyToDecrypt);

            message.Append(symbol);
        }

        // Print result
        Console.WriteLine(message);
    }
}
