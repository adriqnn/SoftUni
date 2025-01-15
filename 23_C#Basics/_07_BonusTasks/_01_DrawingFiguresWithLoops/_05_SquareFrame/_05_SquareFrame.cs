using System;

public class _05_SquareFrame
{
    public static void Main(string[] args)
    {
        // Read input value
        int sideLength = int.Parse(Console.ReadLine());

        // Print the square frame
        for (int i = 1; i <= sideLength; i++)
        {
            for (int j = 1; j <= sideLength; j++)
            {
                if ((i == 1 && (j == 1 || j == sideLength)) || (i == sideLength && (j == 1 || j == sideLength)))
                {
                    Console.Write("+ ");
                }
                else if (j == 1 || j == sideLength)
                {
                    Console.Write("| ");
                }
                else
                {
                    Console.Write("- ");
                }
            }

            // Move to the next line
            Console.WriteLine();
        }
    }
}
