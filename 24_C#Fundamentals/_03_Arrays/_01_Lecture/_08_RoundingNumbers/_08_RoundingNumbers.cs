using System;

public class _08_RoundingNumbers
{
    public static void Main(string[] args)
    {
        // Read input values  string result = string.Join(", " , Console.ReadLine().Split().Select(double.Parse).Select(x => $"{x} => {(x % 1 == 0.5 ? x + 0.5 : Math.Ceiling(x * 2) / 2)}"));
        string result = string.Join(Environment.NewLine, Console.ReadLine().Split().Select(double.Parse).ToArray().Select(x => $"{x} => {(int) Math.Round(x, MidpointRounding.AwayFromZero)}"));

        // Print result
        Console.WriteLine(result);
    }
}
