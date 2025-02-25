using System;
using System.Xml.Linq;
using System.Linq;

public class _06_CardsGame
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> cardsList1 = Console.ReadLine().Split().Select(int.Parse).ToList();
        List<int> cardsList2 = Console.ReadLine().Split().Select(int.Parse).ToList();

        // Play card game and determine who wins
        while (cardsList1.Count > 0 && cardsList2.Count > 0)
        {
            if (cardsList1[0].Equals(cardsList2[0]))
            {
                cardsList1.RemoveAt(0);
                cardsList2.RemoveAt(0);
            }
            else if (cardsList1[0] > cardsList2[0])
            {
                cardsList1.Add(cardsList1[0]);
                cardsList1.Add(cardsList2[0]);

                cardsList1.RemoveAt(0);
                cardsList2.RemoveAt(0);
            }
            else if (cardsList1[0] < cardsList2[0])
            {
                cardsList2.Add(cardsList2[0]);
                cardsList2.Add(cardsList1[0]);

                cardsList1.RemoveAt(0);
                cardsList2.RemoveAt(0);
            }
        }

        int sum = 0;

        // Print result
        if (cardsList1.Count == 0)
        {
            foreach (int integer in cardsList2)
            {
                sum += integer;
            }

            Console.WriteLine($"Second player wins! Sum: {sum}");
        }
        else
        {
            foreach (int integer in cardsList1)
            {
                sum += integer;
            }

            Console.WriteLine($"First player wins! Sum: {sum}");
        }
    }
}
