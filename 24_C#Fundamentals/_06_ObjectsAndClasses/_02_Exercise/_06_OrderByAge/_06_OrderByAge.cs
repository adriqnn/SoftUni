using System;

public class _06_OrderByAge
{
    public static void Main(string[] args)
    {
        // Read input vale
        string console = Console.ReadLine();

        // Add variable
        List<Album> names = new List<Album>();


        // Create collection of people
        while (!console.Equals("End"))
        {
            string[] consoleLine = console.Split(" ");

            string name = consoleLine[0];
            string personalNumber = consoleLine[1];
            int age = int.Parse(consoleLine[2]);

            Album person = new Album(name, personalNumber, age);
            names.Add(person);

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(Environment.NewLine, names.OrderBy(n => n.Age).Select(e => e.ToString())));
    }
}

// Create practice Album class
class Album
{
    public string Name { get; set; }
    public string PersonalNumber { get; set; }
    public int Age { get; set; }

    public Album(string name, string personalNUmber, int age)
    {
        this.Name = name;
        this.PersonalNumber = personalNUmber;
        this.Age = age;
    }

    public override string ToString()
    {
        return $"{this.Name} with ID: {this.PersonalNumber} is {this.Age} years old.";
    }
}
