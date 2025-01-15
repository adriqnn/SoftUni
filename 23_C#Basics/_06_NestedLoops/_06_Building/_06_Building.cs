using System;

public class _06_Building
{
    public static void Main(string[] args)
    {
        // Read input values
        int floors = int.Parse(Console.ReadLine());
        int rooms = int.Parse(Console.ReadLine());

        // Print last floor large apartments
        for (int i = floors; i > floors - 1; i = floors - 1)
        {
            for (int j = 0; j < rooms; j++)
            {
                Console.Write($"L{i}{j} ");
            }
        }

        // Cycle through the rest of the building
        for (int i = floors - 1; i >= 1; i--)
        {
            // New line
            Console.Write("\n");

            // Print apartments
            if (i % 2 != 0)
            {
                for (int j = 0; j < rooms; j++)
                {
                    Console.Write($"A{i}{j} ");
                }
            }

            // Print offices
            if (i % 2 == 0)
            {
                for (int j = 0; j < rooms; j++)
                {
                    Console.Write($"O{i}{j} ");
                }
            }
        }
    }
}
