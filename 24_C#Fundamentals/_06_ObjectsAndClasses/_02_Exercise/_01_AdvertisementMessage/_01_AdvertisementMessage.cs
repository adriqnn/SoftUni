using System;

public class _01_AdvertisementMessage
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        List<string> one = new List<string> { "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product." };
        List<string> two = new List<string> { "Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now i feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
        List<string> three = new List<string> { "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
        List<string> four = new List<string> { "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" };

        // Generate and print randomized advertisement message
        for (int i = 0; i < n; i++)
        {
            Random rnd = new Random();

            int randomOne = rnd.Next(one.Count);
            string first = one[randomOne];

            int randomTwo = rnd.Next(two.Count);
            string second = two[randomTwo];

            int randomThree = rnd.Next(three.Count);
            string third = three[randomThree];

            int randomFour = rnd.Next(four.Count);
            string fourth = four[randomFour];

            Console.WriteLine($"{first} {second} {third} - {fourth}");
        }
    }
}
