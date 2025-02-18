using System;

public class _01_Train
{
    public static void Main(string[] args)
    {
        // Read input value
        int countOfTrainWagons = int.Parse(Console.ReadLine());

        // Add variables
        int[] train = new int[countOfTrainWagons];
        int sum = 0;

        // Add passengers to the train and sum all of them
        for (int i = 0; i < countOfTrainWagons; i++)
        {
            train[i] = int.Parse(Console.ReadLine());
            sum += train[i];
        }

        // Print result
        Console.WriteLine(string.Join(" ", train));
        Console.WriteLine(sum);
    }
}
