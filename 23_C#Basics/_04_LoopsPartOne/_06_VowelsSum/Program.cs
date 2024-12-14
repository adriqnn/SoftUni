using System;

public class _06_VowelsSum
{
    public static void Main(string[] args)
    {
        // Read input value
        String text = Console.ReadLine();

        int sum = 0;

        // Iterate through the input value text and sum all the vowels
        for (int i = 0; i < text.Length; i++)
        {
            char symbol = text[i];

            switch (symbol)
            {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }

        // Print the sum of vowel values
        Console.WriteLine(sum);
    }
}
