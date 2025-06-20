using System;

public class _06_StudentAcademy
{
    public static void Main(string[] args)
    {
        // Read input value
        int inputNumber = int.Parse(Console.ReadLine());

        // Add variable
        Dictionary<string, List<double>> students = new Dictionary<string, List<double>>();

        // Create Student stats
        for (int i = 0; i < inputNumber; i++)
        {
            string name = Console.ReadLine();
            double grade = double.Parse(Console.ReadLine());

            if (!students.ContainsKey(name))
            {
                students[name] = new List<double>();
            }

            students[name].Add(grade);
        }

        // Print result
        students.Where(s => s.Value.Average() >= 4.5).ToList().ForEach(s => Console.WriteLine($"{s.Key} -> {s.Value.Average():F2}"));
    }
}
