using System;

public class _04_SoftUniParking
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfCommands = int.Parse(Console.ReadLine());

        // Add variable
        Dictionary<string, string> registry = new Dictionary<string, string>();

        // Validate parking permissions and save data
        for (int i = 0; i < numberOfCommands; i++)
        {
            string[] commands = Console.ReadLine().Split(" ");

            string command = commands[0];
            string username = commands[1];

            if (command.Equals("register"))
            {
                string licensePlate = commands[2];

                if (registry.ContainsKey(username))
                {
                    Console.WriteLine($"ERROR: already registered with plate number {licensePlate}");
                    continue;
                }

                registry[username] = licensePlate;
                Console.WriteLine($"{username} registered {licensePlate} successfully");
            }
            else
            {
                if (!registry.ContainsKey(username))
                {
                    Console.WriteLine($"ERROR: user {username} not found");
                    continue;
                }

                registry.Remove(username);
                Console.WriteLine($"{username} unregistered successfully");
            }
        }

        // Print result
        foreach (KeyValuePair<string, string> reg in registry) 
        {
            Console.WriteLine($"{reg.Key} => {reg.Value}");
        }
    }
}
