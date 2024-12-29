using System;

public class _06_FlowerShop
{
    public static void Main(string[] args)
    {
        // Read input values
        int magnolias = int.Parse(Console.ReadLine());
        int hyacinths = int.Parse(Console.ReadLine());
        int roses = int.Parse(Console.ReadLine());
        int cacti = int.Parse(Console.ReadLine());
        double presentCost = double.Parse(Console.ReadLine());

        // Calculate total price for flowers
        double totalPriceForFlowers = ((magnolias * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cacti * 8)) * 0.95;

        // Calculate the difference between present cost and flower cost
        double enoughMoney = presentCost - totalPriceForFlowers;

        // Print the result
        if (enoughMoney > 0)
        {
            Console.WriteLine($"She will have to borrow {Math.Ceiling(enoughMoney):F0} leva.");
        }
        else
        {
            Console.WriteLine($"She is left with {Math.Floor(Math.Abs(enoughMoney)):F0} leva.");
        }
    }
}
