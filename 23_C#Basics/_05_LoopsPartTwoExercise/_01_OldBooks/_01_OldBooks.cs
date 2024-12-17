using System;

public class _01_OldBooks
{
    public static void Main(string[] args)
    {
        // Read input values
        string book = Console.ReadLine();
        string favoriteBook = Console.ReadLine();

        // Staging
        int count = 0;

        // Use a while loop to search for the favorite book
        while (!favoriteBook.Equals(book))
        {
            if (favoriteBook.Equals("No More Books"))
            {
                Console.WriteLine("The book you search is not here!");
                Console.WriteLine($"You checked {count} books.");
                break;
            }

            count++;
            favoriteBook = Console.ReadLine();
        }

        // Display the result based on whether the favorite book was found
        if (favoriteBook.Equals(book))
        {
            Console.WriteLine($"You checked {count} books and found it.");
        }
    }
}
