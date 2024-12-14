using System;

public class _03_Histogram
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        // Read integers and count them in different ranges
        for (int i = 1; i <= n; i++)
        {
            int num = int.Parse(Console.ReadLine());

            if (num < 200)
            {
                p1++;
            }
            else if (num < 400)
            {
                p2++;
            }
            else if (num < 600)
            {
                p3++;
            }
            else if (num < 800)
            {
                p4++;
            }
            else
            {
                p5++;
            }
        }

        // Calculate the percentages
        double pp1 = ((1.00 * p1) / n) * 100;
        double pp2 = ((1.00 * p2) / n) * 100;
        double pp3 = ((1.00 * p3) / n) * 100;
        double pp4 = ((1.00 * p4) / n) * 100;
        double pp5 = ((1.00 * p5) / n) * 100;

        // Print the percentages with two decimal places
        Console.WriteLine($"{pp1:F2}%");
        Console.WriteLine($"{pp2:F2}%");
        Console.WriteLine($"{pp3:F2}%");
        Console.WriteLine($"{pp4:F2}%");
        Console.WriteLine($"{pp5:F2}%");
    }
}
