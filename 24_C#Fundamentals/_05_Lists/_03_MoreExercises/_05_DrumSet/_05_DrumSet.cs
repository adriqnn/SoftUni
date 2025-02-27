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
                drumsActualQualityNow.set(i, (drumsActualQualityNow.get(i) - hitPower));
            }

            for (int i = 0; i < drumsActualQualityNow.size(); i++)
            {
                if (drumsActualQualityNow.get(i) <= 0)
                {
                    if (moneyToSpend - (drumsBaseQuality.get(i) * 3) >= 0)
                    {
                        drumsActualQualityNow.set(i, drumsBaseQuality.get(i));
                        moneyToSpend -= drumsBaseQuality.get(i) * 3;
                    }
                    else
                    {
                        drumsBaseQuality.remove(i);
                        drumsActualQualityNow.remove(i);
                    }
                }
            }

            commands = scan.nextLine();
        }

        // Print result
        drumsActualQualityNow.stream().forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", moneyToSpend);
    }
}
