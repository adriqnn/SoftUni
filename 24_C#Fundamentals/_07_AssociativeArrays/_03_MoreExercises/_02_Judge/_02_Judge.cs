using System;

public class _02_Judge
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        Dictionary<string, List<string>> contests = new Dictionary<string, List<string>>();
        Dictionary<string, Dictionary<string, int>> students = new Dictionary<string, Dictionary<string, int>>();

        // Create student's score system and db
        while (!input.Equals("no more time"))
        {
            string[] information = input.Split(" -> ");

            string username = information[0];
            string contest = information[1];
            int points = int.Parse(information[2]);

            if (!contests.ContainsKey(contest))
            {
                contests[contest] = new List<string>();
            }

            if (!contests[contest].Contains(username))
            {
                contests[contest].Add(username);
            }

            if (!students.ContainsKey(username))
            {
                students[username] = new Dictionary<string, int>();
                students[username][contest] = points;
            }
            else
            {
                if (!students[username].ContainsKey(contest))
                {
                    students[username][contest] = points;
                }
                else
                {
                    int savedPoints = students[username][contest];

                    if (savedPoints < points)
                    {
                        students[username][contest] = points;
                    }
                }
            }

            input = Console.ReadLine();
        }

        // Print result
        foreach (var contest in contests)
        {
            string contestName = contest.Key;
            List<string> participants = contest.Value;

            Console.WriteLine($"{contestName}: {participants.Count} participants");
            var ranked = participants.Select(name => new Student(name, students[name][contestName])).OrderByDescending(s => s.Score).ThenBy(s => s.Name).ToList();
            for (int i = 0;i < ranked.Count();i++)
            {
                Console.WriteLine($"{i + 1}. {ranked[i].Name} <::> {ranked[i].Score}");
            }
        }
        Console.WriteLine("Individual standings:");
        var finalScores = students.Select(kvp => new Student(kvp.Key, kvp.Value.Values.Sum())).OrderByDescending(s => s.Score).ThenBy(s => s.Name).ToList();
        for (int i = 0; i < finalScores.Count(); i++)
        {
            Console.WriteLine($"{i + 1}. {finalScores[i].Name} -> {finalScores[i].Score}");
        }
    }
}

// Create practice Student class
class Student
{
    public string Name { get; set; }
    public int Score { get; set; }

    public Student(string name, int score)
    {
        this.Name = name;
        this.Score = score;
    }
}
