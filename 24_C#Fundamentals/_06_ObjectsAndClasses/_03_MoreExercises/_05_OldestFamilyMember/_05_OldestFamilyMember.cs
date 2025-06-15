using System;

public class _05_OldestFamilyMember
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Person> list = new List<Person>();

        // Person database
        for (int i = 0; i < n; i++)
        {
            string[] consoleLine = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string name = consoleLine[0];
            int age = int.Parse(consoleLine[1]);

            Person person = new Person(name, age);
            list.Add(person);
        }

        list = list.OrderByDescending(e => e.Age).ToList();
        Console.WriteLine(list[0]);
    }
}

// Create practice Person class
class Person
{
    public string Name { get; }
    public int Age { get; }

    public Person(string name, int age)
    {
        this.Name = name;
        this.Age = age;
    }

    public override string ToString()
    {
        return $"{this.Name} {this.Age}";
    }
}
