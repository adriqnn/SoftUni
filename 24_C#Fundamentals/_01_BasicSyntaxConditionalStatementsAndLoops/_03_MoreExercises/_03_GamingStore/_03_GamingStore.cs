using System;

public class _03_GamingStore
{
    public static void Main(string[] args)
    {
        // Read input values
        double balance = double.Parse(Console.ReadLine());
        string input = Console.ReadLine();

        // Add variables
        double budget = balance;
        double spent = 0;

        // Make statistics for game-store
        while (input != "Game Time")
        {
            if (input == "OutFall 4")
            {
                budget -= 39.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 39.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought OutFall 4");
                spent += 39.99;
            }
            else if (input == "CS: OG")
            {
                budget -= 15.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 15.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought CS: OG");
                spent += 15.99;
            }
            else if (input == "Zplinter Zell")
            {
                budget -= 19.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 19.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought Zplinter Zell");
                spent += 19.99;
            }
            else if (input == "Honored 2")
            {
                budget -= 59.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 59.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought Honored 2");
                spent += 59.99;
            }
            else if (input == "RoverWatch")
            {
                budget -= 29.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 29.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought RoverWatch");
                spent += 29.99;
            }
            else if (input == "RoverWatch Origins Edition")
            {
                budget -= 39.99;

                if (budget < 0)
                {
                    Console.WriteLine("Too Expensive");
                    budget += 39.99;
                    input = Console.ReadLine();
                    continue;
                }

                Console.WriteLine("Bought RoverWatch Origins Edition");
                spent += 39.99;
            }
            else
            {
                Console.WriteLine("Not Found");
            }

            if (budget == 0)
            {
                Console.WriteLine("Out of money!");
                break;
            }

            input = Console.ReadLine();
        }

        // Print result
        if (input == "Game Time")
        {
            Console.WriteLine($"Total spent: ${spent:F2}. Remaining: ${balance - spent:F2}");
        }
    }
}
