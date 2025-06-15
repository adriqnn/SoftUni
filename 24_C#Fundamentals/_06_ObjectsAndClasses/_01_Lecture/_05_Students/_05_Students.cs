using System;

public class _05_Students
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        List<Student> studentList = new List<Student>();

        // Save a list of students and their information
        while (!console.Equals("end"))
        {
            string[] lineFromConsole = console.Split(" ");

            string firstName = lineFromConsole[0];
            string secondName = lineFromConsole[1];
            int age = int.Parse(lineFromConsole[2]);
            string town = lineFromConsole[3];

            Student student = new Student(firstName, secondName, age, town);
            studentList.Add(student);

            console = Console.ReadLine();
        }

        string consoleTown = Console.ReadLine();

        // Print result
        foreach (Student element in studentList)
        {
            if (element.Town.Equals(consoleTown))
            {
                Console.WriteLine(element);
            }
        }
    }
}

// Create practice Student class
class Student
{
    public string FirstName { get; }
    public string SecondName { get; }
    public int Age { get; }
    public string Town { get; }

    public Student(string firstName, string secondName, int age, string town)
    {
        this.FirstName = firstName;
        this.SecondName = secondName;
        this.Age = age;
        this.Town = town;
    }

    public override string ToString()
    {
        return $"{this.FirstName} {this.SecondName} is {this.Age} years old.";
    }
}
