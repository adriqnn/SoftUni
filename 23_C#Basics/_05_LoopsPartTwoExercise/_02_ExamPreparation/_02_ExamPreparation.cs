using System;

public class _02_ExamPreparation
{
    public static void Main(string[] args)
    {
        // Read input values
        int poorGradeThreshold = int.Parse(Console.ReadLine());
        string problemName = Console.ReadLine();

        // Add variables
        bool needBreak = false;
        int poorGradeCount = 0;
        double totalScore = 0;
        int problemCount = 0;
        string lastProblem = "";

        // Use a while loop to input and process the grades and problem names
        while (!problemName.Equals("Enough"))
        {
            int grade = int.Parse(Console.ReadLine());

            if (grade <= 4)
            {
                poorGradeCount++;

                if (poorGradeCount == poorGradeThreshold)
                {
                    needBreak = true;
                    break;
                }
            }

            lastProblem = problemName;
            totalScore += grade;
            problemCount++;

            problemName = Console.ReadLine();
        }

        if (needBreak)
        {
            Console.WriteLine($"You need a break, {poorGradeCount} poor grades.");
        }
        else
        {
            // Calculate and display the average score, problem count, and last problem
            double averageScore = totalScore / problemCount;
            Console.WriteLine($"Average score: {averageScore:F2}");
            Console.WriteLine($"Number of problems: {problemCount}");
            Console.WriteLine($"Last problem: {lastProblem}");
        }
    }
}
