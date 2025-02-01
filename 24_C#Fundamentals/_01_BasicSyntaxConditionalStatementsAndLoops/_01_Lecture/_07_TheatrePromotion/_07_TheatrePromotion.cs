using System;

public class _07_TheatrePromotion
{
    public static void Main(string[] args)
    {
        // Read input values from the console
        string day = Console.ReadLine();
        int age = int.Parse(Console.ReadLine());

        // Print price of a theater ticket
        if (age < 0 || age > 122)
        {
            Console.WriteLine("Error!");
        }
        else if (age <= 18)
        {
            switch (day)
            {
                case "Weekday":
                    Console.WriteLine("12$");
                    break;
                case "Weekend":
                    Console.WriteLine("15$");
                    break;
                case "Holiday":
                    Console.WriteLine("5$");
                    break;
            }
        }
        else if (age <= 64)
        {
            switch (day)
            {
                case "Weekday":
                    Console.WriteLine("18$");
                    break;
                case "Weekend":
                    Console.WriteLine("20$");
                    break;
                case "Holiday":
                    Console.WriteLine("12$");
                    break;
            }
        }
        else
        {
            switch (day)
            {
                case "Weekday":
                    Console.WriteLine("12$");
                    break;
                case "Weekend":
                    Console.WriteLine("15$");
                    break;
                case "Holiday":
                    Console.WriteLine("10$");
                    break;
            }
        }
    }
}
