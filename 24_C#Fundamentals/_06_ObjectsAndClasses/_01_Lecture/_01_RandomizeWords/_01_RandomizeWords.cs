using System;

public class _01_RandomizeWords
{
    public static void Main(string[] args)
    {
        // Read input values 
        List<string> words = Console.ReadLine().Split(" ").ToList();

        // Add variable
        Random rnd = new Random();

        // Randomize the input and print
        while (words.Count > 0)
        {
            int index = rnd.Next(words.Count);
            string word = words[index];
            words.RemoveAt(index);
            Console.WriteLine(word);
        }
    }
}
