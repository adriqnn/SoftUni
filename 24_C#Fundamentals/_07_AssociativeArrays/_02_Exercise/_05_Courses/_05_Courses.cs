using System;

public class _05_Courses
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        Dictionary<string, List<string>> courses = new Dictionary<string, List<string>>();

        // Register courses
        while (!input.Equals("end"))
        {
            string[] courseInformation = input.Split(" : ");

            string course = courseInformation[0];
            string name = courseInformation[1];

            if (!courses.ContainsKey(course))
            {
                List<string> names = new List<string>();
                names.Add(name);

                courses[course] = names;
            }
            else
            {
                courses[course].Add(name);
            }

            input = Console.ReadLine();
        }

        // Print result
        foreach (var course in courses) 
        {
            Console.WriteLine($"{course.Key}: {course.Value.Count}");
            foreach (var e in course.Value)
            {
                Console.WriteLine($"-- {e}");
            }
        }
    }
}
