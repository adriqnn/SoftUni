using System;
using System.Collections.Generic;
using System.Linq;

public class _08_TeamworkProjects
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfTeams = int.Parse(Console.ReadLine());

        // Add variable
        List<Teams> teamsList = new List<Teams>();

        // Create teams
        for (int i = 0; i < numberOfTeams; i++)
        {
            string[] teamCreation = Console.ReadLine().Split('-');

            string creator = teamCreation[0];
            string newTeam = teamCreation[1];
            bool creatorIsThere = false;
            bool teamExists = false;
            bool sameCreatorAndName = false;

            foreach (Teams creatorExist in teamsList)
            {
                if (creatorExist.Creator.Equals(creator))
                {
                    creatorIsThere = true;
                }

                if (creatorExist.Team.Equals(newTeam))
                {
                    teamExists = true;
                }

                if (creatorExist.Creator.Equals(creator) && creatorExist.Team.Equals(newTeam))
                {
                    sameCreatorAndName = true;
                }

            }

            if (creatorIsThere == false && teamExists == false && sameCreatorAndName == false)
            {
                Teams team = new Teams(creator, newTeam, new List<string>(), 0);

                teamsList.Add(team);

                Console.WriteLine($"Team {newTeam} has been created by {creator}!");
            }
            else if (creatorIsThere == true && teamExists == true && sameCreatorAndName == true)
            {
                Console.WriteLine($"Team {newTeam} was already created!");
            }
            else if (teamExists == true)
            {
                Console.WriteLine($"Team {newTeam} was already created!");
            }
            else if (creatorIsThere == true)
            {
                Console.WriteLine($"{creator} cannot create another team!");
            }
        }

        string console = Console.ReadLine();

        // Set assignments
        while (!console.Equals("end of assignment"))
        {
            string[] consoleLine = console.Split("->");

            string name = consoleLine[0];
            string team = consoleLine[1];
            bool teamDoesNotExist = true;
            bool containsName = false;
            bool isCreator = false;
            bool anotherTeamContainsName = false;

            foreach (Teams teamExist in teamsList)
            {
                if (teamExist.Team.Equals(team))
                {
                    teamDoesNotExist = false;
                }

                if (teamExist.Creator.Equals(name))
                {
                    isCreator = true;
                }

                if (teamExist.Team.Equals(team) && !teamExist.Members.Contains(name))
                {
                    containsName = true;
                }

                if (!teamExist.Team.Equals(team) && teamExist.Members.Contains(name))
                {
                    anotherTeamContainsName = true;
                }

            }

            if (anotherTeamContainsName)
            {
                Console.WriteLine($"Member {name} cannot join team {team}!");

                console = Console.ReadLine();
                continue;
            }

            if (teamDoesNotExist)
            {
                Console.WriteLine($"Team {team} does not exist!");

                console = Console.ReadLine();
                continue;
            }

            if (isCreator || !containsName)
            {
                Console.WriteLine($"Member {name} cannot join team {team}!");

                console = Console.ReadLine();
                continue;
            }

            foreach (Teams join in teamsList)
            {
                if (join.Team.Equals(team))
                {
                    join.Members.Add(name);
                    join.Size = join.Size + 1;
                }
            }

            console = Console.ReadLine();
        }

        // Determine if teams have to disband
        List<string> disband = new List<string>();
        foreach (Teams teams in teamsList.ToList())
        {
            if (teams.Members.Count == 0)
            {
                disband.Add(teams.Team);
                teamsList.Remove(teams);
            }
        }

        teamsList = teamsList.OrderByDescending(t => t.Size).ThenBy(t => t.Team).ToList();

        // Sort teams list and print
        foreach (Teams teams in teamsList)
        {
            Console.WriteLine(teams.Team);
            Console.WriteLine("- " + teams.Creator);
            foreach (var z in teams.Members.OrderBy(m => m))
            {
                Console.WriteLine("-- " + z);
            }
        }

        // Print result for disbands
        Console.WriteLine("Teams to disband:");
        disband.Sort();

        foreach (string teams in disband)
        {
            Console.WriteLine(teams);
        }
    }
}

// Create practice Teams class
class Teams
{
    public string Creator { get; }
    public string Team { get; }
    public List<string> Members { get; }
    public int Size { get; set; }

    public Teams(string creator, string team, List<string> members, int size)
    {
        this.Creator = creator;
        this.Team = team;
        this.Members = members;
        this.Size = size;
    }

    public override string ToString()
    {
        return this.Team;
    }
}