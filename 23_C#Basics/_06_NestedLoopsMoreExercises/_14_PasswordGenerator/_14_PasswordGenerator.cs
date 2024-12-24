using System;

public class _14_PasswordGenerator
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        int l = int.Parse(Console.ReadLine());

        // Determine the correct output based on the requirements and print
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                for (char k = 'a'; k < 'a' + l; k++)
                {
                    for (char m = 'a'; m < 'a' + l; m++)
                    {
                        for (int o = 1; o <= n; o++)
                        {
                            if (o > i && o > j)
                            {
                                Console.Write($"{i}{j}{k}{m}{o} ");
                            }
                        }
                    }
                }
            }
        }
    }
}
