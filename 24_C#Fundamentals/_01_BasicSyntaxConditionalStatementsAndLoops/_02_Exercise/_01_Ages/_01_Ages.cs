using System;

public class _01_Ages
{
    public static void Main(string[] args)
    {
        // Raed input value
        int n = int.Parse(Console.ReadLine());

        // Print result based on the input
        if (n <= 2)
        {
            Console.WriteLine("baby");
        }
        else if (n <= 13)
        {
            Console.WriteLine("child");
        }
        else if (n <= 19)
        {
            Console.WriteLine("teenager");
        }
        else if (n <= 65)
        {
            Console.WriteLine("adult");
        }
        else 
        {
            Console.WriteLine("elder");
        }
    }
}
