using System;

public class _07_ProjectsCreation
{
    public static void Main(string[] args)
    {
        // Read input data
        string name = Console.ReadLine();
        int projectsCount = int.Parse(Console.ReadLine());

        // Calculate total hours
        int allHours = projectsCount * 3;

        // Print formatted message
        Console.WriteLine($"The architect {name} will need {allHours} hours to complete {projectsCount} project/s.");
    }
}
