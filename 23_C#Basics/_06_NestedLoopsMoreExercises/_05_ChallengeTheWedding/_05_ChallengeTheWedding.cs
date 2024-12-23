using System;

public class _05_ChallengeTheWedding
{
    public static void Main(string[] args)
    {
        // Read input values
        int clientsM = int.Parse(Console.ReadLine());
        int clientsF = int.Parse(Console.ReadLine());
        int maxTables = int.Parse(Console.ReadLine());

        // Arrange guest based on gender and free tables
        for (int i = 1; i <= clientsM; i++)
        {
            for (int j = 1; j <= clientsF; j++)
            {
                if (maxTables == 0)
                {
                    break;
                }

                maxTables--;
                Console.Write($"({i} <-> {j}) ");
            }

            if (maxTables == 0)
            {
                break;
            }
        }
    }
}
