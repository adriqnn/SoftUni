using System;

public class _12_EvenNumber
{
    public static void Main(string[] args)
    {
        // Read input value from the console
        string input = Console.ReadLine();

        // Continue processing until "STOP" is entered
        while (input != "STOP")
        {
            int n = Math.Abs(int.Parse(input));

            if (n % 2 == 0)
            {
                Console.WriteLine($"The number is: {n}");
                break;
            }
            else
            {
                Console.WriteLine("Please write an even number.");
            }

            input = Console.ReadLine();
        }
    }
}
