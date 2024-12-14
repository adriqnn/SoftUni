using System;

public class _07_TrekkingMania
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int countAll = 0;
        double m5 = 0;
        double m4 = 0;
        double m3 = 0;
        double m2 = 0;
        double m1 = 0;

        // Calculate the total number of trekkers and the number of trekkers in each group
        for (int i = 1; i <= n; i++)
        {
            int trekkers = int.Parse(Console.ReadLine());
            countAll += trekkers;

            // Distribute trekkers into different groups based on group size
            if (trekkers >= 41)
            {
                m5 += trekkers;
            }
            else if (trekkers >= 26)
            {
                m4 += trekkers;
            }
            else if (trekkers >= 13)
            {
                m3 += trekkers;
            }
            else if (trekkers >= 6)
            {
                m2 += trekkers;
            }
            else
            {
                m1 += trekkers;
            }
        }

        // Calculate and print the percentage distribution of trekkers in each group
        Console.WriteLine($"{(m1 / countAll * 100):F2}%");
        Console.WriteLine($"{(m2 / countAll * 100):F2}%");
        Console.WriteLine($"{(m3 / countAll * 100):F2}%");
        Console.WriteLine($"{(m4 / countAll * 100):F2}%");
        Console.WriteLine($"{(m5 / countAll * 100):F2}%");
    }
}

