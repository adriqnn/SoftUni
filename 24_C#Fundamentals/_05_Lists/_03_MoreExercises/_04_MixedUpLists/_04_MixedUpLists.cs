using System;
using System.Xml.Linq;

public class _04_MixedUpLists
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersListOne = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
        List<int> numbersListTwo = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

        // Add variable
        int[] numbers = new int[2];

        // Determine remaining elements
        if (numbersListOne.Count > numbersListTwo.Count)
        {
            numbers[0] = numbersListOne[numbersListOne.Count - 1];
            numbers[1] = numbersListOne[numbersListOne.Count - 2];

            numbersListOne.RemoveAt(numbersListOne.Count - 1);
            numbersListOne.RemoveAt(numbersListOne.Count - 1);
        }
        else
        {
            numbers[0] = numbersListTwo[0];
            numbers[1] = numbersListTwo[1];

            numbersListTwo.RemoveAt(0);
            numbersListTwo.RemoveAt(1);
        }

        numbersListOne.AddRange(numbersListTwo);
        numbersListTwo.Clear();

        // Sort range elements
        Array.Sort(numbers);

        // Check and save elements that fit the requirement
        foreach (int num in numbersListOne)
        {
            if (num > numbers[0] && num < numbers[1])
            {
                numbersListTwo.Add(num);
            }
        }


        numbersListTwo.Sort();

        // Print result
        Console.WriteLine(string.Join(" ", numbersListTwo));
    }
}
