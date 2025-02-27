using System;
using System.Text;

public class _03_TakeSkipRope
{
    public static void Main(string[] args)
    {
        // Read input value
        StringBuilder console = new StringBuilder(Console.ReadLine());

        // Add variables
        List<int> decryptIntegers = new List<int>();
        List<string> decryptStrings = new List<string>();
        List<int> takeList = new List<int>();
        List<int> skipList = new List<int>();

        // Determine if char is digit or not
        for (int i = 0; i < console.Length; i++)
        {
            char symbol = console[i];

            if (Char.IsDigit(symbol))
            {
                decryptIntegers.Add(symbol - '0');
            }
            else
            {
                decryptStrings.Add(symbol.ToString());
            }
        }

        // Determine the needed integers
        for (int i = 0; i < decryptIntegers.Count; i++)
        {
            if (i % 2 == 0)
            {
                takeList.Add(decryptIntegers[i]);
            }
            else
            {
                skipList.Add(decryptIntegers[i]);
            }
        }

        string fromDecryptStrings = string.Concat(decryptStrings);

        StringBuilder result = new StringBuilder();

        // Decrypt String
        for (int i = 0; i < takeList.Count; i++)
        {
            int take = takeList[i];
            int skip = skipList[i];

            if (take > fromDecryptStrings.Length)
            {
                take = fromDecryptStrings.Length;
            }

            result.Append(fromDecryptStrings.Substring(0, take));

            fromDecryptStrings = fromDecryptStrings.Substring(take);

            if (skip > fromDecryptStrings.Length)
            {
                skip = fromDecryptStrings.Length;
            }

            fromDecryptStrings = fromDecryptStrings.Substring(skip);
        }

        // Print result
        Console.WriteLine(result);
    }
}
