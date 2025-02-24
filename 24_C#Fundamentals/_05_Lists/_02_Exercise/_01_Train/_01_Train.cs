using System;
using System.Linq;

public class _01_Train
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> trainWagonsPassengers = Console.ReadLine().Split().Select(int.Parse).ToList();
        int capacityOfWagon = int.Parse(Console.ReadLine());
        string passengersListActions = Console.ReadLine();

        // Arrange the train based on commands
        while (!passengersListActions.Equals("end"))
        {
            if (passengersListActions.Split()[0].Equals("Add"))
            {
                int addWagonAndPassengers = int.Parse(passengersListActions.Split()[1]);

                trainWagonsPassengers.Add(addWagonAndPassengers);
            }
            else
            {
                int addPassengers = int.Parse(passengersListActions.Split()[0]);

                for (int i = 0; i < trainWagonsPassengers.Count; i++)
                {
                    if (trainWagonsPassengers[i] + addPassengers <= capacityOfWagon)
                    {
                        trainWagonsPassengers[i] = trainWagonsPassengers[i] + addPassengers;
                        break;
                    }
                }
            }

            passengersListActions = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", trainWagonsPassengers));
    }
}
