using System;
using System.Linq;

public class _10_SoftUniExamResults
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        Dictionary<string, int> courses = new Dictionary<string, int>();
        Dictionary<string, string> users = new Dictionary<string, string>();

        // Create database for exam results
        while (!input.Equals("exam finished"))
        {
            string[] information = input.Split("-");

            string username = information[0];
            string command = information[1];

            if (command.Equals("banned"))
            {
                users[username] = "banned";
            }
            else
            {
                int points = int.Parse(information[2]);

                if (!courses.ContainsKey(command))
                {
                    courses[command] = 0;
                }

                courses[command]++;

                if (!users.ContainsKey(username))
                {
                    users[username] = points + "";
                }

                int userPoints = int.Parse(users[username]);

                if (userPoints < points)
                {
                    users[username] = points + "";
                }
            }

            input = Console.ReadLine();
        }

        // Print result
        Console.WriteLine("Results:");
        Console.WriteLine(string.Join("\n", users.Where(e => !e.Value.Equals("banned")).Select(e => $"{e.Key} | {e.Value}")));
        Console.WriteLine("Submissions:");
        Console.WriteLine(string.Join("\n", courses.Select(e => $"{e.Key} - {e.Value}")));
    }
}
