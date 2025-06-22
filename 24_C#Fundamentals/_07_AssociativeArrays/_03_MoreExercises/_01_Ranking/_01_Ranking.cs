using System;
using System.Xml.Linq;

public class _01_Ranking
{
    public static void Main(string[] args)
    {
        // Read input value
        string firstInput = Console.ReadLine();

        // Add variable
        Dictionary<string, string> contestInformation = new Dictionary<string, string>();

        // Create rank list for contestants
        while (!firstInput.Equals("end of contests"))
        {
            string[] information = firstInput.Split(":");

            string contest = information[0];
            string password = information[1];

            contestInformation[contest] = password;

            firstInput = Console.ReadLine();
        }

        // Read input value
        string secondInput = Console.ReadLine();

        // Add variable
        SortedDictionary<string, Dictionary<string, int>> students = new SortedDictionary<string, Dictionary<string, int>>();

        // Create database for submissions
        while (!secondInput.Equals("end of submissions"))
        {
            string[] information = secondInput.Split("=>");

            string contest = information[0];
            string password = information[1];
            string username = information[2];
            int points = int.Parse(information[3]);

            if (contestInformation.ContainsKey(contest))
            {
                if (contestInformation[contest].Equals(password))
                {
                    if (!students.ContainsKey(username))
                    {
                        students[username] = new Dictionary<string, int>();
                    }

                    if (!students[username].ContainsKey(contest))
                    {
                        Dictionary<string, int> result = students[username];
                        result[contest] = points;
                        students[username] = result;
                    }
                    else
                    {
                        int currentPoints = students[username][contest];

                        if (currentPoints < points)
                        {
                            Dictionary<string, int> result = students[username];
                            result[contest] = points;
                            students[username] = result;
                        }
                    }
                }
            }

            secondInput = Console.ReadLine();
        }

        // Sort
        // Calculate total scores
        var totalScores = students.ToDictionary(entry => entry.Key, entry => entry.Value.Values.Sum());
        var bestCandidate = totalScores.OrderByDescending(e => e.Value).First();

        // Print result
        Console.WriteLine($"Best candidate is {bestCandidate.Key} with total {bestCandidate.Value} points.");
        Console.WriteLine("Ranking:");
        foreach (var student in students)
        {
            Console.WriteLine(student.Key);

            foreach (var contest in student.Value.OrderByDescending(c => c.Value))
            {
                Console.WriteLine($"#  {contest.Key} -> {contest.Value}");
            }
        }
    }
}
