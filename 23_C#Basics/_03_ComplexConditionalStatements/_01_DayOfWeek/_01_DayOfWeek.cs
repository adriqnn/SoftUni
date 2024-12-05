using System;

public class _01_DayOfWeek
{
    public static void Main(string[] args)
    {
        // Read input value for day of the week
        int day = int.Parse(Console.ReadLine());

        // Check and print day of the week if it's valid
        switch (day)
        {
            case 1:
                Console.WriteLine("Monday");
                break;
            case 2:
                Console.WriteLine("Tuesday");
                break;
            case 3:
                Console.WriteLine("Wednesday");
                break;
            case 4:
                Console.WriteLine("Thursday");
                break;
            case 5:
                Console.WriteLine("Friday");
                break;
            case 6:
                Console.WriteLine("Saturday");
                break;
            case 7:
                Console.WriteLine("Sunday");
                break;
            default:
                Console.WriteLine("Error");
                break;
        }
    }
}
