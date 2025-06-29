using System;
using System.Text.RegularExpressions;

public class _01_WinningTicket
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> tickets = Console.ReadLine().Split(new[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(t => t.Trim()).ToList();

        // Add variables
        List<string> winningTickets = new List<string>();

        string regexTicket = @"(?<grp>[@#$\^]{6,}).*?(?<=.{10})(\k<grp>)";
        Regex patternTicket = new Regex(regexTicket);

        // Determine the winning ticket and print result
        for (int i = 0; i < tickets.Count; i++)
        {
            if (tickets[i].Length == 20)
            {
                Match matcherTicket = patternTicket.Match(tickets[i]);

                if (matcherTicket.Success)
                {
                    winningTickets.Add(tickets[i]);
                    string match = matcherTicket.Groups["grp"].Value;

                    if (match.Length == 10)
                    {
                        Console.WriteLine($"ticket \"{tickets[i]}\" - {match.Length}{match[0]} Jackpot!");
                    }
                    else
                    {
                        Console.WriteLine($"ticket \"{tickets[i]}\" - {match.Length}{match[0]}");
                    }
                }
                else
                {
                    Console.WriteLine($"ticket \"{tickets[i]}\" - no match");
                }
            }
            else
            {
                Console.WriteLine("invalid ticket");
            }
        }
    }
}
