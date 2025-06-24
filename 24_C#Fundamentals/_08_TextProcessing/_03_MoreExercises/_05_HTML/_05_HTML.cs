using System;

public class _05_HTML
{
    public static void Main(string[] args)
    {
        // Read input values
        string title = Console.ReadLine();
        string content = Console.ReadLine();
        string comments = Console.ReadLine();

        // Add variable
        List<string> commentsList = new List<string>();

        // Create the HTML list of comments
        while (!comments.Equals("end of comments"))
        {
            commentsList.Add(comments);
            comments = Console.ReadLine();
        }

        // Print result
        Console.WriteLine($"<h1>\n    {title}\n</h1>");
        Console.WriteLine($"<article>\n    {content}\n</article>");
        for (int i = 0; i < commentsList.Count; i++)
        {
            Console.WriteLine($"<div>\n    {commentsList[i]}\n</div>");
        }
    }
}
