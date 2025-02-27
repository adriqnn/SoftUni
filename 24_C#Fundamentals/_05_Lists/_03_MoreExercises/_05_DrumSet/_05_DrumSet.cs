using System;
using System.Xml.Linq;

public class _05_DrumSet
{
    public static void Main(string[] args)
    {
        // Read input values
        double moneyToSpend = double.Parse(Console.ReadLine());
        List<int> drumsBaseQuality = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

        // Add variable
        List<int> drumsActualQualityNow = new List<int>(drumsBaseQuality);

        String commands = Console.ReadLine();

        // Calculate the quality of drums based on the hit power
        while (!commands.Equals("Hit it again, Gabsy!"))
        {
            int hitPower = int.Parse(commands);

            for (int i = 0; i < drumsActualQualityNow.Count; i++)
            {
                drumsActualQualityNow[i] -= hitPower;
            }

            for (int i = 0; i < drumsActualQualityNow.Count; i++)
            {
                if (drumsActualQualityNow[i] <= 0)
                {
                    if (moneyToSpend - (drumsBaseQuality[i] * 3) >= 0)
                    {
                        drumsActualQualityNow[i] = drumsBaseQuality[i];
                        moneyToSpend -= drumsBaseQuality[i] * 3;
                    }
                    else
                    {
                        drumsBaseQuality.RemoveAt(i);
                        drumsActualQualityNow.RemoveAt(i);
                    }
                }
            }

            commands = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", drumsActualQualityNow));
        Console.WriteLine($"Gabsy has {moneyToSpend:F2}lv.");
    }
}
