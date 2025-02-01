using System;

public class _11_MultiplicationTable2
{
    public static void Main(string[] args)
    {
        // Read input value
        int n1 = int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());

        // Print the multiplication based on the input
        if (n2 > 10)
        {
            Console.WriteLine($"{n1} X {n2} = {n1 * n2}");
        }
        else
        {
            for (int i = n2; i <= 10; i++)
            {
                Console.WriteLine($"{n1} X {i} = {n1 * i}");
            }
        }
    }
}
