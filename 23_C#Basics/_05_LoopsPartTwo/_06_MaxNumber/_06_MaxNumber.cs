using System;

public class _06_MaxNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        string command = Console.ReadLine();

        // Staging
        int num = int.MinValue;

        while (command != "Stop")
        {
            int number = int.Parse(command);

            // Check if the current number is greater than the current maximum
            if (number > num)
            {
                num = number;
            }
            command = Console.ReadLine();
        }

        // Display the maximum number
        Console.WriteLine(num);
    }
}
