using System;
using System.Collections.Generic;
using System.Linq;

public class _07_StoreBoxes
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        List<Box> boxList = new List<Box>();

        // Save a list of boxes
        while (!console.Equals("end"))
        {
            string[] lineFromConsole = console.Split(" ");

            int serialNumber = int.Parse(lineFromConsole[0]);
            string itemName = lineFromConsole[1];
            int itemQuantity = int.Parse(lineFromConsole[2]);
            double itemPrice = double.Parse(lineFromConsole[3]);

            Item item = new Item(itemName, itemPrice);
            Box box = new Box(serialNumber, item, itemQuantity, itemPrice);
            boxList.Add(box);

            console = Console.ReadLine();
        }

        var sortedBoxes = boxList.OrderByDescending(b => b.BoxPrice);

        // Print result
        foreach (Box element in sortedBoxes)
        {
            Console.WriteLine(element.ToString());
        }
    }
}

// Create practice Box class
class Box
{
    public int SerialNumber { get; set; }
    public Item Item { get; set; }
    public int ItemQuantity { get; set; }
    public double BoxPrice { get; set; }

    public Box(int serialNumber, Item item, int itemQuantity, double itemPrice)
    {
        this.SerialNumber = serialNumber;
        this.Item = item;
        this.ItemQuantity = itemQuantity;
        this.BoxPrice = itemQuantity * itemPrice;
    }

    public override string ToString()
    {
        return $"{this.SerialNumber}{Environment.NewLine}-- {this.Item.Name} - ${this.Item.Price:F2}: {this.ItemQuantity}{Environment.NewLine}-- ${this.BoxPrice:F2}";
    }
}

// Create practice Item class
class Item
{
    public string Name { get; }
    public double Price { get; }

    public Item(string name, double price)
    {
        this.Name = name;
        this.Price = price;
    }
}
