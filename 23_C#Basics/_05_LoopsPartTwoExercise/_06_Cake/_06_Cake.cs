using System;

public class _06_Cake
{
    public static void Main(string[] args)
    {
        // Read input values
        int width = int.Parse(Console.ReadLine());
        int length = int.Parse(Console.ReadLine());
        string input = Console.ReadLine();

        // Add variables
        int wholeCake = width * length;
        int remainingCake = wholeCake;
        int totalSlices = 0;

        // Using while manage the slices of the cake
        while (input != "STOP")
        {
            int slices = int.Parse(input);

            // Update the remaining cake and total slices taken
            remainingCake -= slices;
            totalSlices += slices;

            if (remainingCake <= 0)
            {
                Console.WriteLine($"No more cake left! You need {Math.Abs(wholeCake - totalSlices)} pieces more.");
                break;
            }

            input = Console.ReadLine();
        }

        // Display the remaining pieces if the user stopped
        if (input == "STOP")
        {
            Console.WriteLine($"{remainingCake} pieces are left.");
        }
    }
}
