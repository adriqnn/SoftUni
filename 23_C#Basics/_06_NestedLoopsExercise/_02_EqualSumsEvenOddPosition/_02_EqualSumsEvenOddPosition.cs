using System;

public class _02_EqualSumsEvenOddPosition
{
    public static void Main(string[] args)
    {
        // Read input values
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());

        // Print number in between the numbers above based on the requirement
        for (int i = num1; i <= num2; i++)
        {
            string current = "" + i;

            int even = 0;
            int odd = 0;

            for (int j = 0; j < current.Length; j++)
            {
                int currentDigit = int.Parse("" + current[j]);

                // Check if the current index is even or odd
                if (j % 2 == 0)
                {
                    even += currentDigit;
                }
                if (j % 2 != 0)
                {
                    odd += currentDigit;
                }
            }

            // If the sums of even and odd-positioned digits are equal, print the number
            if (even == odd)
            {
                Console.Write(i + " ");
            }
        }
    }
}
