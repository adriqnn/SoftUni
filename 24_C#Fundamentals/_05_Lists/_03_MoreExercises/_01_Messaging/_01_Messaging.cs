using System;
using System.Text;

public class _01_Messaging
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
        StringBuilder consoleSentence = new StringBuilder(Console.ReadLine());

        // Decipher message
        for (int i = 0; i < numbersList.Count; i++)
        {
            string number = numbersList[i].ToString();

            int sum = 0;

            for (int j = 0; j < number.Length; j++)
            {
                char symbol = number[j];
                sum += symbol - '0';
            }

            numbersList[i] = sum;
        }

        StringBuilder lineToPrint = new StringBuilder();

        for (int i = 0; i < numbersList.Count; i++)
        {
            while (numbersList[i] > consoleSentence.Length - 1)
            {
                numbersList[i] = numbersList[i] - consoleSentence.Length;
            }

            lineToPrint.Append(consoleSentence[numbersList[i]]);
            consoleSentence.Remove(numbersList[i], 1);
        }

        // Print result
        Console.WriteLine(lineToPrint.ToString());
    }
}
