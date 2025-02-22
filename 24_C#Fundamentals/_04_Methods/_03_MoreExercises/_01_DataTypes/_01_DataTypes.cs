using System;

public class _01_DataTypes
{
    public static void Main(string[] args)
    {
        // Read input value
        string type = Console.ReadLine();

        // Determine the data type of the input
        if (type.Equals("int"))
        {
            int num = int.Parse(Console.ReadLine());

            printDataTypes(num);
        }
        else if (type.Equals("real"))
        {
            double num = double.Parse(Console.ReadLine());

            printDataTypes(num);
        }
        else if (type.Equals("string"))
        {
            string line = Console.ReadLine();

            printDataTypes(line);
        }
    }

    private static void printDataTypes(int num)
    {
        Console.WriteLine(num * 2);
    }

    private static void printDataTypes(double num)
    {
        Console.WriteLine($"{num * 1.5:F2}");
    }

    private static void printDataTypes(String line)
    {
        string newString = "$" + line + "$";
        Console.WriteLine(newString);
    }
}
