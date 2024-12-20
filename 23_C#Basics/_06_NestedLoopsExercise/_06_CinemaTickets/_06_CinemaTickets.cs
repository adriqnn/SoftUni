using System;

public class _06_CinemaTickets
{
    public static void Main(string[] args)
    {
        // Read input value
        string movie = Console.ReadLine();

        // Add variables
        int totalTickets = 0;
        int studentsTotal = 0;
        int standardTotal = 0;
        int kidsTotal = 0;

        // Make statistics for ticket types and movies
        while (!movie.Equals("Finish"))
        {
            // Read additional input values for each movie
            int seats = int.Parse(Console.ReadLine());
            string type = Console.ReadLine();

            // Variables for each money
            int count = 0;
            int students = 0;
            int standard = 0;
            int kids = 0;


            while (!type.Equals("End"))
            {
                if (type.Equals("student"))
                {
                    students++;
                }
                else if (type.Equals("standard"))
                {
                    standard++;
                }
                else if (type.Equals("kid"))
                {
                    kids++;
                }
                count++;

                if (count == seats)
                {
                    double occupancyIn = ((1.00 * count) / seats) * 100;
                    Console.WriteLine($"{movie} - {occupancyIn:F2}% full.");
                    break;
                }
                type = Console.ReadLine();
            }

            double occupancy = ((1.00 * count) / seats) * 100;

            if (type.Equals("End"))
            {
                Console.WriteLine($"{movie} - {occupancy:F2}% full.");
            }

            int all = students + standard + kids;
            totalTickets += all;
            studentsTotal += students;
            standardTotal += standard;
            kidsTotal += kids;
            movie = Console.ReadLine();
        }

        double percentStudents = (1.00 * studentsTotal / totalTickets) * 100;
        double percentStandard = (1.00 * standardTotal / totalTickets) * 100;
        double percentKids = (1.00 * kidsTotal / totalTickets) * 100;

        // Print statistics
        Console.WriteLine($"Total tickets: {totalTickets}");
        Console.WriteLine($"{percentStudents:F2}% student tickets.");
        Console.WriteLine($"{percentStandard:F2}% standard tickets.");
        Console.WriteLine($"{percentKids:F2}% kids tickets.");
    }
}
