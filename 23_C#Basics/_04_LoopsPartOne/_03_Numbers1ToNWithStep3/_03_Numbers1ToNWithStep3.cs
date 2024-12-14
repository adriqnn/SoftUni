using System;

public class _03_Numbers1ToNWithStep3
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Loop from 1 to n with a step of 3 and print each number
        for (int i = 1; i <= n; i = i + 3)
        {
            Console.WriteLine(i);
        }
    }
}
