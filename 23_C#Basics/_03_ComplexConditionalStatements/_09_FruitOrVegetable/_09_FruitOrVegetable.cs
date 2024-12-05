using System;

public class _09_FruitOrVegetable
{
    public static void Main(string[] args)
    {
        // Read input value
        string entry = Console.ReadLine();

        // Print based on the input if the item is fruit, vegetable or unknown
        switch (entry)
        {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                Console.WriteLine("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                Console.WriteLine("vegetable");
                break;
            default:
                Console.WriteLine("unknown");
                break;
        }
    }
}

