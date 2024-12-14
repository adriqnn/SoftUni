using System;

public class _05_Salary
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        int salary = int.Parse(Console.ReadLine());

        // Read new input value
        for (int i = 0; i < n; i++)
        {
            string site = Console.ReadLine();

            // Deduct salary based on the social media site visited
            switch (site)
            {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            // Check if the salary has gone negative
            if (salary <= 0)
            {
                break;
            }
        }

        // Print the result based on the salary
        if (salary <= 0)
        {
            Console.WriteLine("You have lost your salary.");
        }
        else
        {
            Console.WriteLine(salary);
        }
    }
}
