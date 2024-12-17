using System;

public class _07_Moving
{
    public static void Main(string[] args)
    {
        // Read input values
        int width = int.Parse(Console.ReadLine());
        int length = int.Parse(Console.ReadLine());
        int height = int.Parse(Console.ReadLine());

        // Add variables
        int volume = width * length * height;
        int boxesSum = 0;

        string input = Console.ReadLine();

        // Determine how many boxes are needed for the moving
        while (input != "Done")
        {
            int boxes = int.Parse(input);
            boxesSum += boxes;

            if (boxesSum >= volume)
            {
                break;
            }

            input = Console.ReadLine();
        }

        // Display the remaining or excess space in the room
        int diff = Math.Abs(boxesSum - volume);

        // Print result 
        if (boxesSum >= volume)
        {
            Console.WriteLine($"No more free space! You need {diff} Cubic meters more.");
        }
        else
        {
            Console.WriteLine($"{diff} Cubic meters left.");
        }
    }
}
