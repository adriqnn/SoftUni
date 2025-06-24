using System;
using System.Text;

public class _04_CaesarCipher
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        StringBuilder encrypt = new StringBuilder();

        // Encrypt the message
        for (int i = 0; i < console.Length; i++)
        {
            char symbol = (char)(console[i] + 3);

            encrypt.Append(symbol);
        }

        // Print result
        Console.WriteLine(encrypt);
    }
}
