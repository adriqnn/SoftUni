using System;

public class _08_Graduation
{
    public static void Main(string[] args)
    {
        // Read input value
        string name = Console.ReadLine();

        // Add variables
        int excluded = 0;
        int count = 1;
        double sum = 0;

        // Use a while loop to input and process the student's grades
        while (count <= 12)
        {
            double grade = double.Parse(Console.ReadLine());

            if (grade < 4.0)
            {
                excluded++;
            }
            else
            {
                count++;
            }

            // Check if the student has been excluded
            if (excluded > 1)
            {
                break;
            }

            sum += grade;
        }

        // Display the result based on the student's status
        if (excluded > 1)
        {
            Console.WriteLine($"{name} has been excluded at {count} grade");
        }
        else
        {
            double averageGrade = sum / 12;
            Console.WriteLine($"{name} graduated. Average grade: {averageGrade:F2}");
        }
    }
}
