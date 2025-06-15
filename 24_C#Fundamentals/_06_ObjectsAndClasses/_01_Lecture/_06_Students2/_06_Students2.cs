using System;

public class _06_Students2
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        List<StudentInfo> studentList = new List<StudentInfo>();

        // Save a list of students and their information
        while (!console.Equals("end"))
        {
            string[] lineFromConsole = console.Split(" ");

            string firstName = lineFromConsole[0];
            string secondName = lineFromConsole[1];
            int age = int.Parse(lineFromConsole[2]);
            string t = lineFromConsole[3]!;

            if (!isAlreadyExistingInsideTheList(firstName, secondName, age, t, studentList))
            {
                StudentInfo student = new StudentInfo(firstName, secondName, age, t);

                studentList.Add(student);
            }

            console = Console.ReadLine();
        }

        string town = Console.ReadLine();

        // Print result
        foreach (StudentInfo element in studentList)
        {
            if (element.Town.Equals(town))
            {
                Console.WriteLine(element);
            }
        }
    }

    // Define method to check if the value already exists in the list
    private static bool isAlreadyExistingInsideTheList(string firstName, string secondName, int age, string town, List<StudentInfo> studentList)
    {
        foreach (StudentInfo element in studentList)
        {
            bool firstNameBoolean = element.FirstName.Equals(firstName);
            bool secondNameBoolean = element.SecondName.Equals(secondName);

            if (firstNameBoolean && secondNameBoolean)
            {
                element.Age = age;
                element.Town = town;

                return true;
            }
        }

        return false;
    }
}

// Create practice StudentInfo class
class StudentInfo
{
    public string FirstName { get; }
    public string SecondName { get; }
    public int Age { get; set; }
    public string Town { get; set; }

    public StudentInfo(string firstName, string secondName, int age, string town)
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
