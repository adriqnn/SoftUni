using System;

public class _03_AnimalType
{
    public static void Main(string[] args)
    {
        // Read animal input value
        string animal = Console.ReadLine().ToLower();

        // Determine whether the animal is mammal, reptile or unknown
        switch (animal)
        {
            case "dog":
                Console.WriteLine("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                Console.WriteLine("reptile");
                break;
            default:
                Console.WriteLine("unknown");
                break;
        }
    }
}
