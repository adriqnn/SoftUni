using System;

public class _05_ChallengeTheWeddingV2
{
    public static void Main(string[] args)
    {
        // Read input values
        int clientsM = int.Parse(Console.ReadLine());
        int clientsF = int.Parse(Console.ReadLine());
        int maxTables = int.Parse(Console.ReadLine());

        // A boolean to indicate when we've run out of tables
        bool noMoreTables = false;

        for (int i = 1; i <= clientsM && !noMoreTables; i++)
        {
            for (int j = 1; j <= clientsF; j++)
            {
                if (maxTables == 0)
                {
                    noMoreTables = true;
                    break; // Break out of the inner loop
                }

                maxTables--;
                Console.Write($"({i} <-> {j}) ");
            }
        }
    }
}
