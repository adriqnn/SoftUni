using System;

public class _02_RawData
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Car> list = new List<Car>();

        // Create database
        for (int i = 0; i < n; i++)
        {
            string[] consoleLine = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string model = consoleLine[0];
            int engineSpeed = int.Parse(consoleLine[1]);
            int enginePower = int.Parse(consoleLine[2]);
            int cargoWeight = int.Parse(consoleLine[3]);
            string CargoType = consoleLine[4];

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, CargoType);
            list.Add(car);
        }

        string type = Console.ReadLine();

        if(type == "fragile")
        {
            list = list.Where(car => car.CargoType == type && car.CargoWeight < 1000).ToList();
        }
        else
        {
            list = list.Where(car => car.CargoType == type && car.EnginePower > 250).ToList();
        }

        // Print Result
        foreach (Car car in list)
        {
            Console.WriteLine(car);
        }
    }
}

// Create practice Car class
class Car
{
    public string Model { get; set; }
    public int EngineSpeed { get; set; }
    public int EnginePower { get; set; }
    public int CargoWeight { get; set; }
    public string CargoType { get; set; }

    public Car(string model, int engineSpeed, int enginePower, int cargoWeight, string cargoType) 
    {
        this.Model = model;
        this.EngineSpeed = engineSpeed;
        this.EnginePower = enginePower;
        this.CargoWeight = cargoWeight;
        this.CargoType = cargoType;
    }

    public override string ToString()
    {
        return $"{this.Model}";
    }
}
