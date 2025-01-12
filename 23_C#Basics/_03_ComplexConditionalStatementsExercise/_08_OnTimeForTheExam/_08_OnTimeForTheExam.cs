using System;

public class _08_OnTimeForTheExam
{
    public static void Main(string[] args)
    {
        // Read input values
        int hourOfExam = int.Parse(Console.ReadLine());
        int minuteOfExam = int.Parse(Console.ReadLine());
        int hourOfArrival = int.Parse(Console.ReadLine());
        int minuteOfArrival = int.Parse(Console.ReadLine());

        // Transforming the data into minutes
        int examInMinutes = (hourOfExam * 60) + minuteOfExam;
        int arrivalInMinutes = (hourOfArrival * 60) + minuteOfArrival;

        // Calculating the time late/early
        int lateMinutes = arrivalInMinutes - examInMinutes;
        int earlyMinutes = examInMinutes - arrivalInMinutes;

        string timeUnit = "";
        int value1 = 0;
        int value2 = 0;

        // Determine if arrival is late or early and printing information based on that
        if (examInMinutes == arrivalInMinutes)
        {
            Console.WriteLine("On Time");
        }
        else if (examInMinutes < arrivalInMinutes)
        {
            if (lateMinutes >= 60)
            {
                timeUnit = "hours";
                value1 = lateMinutes / 60;
                value2 = lateMinutes % 60;
                
                if (value2 < 10)
                {
                    Console.WriteLine("Late");
                    Console.WriteLine($"{value1}:0{value2} {timeUnit} after the start");
                }
                else
                {
                    Console.WriteLine("Late");
                    Console.WriteLine($"{value1}:{value2} {timeUnit} after the start");
                }
            }
            else
            {
                timeUnit = "minutes";
                
                Console.WriteLine("Late");
                Console.WriteLine($"{lateMinutes} {timeUnit} after the start");
            }
        }
        else
        {
            if (earlyMinutes <= 30)
            {
                timeUnit = "minutes";
                
                Console.WriteLine("On time");
                Console.WriteLine($"{earlyMinutes} {timeUnit} before the start");
            }
            else
            {
                if (earlyMinutes >= 60)
                {
                    timeUnit = "hours";
                    
                    value1 = earlyMinutes / 60;
                    value2 = earlyMinutes % 60;
                    
                    if (value2 < 10)
                    {
                        Console.WriteLine("Early");
                        Console.WriteLine($"{value1}:0{value2} {timeUnit} before the start");
                    }
                    else
                    {
                        Console.WriteLine("Early");
                        Console.WriteLine($"{value1}:{value2} {timeUnit} before the start");
                    }
                }
                else
                {
                    timeUnit = "minutes";
                    
                    Console.WriteLine("Early");
                    Console.WriteLine($"{earlyMinutes} {timeUnit} before the start");
                }
            }
        }
    }
}
