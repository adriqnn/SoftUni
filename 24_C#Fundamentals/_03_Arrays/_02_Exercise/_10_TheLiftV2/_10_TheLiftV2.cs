using System;

public class _10_TheLiftV2
{
    public static void Main(string[] args)
    {
        // Read input values
        int numberOfPeopleWaiting = int.Parse(Console.ReadLine());
        int[] liftSeatsPosition = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int remainingPeopleInQueue = numberOfPeopleWaiting;
        int availableSeatsLeft = 0;

        // Fill in the empty seats
        for (int i = 0; i < liftSeatsPosition.Length; i++)
        {
            if (liftSeatsPosition[i] < 4)
            {
                int availableSeats = 4 - liftSeatsPosition[i];

                if (remainingPeopleInQueue >= availableSeats)
                {
                    remainingPeopleInQueue -= availableSeats;
                    liftSeatsPosition[i] = 4;
                }
                else
                {
                    liftSeatsPosition[i] = liftSeatsPosition[i] + remainingPeopleInQueue;
                    availableSeatsLeft += availableSeats - remainingPeopleInQueue;
                    remainingPeopleInQueue = 0;
                }
            }
        }

        // Print result 1.
        if (availableSeatsLeft > 0)
        {
            Console.WriteLine("The lift has empty spots!");
        }
        else if (remainingPeopleInQueue > 0)
        {
            Console.WriteLine($"There isn't enough space! {remainingPeopleInQueue} people in a queue!");
        }

        // Print result 2.
        Console.WriteLine(string.Join(" ", liftSeatsPosition));
    }
}
