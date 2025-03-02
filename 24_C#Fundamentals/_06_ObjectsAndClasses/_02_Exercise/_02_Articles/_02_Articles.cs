using System;

public class _02_Articles
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] tokens = Console.ReadLine().Split(", ", StringSplitOptions.None);

        // Add variables
        string title = tokens[0];
        string content = tokens[1];
        string author = tokens[2];

        Article myArticle = new Article(title, content, author);

        int n = int.Parse(Console.ReadLine());

        // Execute commands based on the input on the article
        for (int i = 0; i < n; i++)
        {
            string[] commandLine = Console.ReadLine().Split(": ", StringSplitOptions.None);
            string command = commandLine[0];

            if (command.Equals("Edit"))
            {
                myArticle.Content = commandLine[1];
            }
            else if (command.Equals("ChangeAuthor"))
            {
                myArticle.Author = commandLine[1];
            }
            else if (command.Equals("Rename"))
            {
                myArticle.Title = commandLine[1];
            }
        }

        Console.WriteLine(myArticle);
    }
}

// Create practice Article class
class Article
{
    public string Title { get; set; }
    public string Content { get; set; }
    public string Author { get; set; }

    public Article(string title, string content, string author)
    {
        this.Title = title;
        this.Content = content;
        this.Author = author;
    }


    public override string ToString()
    {
        return $"{Title} - {Content}: {Author}";
    }
}
