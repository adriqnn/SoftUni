using System;

public class _05_DragonArmy
{
    public static void Main(string[] args)
    {
        // Read input value
        int inputLines = int.Parse(Console.ReadLine());

        // Add variable
        Dictionary<string, SortedDictionary<string, List<double>>> database = new Dictionary<string, SortedDictionary<string, List<double>>>();

        // Create database for dragons
        for (int i = 0; i < inputLines; i++)
        {
            string[] information = Console.ReadLine().Split(" ");

            string type = information[0];
            string name = information[1];
            double damage = information[2].Equals("null") ? 45 : double.Parse(information[2]);
            double health = information[3].Equals("null") ? 250 : double.Parse(information[3]);
            double armor = information[4].Equals("null") ? 10 : double.Parse(information[4]);

            if (!database.ContainsKey(type))
            {
                database[type] = new SortedDictionary<string, List<double>>();
            }

            database[type][name] = new List<double> { damage, health, armor };
        }

        // Print results
        foreach (var db in database)
        {
            string type = db.Key;
            SortedDictionary<string, List<double>> dragons = db.Value;

            double avgDamage = dragons.Values.Select(x => x[0]).Average();
            double avgHealth = dragons.Values.Select(x => x[1]).Average();
            double avgArmor = dragons.Values.Select(x => x[2]).Average();

            Console.WriteLine($"{type}::({avgDamage:F2}/{avgHealth:F2}/{avgArmor:F2})");
            foreach (var dragon in dragons)
            {
                string name = dragon.Key;
                double dmg = dragon.Value[0];
                double hp = dragon.Value[1];
                double armor = dragon.Value[2];

                Console.WriteLine($"-{name} -> damage: {dmg:0}, health: {hp:0}, armor: {armor:0}");
            }
        }
    }
}
