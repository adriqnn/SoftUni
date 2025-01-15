using System;

public class _07_SafePasswordsGeneratorV2
{
    public static void Main(string[] args)
    {
        // Read input values
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int max = int.Parse(Console.ReadLine());

        // Variables
        int A = 35; // '#' in ASCII
        int B = 64; // '@' in ASCII
        int count = 0;

        // Flag to break out of outer loop
        bool breakOuter = false;

        // Print generated passwords
        for (int i = 1; i <= a && !breakOuter; i++)
        {
            for (int j = 1; j <= b; j++)
            {
                if (count == max)
                {
                    breakOuter = true;
                    break; // breaks inner loop
                }

                Console.Write($"{(char)A}{(char)B}{i}{j}{(char)B}{(char)A}|");

                count++;

                A = (A == 55) ? 35 : A + 1;
                B = (B == 96) ? 64 : B + 1;
            }
        }
    }
}
