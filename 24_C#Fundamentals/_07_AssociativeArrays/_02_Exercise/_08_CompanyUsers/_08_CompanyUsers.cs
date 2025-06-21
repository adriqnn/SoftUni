using System;
using System.Collections.Generic;
using System.Xml.Linq;

public class _08_CompanyUsers
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        Dictionary<string, HashSet<string>> employees = new Dictionary<string, HashSet<string>>();

        // Make employee database
        while (!input.Equals("End"))
        {
            string[] line = input.Split(" -> ");

            string company = line[0];
            string id = line[1];

            if (!employees.ContainsKey(company))
            {
                employees[company] = new HashSet<string>();
            }

            employees[company].Add(id);

            input = Console.ReadLine();
        }

        // Print result
        foreach (var kvp in employees)
        {
            Console.WriteLine(kvp.Key);
            foreach (var id in kvp.Value)
            {
                Console.WriteLine($"-- {id}");
            }
        }
    }
}
