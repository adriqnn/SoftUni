using System;

public class _07_VendingMachine
{
    public static void Main(string[] args)
    {
        // Read input value
        String console = Console.ReadLine();

        // Add variable
        double sum = 0;

        // Sum the coins
        while (console != "Start")
        {
            double coins = double.Parse(console);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0)
            {
                sum += coins;
            }
            else
            {
                Console.WriteLine($"Cannot accept {coins}");
            }

            console = Console.ReadLine();
        }

        // Read additional input
        string product = Console.ReadLine();

        // Use vending machine
        while (product != "End")
        {
            if (product == "Nuts")
            {
                sum -= 2.0;

                if (sum >= 0)
                {
                    Console.WriteLine("Purchased nuts");
                }
                else
                {
                    Console.WriteLine("Sorry, not enough money");
                    sum += 2.0;
                }
            }
            else if (product == "Water")
            {
                sum -= 0.7;

                if (sum >= 0)
                {
                    Console.WriteLine("Purchased water");
                }
                else
                {
                    Console.WriteLine("Sorry, not enough money");
                    sum += 0.7;
                }
            }
            else if (product == "Crisps")
            {
                sum -= 1.5;

                if (sum >= 0)
                {
                    Console.WriteLine("Purchased crisps");
                }
                else
                {
                    Console.WriteLine("Sorry, not enough money");
                    sum += 1.5;
                }
            }
            else if (product == "Soda")
            {
                sum -= 0.8;

                if (sum >= 0)
                {
                    Console.WriteLine("Purchased soda");
                }
                else
                {
                    Console.WriteLine("Sorry, not enough money");
                    sum += 0.8;
                }
            }
            else if (product == "Coke")
            {
                sum -= 1.0;

                if (sum >= 0)
                {
                    Console.WriteLine("Purchased coke");
                }
                else
                {
                    Console.WriteLine("Sorry, not enough money");
                    sum += 1.0;
                }
            }
            else
            {
                Console.WriteLine("Invalid product");
            }

            product = Console.ReadLine();
        }

        Console.WriteLine($"Change: {sum:F2}");
    }
}
