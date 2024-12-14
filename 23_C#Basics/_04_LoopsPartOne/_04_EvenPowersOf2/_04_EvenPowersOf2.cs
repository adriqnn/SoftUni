using System;

public class _04_EvenPowersOf2
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int power = 1;

        // Loop through the powers of 2 from 2^0 to 2^n
        for (int i = 0; i <= n; i++)
        {
            if (i == 0)
            {
                Console.WriteLine(1);
            }
            else if (i % 2 == 0)
            {
                Console.WriteLine(power);
            }
            power = power * 2;
        }
    }
}
