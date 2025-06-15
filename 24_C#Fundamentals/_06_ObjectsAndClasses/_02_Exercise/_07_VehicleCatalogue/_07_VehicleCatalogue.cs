using System;

public class _07_VehicleCatalogue
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        double carHorsePower = 0;
        double cars = 0;
        double truckHorsePower = 0;
        double trucks = 0;
        List<Vehicle> vehicles = new List<Vehicle>();

        // Create a DB of all vehicles
        while (!console.Equals("End"))
        {
            string[] consoleLine = console.Split(" ");

            string type = consoleLine[0];
            string model = consoleLine[1];
            string color = consoleLine[2];
            int horsePower = int.Parse(consoleLine[3]);

            if (type.Equals("car"))
            {
                carHorsePower += horsePower;
                cars++;
            }
            else if (type.Equals("truck"))
            {
                truckHorsePower += horsePower;
                trucks++;
            }

            Vehicle catalogueEntry = new Vehicle(type, model, color, horsePower);
            vehicles.Add(catalogueEntry);

            console = Console.ReadLine();
        }

        string models = Console.ReadLine();

        // Print result
        while (!models.Equals("Close the Catalogue"))
        {
            foreach (Vehicle element in vehicles)
            {
                if (element.Model.Equals(models))
                {
                    Console.WriteLine(element);
                }
            }

            models = Console.ReadLine();
        }

        // Print result
        double averageCarsHorsePower = cars == 0 ? 0 : carHorsePower / cars;
        double averageTrucksHorsePower = trucks == 0 ? 0 : truckHorsePower / trucks;

        Console.WriteLine($"Cars have average horsepower of: {averageCarsHorsePower:F2}.");
        Console.WriteLine($"Trucks have average horsepower of: {averageTrucksHorsePower:F2}.");
    }
}

// Create practice Vehicle class
class Vehicle
{
    public string Type { get; set; }
    public string Model { get; set; }
    public string Color { get; set; }
    public int HorsePower { get; set; }

    public Vehicle(string type, string model, string color, int horsePower)
    {
        this.Type = type;
        this.Model = model;
        this.Color = color;
        this.HorsePower = horsePower;
    }

    public override string ToString()
    {
        string formattedType = char.ToUpper(Type[0]) + Type.Substring(1);
        return $"Type: {formattedType}\nModel: {this.Model}\nColor: {this.Color}\nHorsepower: {this.HorsePower}";
    }
}
