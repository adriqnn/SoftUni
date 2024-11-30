using System;

public class _04_TransportPrice
{
    public static void Main(string[] args)
    {
        // Read the input
        int kilometers = int.Parse(Console.ReadLine());
        String timePeriod = Console.ReadLine();
        double tripPrice = 0;

        // Calculate the trip price based on different cases
        if (kilometers < 20)
        {
            if (timePeriod.Equals("day"))
            {
                tripPrice = 0.70 + (kilometers * 0.79);
            }
            else
            {
                tripPrice = 0.70 + (kilometers * 0.90);
            }
        }
        else if (kilometers < 100)
        {
            tripPrice = kilometers * 0.09;
        }
        else
        {
            tripPrice = kilometers * 0.06;
        }

        // Output the calculated trip price
        Console.WriteLine($"{tripPrice:F2}");
    }
}


