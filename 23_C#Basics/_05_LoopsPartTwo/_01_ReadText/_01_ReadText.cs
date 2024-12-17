using System;

public class _01_ReadText
{
    public static void Main(string[] args)
    {
        // Use a while loop to continuously read input until "Stop" is entered
        while (true)
        {
            string input = Console.ReadLine();

            if (string.Equals(input, "Stop", StringComparison.OrdinalIgnoreCase))
            {
                break;
            }

            // Print the input to the console
            Console.WriteLine(input);
        }
    }
}
