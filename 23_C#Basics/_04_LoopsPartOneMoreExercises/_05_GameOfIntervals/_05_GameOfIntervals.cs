using System;

public class _05_GameOfIntervals
{
    public static void Main(string[] args)
    {
        // Read input value
        int gameTurns = int.Parse(Console.ReadLine());

        // Add variables
        double gameResult = 0;
        double invalidNumbers = 0;
        double numbersFrom0to9 = 0;
        double numbersFrom10to19 = 0;
        double numbersFrom20to29 = 0;
        double numbersFrom30to39 = 0;
        double numbersFrom40to50 = 0;

        // Process each game turn and calculate statistics
        for (int i = 0; i < gameTurns; i++)
        {
            int gameNumber = int.Parse(Console.ReadLine());

            if (gameNumber < 0 || gameNumber > 50)
            {
                invalidNumbers++;
                if (gameResult > 0)
                {
                    gameResult /= 2;
                }
            }
            else if (gameNumber <= 9)
            {
                numbersFrom0to9++;
                gameResult += gameNumber * 0.2;
            }
            else if (gameNumber <= 19)
            {
                numbersFrom10to19++;
                gameResult += gameNumber * 0.3;
            }
            else if (gameNumber <= 29)
            {
                numbersFrom20to29++;
                gameResult += gameNumber * 0.4;
            }
            else if (gameNumber <= 39)
            {
                numbersFrom30to39++;
                gameResult += 50;
            }
            else
            {
                numbersFrom40to50++;
                gameResult += 100;
            }
        }

        // Calculate and print the statistics
        Console.WriteLine("{0:F2}", gameResult);
        Console.WriteLine("From 0 to 9: {0:F2}%", numbersFrom0to9 / gameTurns * 100);
        Console.WriteLine("From 10 to 19: {0:F2}%", numbersFrom10to19 / gameTurns * 100);
        Console.WriteLine("From 20 to 29: {0:F2}%", numbersFrom20to29 / gameTurns * 100);
        Console.WriteLine("From 30 to 39: {0:F2}%", numbersFrom30to39 / gameTurns * 100);
        Console.WriteLine("From 40 to 50: {0:F2}%", numbersFrom40to50 / gameTurns * 100);
        Console.WriteLine("Invalid numbers: {0:F2}%", invalidNumbers / gameTurns * 100);
    }
}
