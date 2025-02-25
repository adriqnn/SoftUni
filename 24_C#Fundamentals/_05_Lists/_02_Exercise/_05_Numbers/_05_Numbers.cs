using System;

public class _05_Numbers
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split().Select(int.Parse).ToList();
        int[] numbersArray = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int number = numbersArray[0];
        int power = numbersArray[1];

        // Remove numbers based on value
        for (int i = 0; i < numbersList.Count; i++)
        {
            if (numbersList[i] == number)
            {
                numbersList = removeNumbersFromListWithPower(numbersList, i, power);
                i--;
            }
        }

        // Create method to print the sum of the numbers
        printSum(numbersList);
    }

    private static void printSum(List<int> numbersList)
    {
        int sum = 0;

        for (int i = 0; i < numbersList.Count; i++)
        {
            sum += numbersList[i];
        }

        Console.WriteLine(sum);
    }

    private static List<int> removeNumbersFromListWithPower(List<int> numbersList, int i, int power)
    {
        List<int> newList = new List<int>();

        if (i + power >= numbersList.Count - 1 && i - power < 0)
        {
            return newList;
        }
        else if (i + power >= numbersList.Count - 1)
        {
            for (int j = 0; j < i - power; j++)
            {
                newList.Add(numbersList[j]);
            }

            return newList;
        }
        else if (i - power < 0)
        {
            for (int j = i + power + 1; j < numbersList.Count; j++)
            {
                newList.Add(numbersList[j]);
            }

            return newList;
        }
        else
        {
            for (int j = 0; j < i - power; j++)
            {
                newList.Add(numbersList[j]);
            }

            for (int j = i + power + 1; j < numbersList.Count; j++)
            {
                newList.Add(numbersList[j]);
            }

            return newList;
        }
    }
}
