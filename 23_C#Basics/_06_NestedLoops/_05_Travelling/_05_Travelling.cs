using System;

public class _05_Traveling
{
    public static void Main(string[] args)
    {
        // Read input values
        String console = Console.ReadLine();
        String destination = "";

        while (!console.Equals("End"))
        {
            // Store the current destination
            destination = console;

            double budget = double.Parse(Console.ReadLine());
            double sum = 0;

            while (sum < budget)
            {
                double expense = double.Parse(Console.ReadLine());
                sum += expense;
            }

            // Print the destination you're going to
            Console.WriteLine($"Going to {destination}!");

            // Read the next destination or "End" to exit the loop
            console = Console.ReadLine();
        }
    }
}
