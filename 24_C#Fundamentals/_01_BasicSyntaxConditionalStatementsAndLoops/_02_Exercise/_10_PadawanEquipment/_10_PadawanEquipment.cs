using System;

public class _10_PadawanEquipment
{
    public static void Main(string[] args)
    {
        // Read input values
        double budget = double.Parse(Console.ReadLine());
        int students = int.Parse(Console.ReadLine());
        double sabers = double.Parse(Console.ReadLine());
        double robes = double.Parse(Console.ReadLine());
        double belts = double.Parse(Console.ReadLine());

        // Add variable
        int count = 0;

        // Every 6th student
        for (int i = 0; i < students; i = i + 6)
        {
            count++;
        }

        // More calculations
        double sabers2 = Math.Ceiling(students * 1.10) * sabers;
        double robes2 = students * robes;
        double belts2 = (students - (count - 1)) * belts;
        double total = sabers2 + robes2 + belts2;

        // Print result
        if (total <= budget)
        {
            Console.WriteLine($"The money is enough - it would cost {total:F2}lv.");
        }
        else
        {
            Console.WriteLine($"John will need {total - budget:F2}lv more.");
        }
    }
}
