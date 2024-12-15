using System;

public class _04_Grades
{
    public static void Main(string[] args)
    {
        // Read input values
        int examStudentsCount = int.Parse(Console.ReadLine());

        // Add variables
        double allTheGrades = 0;
        double topStudents = 0;
        double studentsWith4 = 0;
        double studentsWith3 = 0;
        double failedStudents = 0;

        // Process each student's grade and calculate statistics
        for (int i = 0; i < examStudentsCount; i++)
        {
            double grade = double.Parse(Console.ReadLine());

            if (grade >= 5.00)
            {
                topStudents++;
            }
            else if (grade >= 4.00)
            {
                studentsWith4++;
            }
            else if (grade >= 3.00)
            {
                studentsWith3++;
            }
            else
            {
                failedStudents++;
            }

            allTheGrades += grade;
        }

        // Calculate and print the statistics
        Console.WriteLine("Top students: {0:F2}%", topStudents / examStudentsCount * 100);
        Console.WriteLine("Between 4.00 and 4.99: {0:F2}%", studentsWith4 / examStudentsCount * 100);
        Console.WriteLine("Between 3.00 and 3.99: {0:F2}%", studentsWith3 / examStudentsCount * 100);
        Console.WriteLine("Fail: {0:F2}%", failedStudents / examStudentsCount * 100);
        Console.WriteLine("Average: {0:F2}", allTheGrades / examStudentsCount);
    }
}
