using System;
using System.Xml.Linq;

public class _04_TeamworkProjects
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

                if (creatorExist.Creator.Equals(creator) && creatorExist.getTeam().equals(newTeam))
                {
                    sameCreatorAndName = true;
                }

            }

            if (!creatorIsThere && !teamExists)
            {
                Teams team = new Teams(creator, newTeam, new ArrayList<>(), 0);

                teamsList.add(team);

                System.out.printf("Team %s has been created by %s!%n", newTeam, creator);
            }
            else if (creatorIsThere && teamExists && sameCreatorAndName)
            {
                System.out.printf("Team %s was already created!%n", newTeam);
            }
            else if (!creatorIsThere)
            {
                System.out.printf("Team %s was already created!%n", newTeam);
            }
            else if (!teamExists)
            {
                System.out.printf("%s cannot create another team!%n", creator);
            }
        }

        String console = scan.nextLine();

        // Set assignments
        while (!console.equals("end of assignment"))
        {
            String[] consoleLine = console.split("->");

            String name = consoleLine[0];
            String team = consoleLine[1];
            boolean teamDoesNotExist = true;
            boolean containsName = false;
            boolean isCreator = false;
            boolean anotherTeamContainsName = false;

            for (Teams teamExist : teamsList)
            {
                if (teamExist.getTeam().equals(team))
                {
                    teamDoesNotExist = false;
                }

                if (teamExist.getCreator().equals(name))
                {
                    isCreator = true;
                }

                if (teamExist.getTeam().equals(team) && !teamExist.getMembers().contains(name))
                {
                    containsName = true;
                }

                if (!teamExist.getTeam().equals(team) && teamExist.getMembers().contains(name))
                {
                    anotherTeamContainsName = true;
                }

            }

            if (anotherTeamContainsName)
            {
                System.out.printf("Member %s cannot join team %s!%n", name, team);

                console = scan.nextLine();
                continue;
            }

            if (teamDoesNotExist)
            {
                System.out.printf("Team %s does not exist!%n", team);

                console = scan.nextLine();
                continue;
            }

            if (isCreator || !containsName)
            {
                System.out.printf("Member %s cannot join team %s!%n", name, team);

                console = scan.nextLine();
                continue;
            }

            for (Teams join : teamsList)
            {
                if (join.getTeam().equals(team))
                {
                    join.getMembers().add(name);
                    join.setSize(join.getSize() + 1);
                }
            }

            console = scan.nextLine();
        }

        // Determine if teams have to disband
        List<String> disband = new ArrayList<>();
        teamsList.stream().sorted((e1, e2)->Integer.compare(e2.getMembers().size(), e1.getMembers().size())).forEach(element-> {
            if (element.getMembers().size() == 0)
            {
                disband.add(element.getTeam());
                teamsList.remove(element);
            }
        });

        // Sort teams list and print
        teamsList.stream().sorted(Comparator.comparingInt(Teams::getSize).reversed().thenComparing(Teams::getTeam)).forEach(e-> {
            System.out.println(e);
            System.out.println("- " + e.getCreator());
            e.getMembers().stream().sorted().forEach(z->System.out.println("-- " + z));
        });

        // Print result for disbands
        System.out.println("Teams to disband:");
        disband.stream().sorted().forEach(System.out::println);
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

