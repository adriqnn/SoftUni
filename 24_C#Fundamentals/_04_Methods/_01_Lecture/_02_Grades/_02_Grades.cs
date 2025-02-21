using System;

public class _02_Grades
{
    public static void Main(string[] args)
    {
        // Read input value
        double grade = double.Parse(Console.ReadLine());

        // Create method to qualify grades
        whatIsTheGrade(grade);
    }

    private static void whatIsTheGrade(double grade)
    {
        if (grade >= 2.00 && grade < 3.00)
        {
            Console.WriteLine("Fail");
        }
        else if (grade < 3.50)
        {
            Console.WriteLine("Poor");
        }
        else if (grade < 4.50)
        {
            Console.WriteLine("Good");
        }
        else if (grade < 5.50)
        {
            Console.WriteLine("Very good");
        }
        else if (grade < 6.00)
        {
            Console.WriteLine("Excellent");
        }
    }
}
