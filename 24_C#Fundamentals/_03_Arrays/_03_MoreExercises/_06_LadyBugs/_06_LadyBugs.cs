using System;

public class _06_LadyBugs
{
    public static void Main(string[] args)
    {
        // Read input values
        int fieldSize = int.Parse(Console.ReadLine());
        int[] initialPositions = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Initialize positions
        int[] positionsInTheField = new int[fieldSize];
        foreach (int e in initialPositions)
        {
            if (e >= 0 && e < fieldSize)
            {
                positionsInTheField[e] = 1;
            }
        }

        string commands = Console.ReadLine();

        // Change positions of the ladybugs based on commands
        while (!commands.Equals("end"))
        {
            string[] commandLine = commands.Split();

            int bugIndex = int.Parse(commandLine[0]);
            string bugMoveDirection = commandLine[1];
            int bugMoves = int.Parse(commandLine[2]);

            if (bugMoveDirection.Equals("left") && (bugIndex >= 0 && bugIndex < fieldSize) && (positionsInTheField[bugIndex] == 1))
            {
                positionsInTheField[bugIndex] = 0;

                if (bugIndex - bugMoves >= 0)
                {
                    for (int i = bugIndex - bugMoves; i >= 0; i -= bugMoves)
                    {
                        if (positionsInTheField[i] == 0)
                        {
                            positionsInTheField[i] = 1;
                            break;
                        }
                    }
                }

            }
            else if (bugMoveDirection.Equals("right") && (bugIndex >= 0 && bugIndex < fieldSize) && (positionsInTheField[bugIndex] == 1))
            {
                positionsInTheField[bugIndex] = 0;

                if (bugIndex + bugMoves < fieldSize)
                {
                    for (int i = bugIndex + bugMoves; i < fieldSize; i += bugMoves)
                    {
                        if (positionsInTheField[i] == 0)
                        {
                            positionsInTheField[i] = 1;
                            break;
                        }
                    }
                }

            }

            commands = Console.ReadLine();
        }

        // Print result
        Console.Write(string.Join(" ", positionsInTheField));
    }
}
