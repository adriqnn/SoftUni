using System;
using System.Text;

public class _02_ASCIISumator
{
    public static void Main(string[] args)
    {
        // Read input values
        char one = Console.ReadLine()[0];
        char two = Console.ReadLine()[0];
        string consoleLine = Console.ReadLine();

        // Add variable
        StringBuilder charList = new StringBuilder();

        // Generate character string
        for (int i = one + 1; i < two; i++)
        {
            charList.Append((char) i);
        }

        int sum = 0;

        // Extract repeating characters
        for (int i = 0; i < charList.Length; i++)
        {
            for (int j = 0; j < consoleLine.Length; j++)
            {
                if (charList[i] == consoleLine[j])
                {
                    sum += charList[i];
                }
            }
        }

        // Print result
        Console.WriteLine(sum);
    }
}
