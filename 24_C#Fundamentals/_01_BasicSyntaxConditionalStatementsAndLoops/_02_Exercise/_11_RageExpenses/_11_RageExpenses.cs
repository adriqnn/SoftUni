using System;
using System.Text;

public class _11_RageExpenses
{
    public static void Main(string[] args)
    {
        // Read input values from the console
        int l = int.Parse(Console.ReadLine());
        double headset = double.Parse(Console.ReadLine());
        double mouse = double.Parse(Console.ReadLine());
        double keyboard = double.Parse(Console.ReadLine());
        double display = double.Parse(Console.ReadLine());

        // Add variables
        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;

        // Make a statistic for the items
        for (int i = 1; i <= l; i++)
        {
            if (i % 2 == 0)
            {
                headsetCount++;
            }
            if (i % 3 == 0)
            {
                mouseCount++;
            }
            if (i % 2 == 0 && i % 3 == 0)
            {
                keyboardCount++;
            }
        }

        // Calculate prices
        double displayCount = Math.Floor(keyboardCount / 2.0);
        double totalExpenses = (headset * headsetCount) + (mouse * mouseCount) + (keyboard * keyboardCount) + (display * displayCount);

        // Print result
        Console.WriteLine($"Rage expenses: {totalExpenses:F2} lv.");
    }
}
