using System;

public class _02_NumbersNTo1
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Loop from n down to 1 and print each number
        for (int i = n; i >= 1; i--)
        {
            Console.WriteLine(i);
        }
    }
}
