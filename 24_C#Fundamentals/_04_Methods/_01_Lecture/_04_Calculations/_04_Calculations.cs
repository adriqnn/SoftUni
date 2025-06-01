using System;

public class _04_Calculations
{
    public static void Main(string[] args)
    {
        // Read input values
        string operation = Console.ReadLine();
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());

        // Create method to do the calculations
        whatIsTheResult(operation, num1, num2);
    }

    private static void whatIsTheResult(String operation, int num1, int num2)
    {
        if (operation.Equals("add"))
        {
            Console.WriteLine(num1 + num2);
        }
        else if (operation.Equals("multiply"))
        {
            Console.WriteLine(num1 * num2);
        }
        else if (operation.Equals("subtract"))
        {
            Console.WriteLine(num1 - num2);
        }
        else if (operation.Equals("divide"))
        {
            Console.WriteLine(num1 / num2);
        }
    }
}
