using System;

public class _11_FruitShop
{
    public static void Main(string[] args)
    {
        // Read input values
        string fruit = Console.ReadLine();
        string day = Console.ReadLine();
        double quantity = double.Parse(Console.ReadLine());

        // Check if the inputs are valid
        bool isValidFruit = (fruit == "banana" || fruit == "apple" || fruit == "orange" || fruit == "grapefruit" || fruit == "kiwi" || fruit == "pineapple" || fruit == "grapes");
        bool isValidWeekDay = (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday" || day == "Saturday" || day == "Sunday");

        // End the program if either input is invalid
        if (!isValidFruit || !isValidWeekDay)
        {
            Console.WriteLine("error");
            return;
        }

        // Print the result
        if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday")
        {
            if (fruit == "banana")
            {
                Console.WriteLine($"{quantity * 2.50:F2}");
            }
            else if (fruit == "apple")
            {
                Console.WriteLine($"{quantity * 1.20:F2}");
            }
            else if (fruit == "orange")
            {
                Console.WriteLine($"{quantity * 0.85:F2}");
            }
            else if (fruit == "grapefruit")
            {
                Console.WriteLine($"{quantity * 1.45:F2}");
            }
            else if (fruit == "kiwi")
            {
                Console.WriteLine($"{quantity * 2.70:F2}");
            }
            else if (fruit == "pineapple")
            {
                Console.WriteLine($"{quantity * 5.50:F2}");
            }
            else
            {
                Console.WriteLine($"{quantity * 3.85:F2}");
            }
        }
        else
        {
            if (fruit == "banana")
            {
                Console.WriteLine($"{quantity * 2.70:F2}");
            }
            else if (fruit == "apple")
            {
                Console.WriteLine($"{quantity * 1.25:F2}");
            }
            else if (fruit == "orange")
            {
                Console.WriteLine($"{quantity * 0.90:F2}");
            }
            else if (fruit == "grapefruit")
            {
                Console.WriteLine($"{quantity * 1.60:F2}");
            }
            else if (fruit == "kiwi")
            {
                Console.WriteLine($"{quantity * 3.00:F2}");
            }
            else if (fruit == "pineapple")
            {
                Console.WriteLine($"{quantity * 5.60:F2}");
            }
            else
            {
                Console.WriteLine($"{quantity * 4.20:F2}");
            }
        }
    }
}
