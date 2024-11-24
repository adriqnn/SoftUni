using System;

public class _06_SpeedInfo
{
    public static void Main(string[] args)
    {
        // Read the speed input
        double speed = double.Parse(Console.ReadLine());

        // Categorize the speed based on its value
        if (speed <= 10)
        {
            Console.WriteLine("slow");
        }
        else if (speed <= 50)
        {
            Console.WriteLine("average");
        }
        else if (speed <= 150)
        {
            Console.WriteLine("fast");
        }
        else if (speed <= 1000)
        {
            Console.WriteLine("ultra fast");
        }
        else
        {
            Console.WriteLine("extremely fast");
        }
    }
}
