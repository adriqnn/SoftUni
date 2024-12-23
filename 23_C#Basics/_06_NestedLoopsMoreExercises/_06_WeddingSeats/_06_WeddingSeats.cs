using System;

public class _06_WeddingSeats
{
    public static void Main(string[] args)
    {
        // Read input values
        char lastSector = Console.ReadLine()[0];
        int countOfRowsFirstSector = int.Parse(Console.ReadLine());
        int countOfOddSeats = int.Parse(Console.ReadLine());

        // Add variables
        int countOfSectors = 0;
        int seatsOdd = (int)'a' + countOfOddSeats;
        int seatsEven = (int)'a' + countOfOddSeats + 2;
        int countSeats = 0;

        // Print all possible seats
        for (char i = 'A'; i <= lastSector; i++)
        {
            for (int j = 1; j <= countOfRowsFirstSector + countOfSectors; j++)
            {
                if (j % 2 != 0)
                {
                    for (char k = 'a'; k < seatsOdd; k++)
                    {
                        countSeats++;
                        Console.WriteLine($"{i}{j}{k}");
                    }
                }
                else
                {
                    for (char k = 'a'; k < seatsEven; k++)
                    {
                        countSeats++;
                        Console.WriteLine($"{i}{j}{k}");
                    }
                }
            }

            countOfSectors++;
        }

        // Print the total count of the seats
        Console.WriteLine(countSeats);
    }
}
