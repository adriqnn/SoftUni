using System;

public class _06_ForeignLanguages
{
    public static void Main(string[] args)
    {
        // Read input value
        string country = Console.ReadLine();

        // Print country based on the input
        switch (country) 
        {
            case "England":
            case "USA":
                Console.WriteLine("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                Console.WriteLine("Spanish");
                break;
            default:
                Console.WriteLine("unknown");
                break;
        }
    }
}
