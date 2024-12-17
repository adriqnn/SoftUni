using System;

public class _03_Vacation
{
    public static void Main(string[] args)
    {
        // Read input values
        double vacationCost = double.Parse(Console.ReadLine());
        double initialMoney = double.Parse(Console.ReadLine());

        // Add variables
        int daysSpent = 0;
        int daysPassed = 0;

        // Use a while loop to track the progress of saving money for the vacation
        while (initialMoney < vacationCost)
        {
            string action = Console.ReadLine();
            double amount = double.Parse(Console.ReadLine());

            daysPassed++;

            if (action == "save")
            {
                daysSpent = 0;
                initialMoney += amount;
            }
            else if (action == "spend")
            {
                daysSpent++;
                initialMoney -= amount;

                if (initialMoney < 0)
                {
                    initialMoney = 0;
                }
            }

            if (daysSpent == 5)
            {
                Console.WriteLine("You can't save the money.");
                Console.WriteLine(daysPassed);
                break;
            }
        }

        // Display the result based on whether the vacation cost was met
        if (initialMoney >= vacationCost)
        {
            Console.WriteLine($"You saved the money for {daysPassed} days.");
        }
    }
}
