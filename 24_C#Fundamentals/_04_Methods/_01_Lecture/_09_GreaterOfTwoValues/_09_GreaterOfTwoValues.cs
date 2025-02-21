using System;

public class _09_GreaterOfTwoValues
{
    public static void Main(string[] args)
    {
        // Read input value
        string type = Console.ReadLine();

        // Create methods for each possible input and print result
        if (type.Equals("int"))
        {
            int numberOne = int.Parse(Console.ReadLine());
            int numberTwo = int.Parse(Console.ReadLine());

            Console.WriteLine(whatIsBigger(numberOne, numberTwo));
        }
        else if (type.Equals("char"))
        {
            char charOne = Console.ReadLine()[0];
            char charTwo = Console.ReadLine()[0];

            Console.WriteLine(whatIsBigger(charOne, charTwo));
        }
        else if (type.Equals("string"))
        {
            string firstString = Console.ReadLine();
            string secondString = Console.ReadLine();

            Console.WriteLine(whatIsBigger(firstString, secondString));
        }
    }

    private static int whatIsBigger(int numberOne, int numberTwo)
    {
        return Math.Max(numberOne, numberTwo);
    }

    private static char whatIsBigger(char charOne, char charTwo)
    {
        return ((char)(Math.Max(charOne, charTwo)));
    }

    private static String whatIsBigger(String firstString, String secondString)
    {
        if (firstString.CompareTo(secondString) >= 0)
        {
            return firstString;
        }
        else
        {
            return secondString;
        }
    }
}
