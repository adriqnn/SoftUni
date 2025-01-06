using System;

public class _09_House
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        int baseNr = n / 2;
        int roof = n - baseNr;

        // Print roof section
        for (int i = 0; i < roof; i++)
        {
            printRoofLines(n, i);
            Console.WriteLine();
        }

        // Print base section
        for (int i = 0; i < baseNr; i++)
        {
            printBaseLines(n, i);
            Console.WriteLine();
        }
    }

    public static void printRoofLines(int n, int i)
    {
        // Add variables
        int stars = n % 2 != 0 ? 1 : 2;
        int numberOfStar = i == 0 ? stars : stars + (i * 2);

        // Print leading '-'
        for (int j = 1; j <= (n - numberOfStar) / 2; j++)
        {
            Console.Write("-");
        }

        // Print stars '*'
        for (int j = 1; j <= numberOfStar; j++)
        {
            Console.Write("*");
        }

        // Print following '-'
        for (int j = 1; j <= (n - numberOfStar) / 2; j++)
        {
            Console.Write("-");
        }
    }

    public static void printBaseLines(int n, int i)
    {

        // Print lines for the base of the house
        for (int j = 1; j <= n; j++)
        {
            if (j == 1 || j == n)
            {
                Console.Write("|");
            }
            else
            {
                Console.Write("*");
            }
        }
    }
}
