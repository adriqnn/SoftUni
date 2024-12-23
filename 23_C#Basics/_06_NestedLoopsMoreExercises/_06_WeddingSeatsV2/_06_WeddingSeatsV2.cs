using System;

public class _06_WeddingSeatsV2
{
    public static void Main(string[] args)
    {
        // Read input values
        char lastSector = Console.ReadLine()[0];
        int currentCountOfRows = int.Parse(Console.ReadLine());
        int countOfOddSeats = int.Parse(Console.ReadLine());

        // Add variable
        int countSeats = 0;

        // Print all possible seats
        for (char sector = 'A'; sector <= lastSector; sector++)
        {
            for (int row = 1; row <= currentCountOfRows; row++)
            {
                char startSeat = 'a';
                char endSeat = (row % 2 != 0) ? (char)(startSeat + countOfOddSeats) : (char)(startSeat + countOfOddSeats + 2);

                for (char seat = startSeat; seat < endSeat; seat++)
                {
                    countSeats++;
                    Console.WriteLine($"{sector}{row}{seat}");
                }
            }

            currentCountOfRows++;
        }

        // Print the total count of the seats
        Console.WriteLine(countSeats);
    }
}
