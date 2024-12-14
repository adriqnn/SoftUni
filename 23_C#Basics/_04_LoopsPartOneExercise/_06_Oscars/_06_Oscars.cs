using System;

public class _06_Oscars
{
    public static void Main(string[] args)
    {
        // Read input values
        string actorName = Console.ReadLine();
        double academyPoints = double.Parse(Console.ReadLine());
        int numberOfJury = int.Parse(Console.ReadLine());

        double totalPoints = academyPoints;

        for (int i = 0; i < numberOfJury; i++)
        {
            string nameOfJuror = Console.ReadLine();
            double points = double.Parse(Console.ReadLine());

            // Calculate additional points based on the juror's name length
            totalPoints += points * nameOfJuror.Length / 2;

            // Check if the actor has enough points to get a nominee
            if (totalPoints >= 1250.5)
            {
                break;
            }
        }

        // Print the result based on the total points
        if (totalPoints >= 1250.5)
        {
            Console.WriteLine($"Congratulations, {actorName} got a nominee for leading role with {totalPoints:F1}!");
        }
        else
        {
            Console.WriteLine($"Sorry, {actorName} you need {1250.5 - totalPoints:F1} more!");
        }
    }
}
