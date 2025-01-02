using System;

public class _01_Dishwasher
{
    public static void Main(string[] args)
    {
        // Read input values
        int detergent = int.Parse(Console.ReadLine());
        string input = Console.ReadLine();

        // Prompt the user to enter the initial amount of detergent
        int detergentQuantity = detergent * 750;
        int washingBatch = 1;
        int plates = 0;
        int pots = 0;

        // Add variables
        while (input != "End")
        {
            int dishes = int.Parse(input);
            int detergentNeeded = 0;

            // Determine whether the dishes are plates or pots
            if (washingBatch % 3 == 0)
            {
                pots += dishes;
                detergentNeeded += dishes * 15;
            }
            else
            {
                plates += dishes;
                detergentNeeded += dishes * 5;
            }

            washingBatch++;

            // Check if there's enough detergent for the current batch
            if (detergentQuantity - detergentNeeded < 0)
            {
                Console.WriteLine($"Not enough detergent, {Math.Abs(detergentQuantity - detergentNeeded)} ml. more necessary!");
                break;
            }
            else
            {
                detergentQuantity -= detergentNeeded;
            }

            input = Console.ReadLine();
        }

        // Display the results
        if (input == "End")
        {
            Console.WriteLine($"Detergent was enough!");
            Console.WriteLine($"{plates} dishes and {pots} pots were washed.");
            Console.WriteLine($"Leftover detergent {detergentQuantity} ml.");
        }
    }
}
