using System;

public class _01_EncryptSortAndPrintArray
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Add variable
        int[] listOfNamesValues = new int[num];

        // Transform the strings into numeric values
        for (int i = 0; i < num; i++)
        {
            String console = Console.ReadLine();

            int sum = 0;

            for (int j = 0; j < console.Length; j++)
            {
                char symbol = console[j];

                if (symbol == 'a' || symbol == 'e' || symbol == 'u' || symbol == 'i' || symbol == 'o')
                {
                    sum += symbol * console.Length;
                }
                else if (symbol == 'A' || symbol == 'E' || symbol == 'U' || symbol == 'I' || symbol == 'O')
                {
                    sum += symbol * console.Length;
                }
                else
                {
                    sum += symbol / console.Length;
                }
            }

            listOfNamesValues[i] = sum;
        }

        // Print result
        Array.Sort(listOfNamesValues);
        foreach (int value in listOfNamesValues)
        {
            Console.WriteLine(value);
        }
    }
}
