using System;
using System.Text;

public class _04_TextFilter
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] words = Console.ReadLine().Split(", ");
        string text = Console.ReadLine();

        // Filter the words
        foreach (string word in words)
        {
            string replacement = new string('*', word.Length);
            text = text.Replace(word, replacement);
        }

        // Print result
        Console.WriteLine(text);
    }
}
