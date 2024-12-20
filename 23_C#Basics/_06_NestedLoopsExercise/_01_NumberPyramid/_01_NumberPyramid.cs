using System;

public class _01_NumberPyramid
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Add variables
        int current = 1;
        bool isBigger = false;

        // Print the number pyramid
        for (int rows = 1; rows <= num; rows++)
        {
            for (int cols = 1; cols <= rows; cols++)
            {
                if (current > num)
                {
                    isBigger = true;
                    break;
                }

                Console.Write(current + " ");
                current++;
            }

            if (isBigger)
            {
                break;
            }

            Console.WriteLine();
        }
    }
}
