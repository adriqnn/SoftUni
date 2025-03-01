using System;

public class _04_Songs
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Song> songsList = new List<Song>();

        // Save the songs
        for (int i = 0; i < n; i++)
        {
            string[] tokens = Console.ReadLine().Split('_');

            string type = tokens[0];
            string name = tokens[1];
            string time = tokens[2];

            Song song = new Song(type, name, time);
            songsList.Add(song);
        }

        string consoleType = Console.ReadLine();

        // Print result
        if (consoleType.Equals("all"))
        {
            foreach (Song element in songsList)
            {
                Console.WriteLine(element);
            }
        }
        else
        {
            foreach (Song element in songsList)
            {
                if (element.getType().Equals(consoleType))
                {
                    Console.WriteLine(element);
                }
            }
        }
    }
}

// Create practice Song class
class Song
{
    private string Type { get; }
    private string Name { get; }
    private string Time { get; }

    public Song(string type, string name, string time)
    {
        this.Type = type;
        this.Name = name;
        this.Time = time;
    }

    public String getType()
    {
        return this.Type;
    }

    public override String ToString()
    {
        return this.Name;
    }
}
