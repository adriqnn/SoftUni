using System;

public class _04_PersonalTitles
{
    public static void Main(string[] args)
    {
        // Read input values for age and gender
        double age = double.Parse(Console.ReadLine());
        string gender = Console.ReadLine();

        // Print the title based on the given age and gender
        if (age < 16 && gender.Equals("f"))
        {
            Console.WriteLine("Miss");
        }
        else if (age >= 16 && gender.Equals("f"))
        {
            Console.WriteLine("Ms.");
        }
        else if (age < 16 && gender.Equals("m"))
        {
            Console.WriteLine("Master");
        }
        else if (age >= 16 && gender.Equals("m"))
        {
            Console.WriteLine("Mr.");
        }
    }
}
