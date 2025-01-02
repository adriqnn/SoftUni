using System;

public class _07_MinNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        string command = Console.ReadLine();

        // Staging
        int num = int.MaxValue;

        while (command != "Stop")
        {
            int number = int.Parse(command);

            // Check if the current number is lower than the current minimum
            if (number < num)
            {
                num = number;
            }
            
            command = Console.ReadLine();
        }

        // Display the minimum number
        Console.WriteLine(num);
    }
}
