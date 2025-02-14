using System;

public class _09_CenturiesToMinutes
{
    public static void Main(string[] args)
    {
        // Read input value
        int centuries = int.Parse(Console.ReadLine());

        // Add variables
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        // Print result
        Console.WriteLine($"{centuries} centuries = {years:F0} years = {days:F0} days = {hours:F0} hours = {minutes:F0} minutes");
    }
}
