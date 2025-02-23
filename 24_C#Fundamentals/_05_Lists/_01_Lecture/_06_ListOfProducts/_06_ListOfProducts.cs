using System;

public class _06_ListOfProducts
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<string> productsList = new List<string>();

        // Create list
        for (int i = 0; i < n; i++)
        {
            productsList.Add(Console.ReadLine());
        }

        // Arrange list
        productsList.Sort();

        // Print result
        for (int i = 0; i < productsList.Count; i++)
        {
            Console.WriteLine($"{i + 1}.{productsList[i]}");
        }
    }
}
