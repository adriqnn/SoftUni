using System;

public class _03_SpeedRacing
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Car> cars = new List<Car>();

        // Cars database
        for (int i = 0; i < n; i++) {
            string[] consoleLine = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string model = consoleLine[0];
            double fuel = int.Parse(consoleLine[1]);
            double perKilometer = double.Parse(consoleLine[2]);

            Car car = new Car(model, fuel, perKilometer);
            cars.Add(car);
        }

        // Next lines of input
        string operations = Console.ReadLine();

        while (operations != "End")
        {
            string[] consoleLine = operations.Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string method = consoleLine[0];
            string carModel = consoleLine[1];
            int kilometers = int.Parse(consoleLine[2]);

            Car car = cars.Find(x => x.Model == carModel);

            if (car != null)
            {
                car.drive(kilometers);
            }

            operations = Console.ReadLine();
        }

        // Print result
        foreach (Car car in cars)
        {
            Console.WriteLine(car);
        }
    }
}

// Create practice Car class
class Car
{
    public string Model { get; set; }
    public double Fuel { get; set; }
    public double FuelConsumption { get; set; }
    public double KilometersTraveled { get; set; }

    public Car(string model, double fuel, double fuelConsumption)
    {
        this.Model = model;
        this.Fuel = fuel;
        this.FuelConsumption = fuelConsumption;
        this.KilometersTraveled = 0;
    }

    public void drive(int kilometers)
    {
        double fuelNeeded = kilometers * FuelConsumption;

        if (fuelNeeded <= Fuel)
        {
            this.Fuel -= fuelNeeded;
            KilometersTraveled += kilometers;
        }
        else
        {
            Console.WriteLine("Insufficient fuel for the drive");
        }
    }

    public override string ToString()
    {
        return $"{Model} {Fuel:F2} {KilometersTraveled}";
    }
}
