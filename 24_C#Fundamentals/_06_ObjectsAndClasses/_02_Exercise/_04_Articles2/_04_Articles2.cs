using System;

public class _04_Articles2
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // add variable
        List<ArticlesDatabase> articles = new List<ArticlesDatabase>();

        // Collect data for all the articles
        for (int i = 0; i < n; i++)
        {
            string[] articleLines = Console.ReadLine().Split(", ", StringSplitOptions.None);
            string title = articleLines[0];
            string content = articleLines[1];
            string author = articleLines[2];

            ArticlesDatabase article = new ArticlesDatabase(title, content, author);
            articles.Add(article);
        }

        // Print result
        Console.WriteLine(string.Join(System.Environment.NewLine, articles.Select(e => $"{e.Title} - {e.Content}: {e.Author}")));
    }
}

// Create practice ArticleDatabase class
class ArticlesDatabase
{
    public string Title { get; set; }
    public string Content { get; set; }
    public string Author { get; set; }

    public ArticlesDatabase(string title, string content, string author)
    {
        this.Title = title;
        this.Content = content;
        this.Author = author;
    }
}
