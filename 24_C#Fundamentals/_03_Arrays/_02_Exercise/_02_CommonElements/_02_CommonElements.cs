using System;

public class _02_CommonElements
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] arrOne = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        string[] arrTwo = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        // Print common elements in two arrays
        for (int i = 0; i < arrOne.Length; i++)
        {
            for (int j = 0; j < arrTwo.Length; j++)
            {

                if (arrOne[i].Equals(arrTwo[j]))
                {
                   Console.Write(arrTwo[j] + " ");
                }
            }
        }
    }
}
