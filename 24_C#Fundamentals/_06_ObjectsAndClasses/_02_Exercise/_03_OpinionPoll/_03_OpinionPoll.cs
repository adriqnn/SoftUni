using System;

public class _03_OpinionPoll
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Person> listOfPeople = new List<Person>();

        // Populate the list with data for people
        for (int i = 0; i < n; i++)
        {
            string[] consoleLine = Console.ReadLine().Split(" ");

            string person = consoleLine[0];
            int age = int.Parse(consoleLine[1]);

            Person newPerson = new Person(person, age);
            listOfPeople.Add(newPerson);
        }

        // Sort the list
        listOfPeople.Sort((p1, p2) => p1.Name.CompareTo(p2.Name));

        // Print result
        foreach (Person person in listOfPeople)
        {
            if (person.Age > 30)
            {
                Console.WriteLine($"{person.Name} - {person.Age}");
            }
        }
    }
}

// Create practice Person class
class Person
{
    public string Name { get; set; }
    public int Age { get; set; }

    public Person(string name, int age)
    {
        this.Name = name;
        this.Age = age;
    }
}
