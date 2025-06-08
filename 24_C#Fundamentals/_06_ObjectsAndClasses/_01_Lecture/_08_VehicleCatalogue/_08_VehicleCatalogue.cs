using System;

public class _08_VehicleCatalogue
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        List<Vehicle> carsList = new List<Vehicle>();
        List<Vehicle> trucksList = new List<Vehicle>();

        // Create a DB of all vehicles
        while (!console.Equals("end"))
        {
            string[] consoleLine = console.Split("/");

            string type = consoleLine[0];
            string make = consoleLine[1];
            string model = consoleLine[2];
            int horsePower = int.Parse(consoleLine[3]);

            Vehicle catalogueEntry = new Vehicle(type, make, model, horsePower);

            if (type.Equals("Car"))
            {
                carsList.Add(catalogueEntry);
            }
            else if (type.Equals("Truck"))
            {
                trucksList.Add(catalogueEntry);
            }


            console = Console.ReadLine();
        }

        // Sort lists
        List<Vehicle> sortedCars = carsList.OrderBy(b => b.Make).ToList();
        List<Vehicle> sortedTrucks = trucksList.OrderBy(b => b.Make).ToList();

        // Print result
        if (sortedCars.Count > 0)
        {
            Console.WriteLine("Cars:");
            foreach (Vehicle element in sortedCars)
            {
                Console.WriteLine(element.ToString());
            }
        }

        if (sortedTrucks.Count > 0)
        {
            Console.WriteLine("Trucks:");
            foreach (Vehicle element in sortedTrucks)
            {
                Console.WriteLine(element.ToString());
            }
        }
    }
}

// Create practice Vehicle class
class Vehicle
{
    public string Type { get; set; }
    public string Make { get; set; }
    public string Model { get; set; }
    public int HorsePower { get; set; }

    public Vehicle(string type, string make, string model, int horsePower)
    {
        this.Type = type;
        this.Make = make;
        this.Model = model;
        this.HorsePower = horsePower;
    }

    public override string ToString()
    {
        return $"{Make}: {Model} - {HorsePower}{(Type == "Car" ? "hp" : "kg")}";
    }
}
