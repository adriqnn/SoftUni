using System;
using System.Collections.Generic;
using System.Linq;

public class _02_WordSynonyms
{
    public static void Main(string[] args)
    {
        // Read input value
        int countOfWords = int.Parse(Console.ReadLine());

        // Add variable
        Dictionary<string, List<string>> synonymDictionary = new Dictionary<string, List<string>>();

        // Build dictionary with synonyms
        for (int i = 0; i < countOfWords; i++)
        {
            string word = Console.ReadLine();
            string synonym = Console.ReadLine();

            if (!synonymDictionary.ContainsKey(word))
            {
                List<string> synonymForCurrentWord = new List<string>();

                synonymForCurrentWord.Add(synonym);
                synonymDictionary[word] = synonymForCurrentWord;
            }
            else
            {
                List<string> synonymsForCurrentWord = synonymDictionary[word];

                synonymsForCurrentWord.Add(synonym);
                synonymDictionary[word] = synonymsForCurrentWord;
            }
        }

        // Print result
        foreach (KeyValuePair<string, List<string>> entry in synonymDictionary)
        {
            string currentWord = entry.Key;
            List<string> synonymsForCurrentWord = entry.Value;

            Console.WriteLine($"{currentWord} - {string.Join(", ", synonymsForCurrentWord)}");
        }
    }
}
