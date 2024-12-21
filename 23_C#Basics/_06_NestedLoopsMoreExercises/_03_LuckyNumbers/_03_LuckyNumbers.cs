using System;

public class _03_LuckyNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Find the numbers based on the requirement and print them
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    for (int l = 1; l <= 9; l++)
                    {
                        if ((i + j) == (k + l))
                        {
                            int num = int.Parse(string.Format($"{i}{j}{k}{l}"));
                            int sum = i + j;

                            if (n % sum == 0)
                            {
                                Console.Write($"{num} ");
                            }
                        }
                    }
                }
            }
        }
    }
}
