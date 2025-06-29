using System;
using System.IO;
using System.Text.RegularExpressions;

public class _06_ExtractEmails
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        string regexEmail = "((?<=\\s)[a-zA-Z0-9]+([-.]\\w*)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,}))";
        Regex patternEmail = new Regex(regexEmail);
        Match matcherEmail = patternEmail.Match(input);

        // Extract emails and print result
        while (matcherEmail.Success)
        {
            Console.WriteLine(matcherEmail.Value);
            matcherEmail = matcherEmail.NextMatch();
        }
    }
}
