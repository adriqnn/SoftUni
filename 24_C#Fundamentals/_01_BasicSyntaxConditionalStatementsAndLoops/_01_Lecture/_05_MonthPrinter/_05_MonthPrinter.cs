using System;

public class _05_MonthPrinter
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Add variable
        string[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        // Print result
        try
        {
            Console.WriteLine(months[num - 1]);
        }catch (Exception e) {
            Console.WriteLine("Error!");
        }
    }
}
