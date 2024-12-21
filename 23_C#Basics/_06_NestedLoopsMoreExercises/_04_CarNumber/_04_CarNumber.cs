using System;

public class _04_CarNumber
{
    public static void Main(string[] args)
    {
        // Read input values
        int beginning = int.Parse(Console.ReadLine());
        int ending = int.Parse(Console.ReadLine());

        // Find special car numbers and print them
        for (int i = beginning; i <= ending; i++)
        {
            for (int j = beginning; j <= ending; j++)
            {
                for (int k = beginning; k <= ending; k++)
                {
                    for (int l = beginning; l <= ending; l++)
                    {
                        if ((i > l && ((j + k) % 2 == 0)))
                        {
                            if ((i % 2 == 0) && (l % 2 != 0))
                            {
                                Console.Write($"{i}{j}{k}{l} ");
                            }
                            else if ((i % 2 != 0) && (l % 2 == 0))
                            {
                                Console.Write($"{i}{j}{k}{l} ");
                            }
                        }
                    }
                }
            }
        }
    }
}
