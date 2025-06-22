using System;
using System.Collections.Generic;
using System.Linq;

public class _03_MOBAChallenger
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        Dictionary<string, Dictionary<string, int>> players = new Dictionary<string, Dictionary<string, int>>();

        // Create statistics for MOBA players
        while (!input.Equals("Season end"))
        {
            if (input.Contains("->"))
            {
                string[] information = input.Split(" -> ");

                string player = information[0];
                string position = information[1];
                int skill = int.Parse(information[2]);

                if (!players.ContainsKey(player))
                {
                    players[player] = new Dictionary<string, int>();
                }

                if (!players[player].ContainsKey(position))
                {
                    players[player][position] = skill;
                }
                else
                {
                    if (skill > players[player][position])
                    {
                        players[player][position] = skill;
                    }
                }
            }
            else
            {
                string[] information = input.Split(" vs ");

                string player1 = information[0];
                string player2 = information[1];

                if (players.ContainsKey(player1) && players.ContainsKey(player2))
                {
                    var commonPositions = players[player1].Keys.Intersect(players[player2].Keys);

                    if (commonPositions.Any())
                    {
                        int playerOneScore = players[player1].Values.Sum();
                        int playerTwoScore = players[player2].Values.Sum();

                        if (playerOneScore > playerTwoScore)
                        {
                            players.Remove(player2);
                        }
                        else if (playerOneScore < playerTwoScore)
                        {
                            players.Remove(player1);
                        }
                    }
                }
            }

            input = Console.ReadLine();
        }

        // Sort by rating
        List<Player> playerStats = new List<Player>();
        foreach (KeyValuePair<string, Dictionary<string, int>> e in players)
        {
            Player player = new Player(e.Key, e.Value.Values.Sum());

            foreach (KeyValuePair<string, int> pos in e.Value)
            {
                player.Positions.Add(new Position(pos.Key, pos.Value));
            }
            
            playerStats.Add(player);
        }

        // Print result
        foreach (Player player in playerStats.OrderByDescending(p => p.TotalPoints).ThenBy(p => p.Name)) 
        {
            Console.WriteLine($"{player.Name}: {player.TotalPoints} skill");
            Console.WriteLine(string.Join("\n", player.Positions.OrderByDescending(p => p.SkillPoints).ThenBy(p => p.Name).Select(p => $"- {p.Name} <::> {p.SkillPoints}")));
        }
    }
}

// Create practice Player class
class Player
{
    public string Name {  get; set; }
    public int TotalPoints { get; set; }
    public List<Position> Positions { get; set; }

    public Player(string name, int totalPoints)
    {
        this.Name = name;
        this.TotalPoints = totalPoints;
        this.Positions = new List<Position>();
    }
}

// Create practice Position class
class Position
{
    public string Name { get; set; }
    public int SkillPoints { get; set; }

    public Position(string name, int skillPoints)
    {
        this.Name = name;
        this.SkillPoints = skillPoints;
    }
}
