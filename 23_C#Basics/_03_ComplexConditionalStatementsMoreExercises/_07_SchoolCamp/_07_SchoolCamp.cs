using System;

public class _07_SchoolCamp
{
    public static void Main(string[] args)
    {
        // Read input values
        string season = Console.ReadLine().ToLower();
        string groupType = Console.ReadLine().ToLower();
        int studentsCount = int.Parse(Console.ReadLine());
        int nightsCount = int.Parse(Console.ReadLine());

        // Add variables
        double price = 0;
        string sport = "";

        // Calculate initial price for all the students
        if (season == "winter")
        {
            price = groupType == "mixed" ? studentsCount * 10 * nightsCount : studentsCount * 9.60 * nightsCount;
            if (groupType == "girls")
            {
                sport = "Gymnastics";
            }
            else if (groupType == "boys")
            {
                sport = "Judo";
            }
            else
            {
                sport = "Ski";
            }
        }
        else if (season == "spring")
        {
            price = groupType == "mixed" ? studentsCount * 9.50 * nightsCount : studentsCount * 7.20 * nightsCount;
            if (groupType == "girls")
            {
                sport = "Athletics";
            }
            else if (groupType == "boys")
            {
                sport = "Tennis";
            }
            else
            {
                sport = "Cycling";
            }
        }
        else
        {
            price = groupType == "mixed" ? studentsCount * 20 * nightsCount : studentsCount * 15 * nightsCount;
            if (groupType == "girls")
            {
                sport = "Volleyball";
            }
            else if (groupType == "boys")
            {
                sport = "Football";
            }
            else
            {
                sport = "Swimming";
            }
        }

        // Add in the discount
        if (studentsCount >= 10 && studentsCount < 20)
        {
            price *= 0.95;
        }
        else if (studentsCount >= 20 && studentsCount < 50)
        {
            price *= 0.85;
        }
        else if (studentsCount >= 50)
        {
            price *= 0.50;
        }

        // Print the result
        Console.WriteLine($"{sport} {price:F2} lv.");
    }
}
