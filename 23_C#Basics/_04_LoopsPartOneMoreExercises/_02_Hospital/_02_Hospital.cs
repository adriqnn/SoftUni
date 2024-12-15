using System;

public class _02_Hospital
{
    public static void Main(string[] args)
    {
        // Read input value
        int hospitalPeriod = int.Parse(Console.ReadLine());

        // Add variables
        int availableDoctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        // Loop through each day of the hospital period
        for (int i = 1; i <= hospitalPeriod; i++)
        {
            // Check if it's a day to evaluate doctor availability
            if (i % 3 == 0 && untreatedPatients > treatedPatients)
            {
                availableDoctors++;
            }

            // Read the number of patients for the current day
            int patients = int.Parse(Console.ReadLine());

            // Treat patients based on doctor availability
            if (availableDoctors >= patients)
            {
                treatedPatients += patients;
            }
            else
            {
                treatedPatients += availableDoctors;
                untreatedPatients += Math.Abs(patients - availableDoctors);
            }
        }

        // Print the number of treated and untreated patients
        Console.WriteLine("Treated patients: {0}.", treatedPatients);
        Console.WriteLine("Untreated patients: {0}.", untreatedPatients);
    }
}
