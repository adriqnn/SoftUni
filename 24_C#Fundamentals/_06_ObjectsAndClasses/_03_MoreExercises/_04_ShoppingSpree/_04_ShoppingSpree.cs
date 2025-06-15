using System;
using System.Runtime.ConstrainedExecution;
using System.Security.Cryptography.X509Certificates;

public class _04_ShoppingSpree
{
    public static void Main(string[] args)
    {
        //Read input values
        string[] consolePeople = Console.ReadLine().Split(";", StringSplitOptions.RemoveEmptyEntries);
        string[] consoleProducts = Console.ReadLine().Split(";", StringSplitOptions.RemoveEmptyEntries);

        // Add variables
        List<Person> personList = new List<Person>();
        List<Product> productList = new List<Product>();

        // Person database
        foreach (string p in consolePeople)
        {
            string[] peopleInfo = p.Split("=", StringSplitOptions.RemoveEmptyEntries);
            string name = peopleInfo[0];
            double money = double.Parse(peopleInfo[1]);

            Person person = new Person(name, money);
            personList.Add(person);
        }

        // Product database
        foreach (string p in consoleProducts)
        {
            string[] productInfo = p.Split("=", StringSplitOptions.RemoveEmptyEntries);
            string name = productInfo[0];
            double price = double.Parse(productInfo[1]);

            Product product = new Product(name, price);
            productList.Add(product);
        }

        string consoleInput = Console.ReadLine();
        while (consoleInput != "END") 
        {
            string[] consoleInputArr = consoleInput.Split(" ", StringSplitOptions.RemoveEmptyEntries);
            string name = consoleInputArr[0];
            string product = consoleInputArr[1];

            Person p = personList.Find(e => e.Name == name);
            Product pr = productList.Find(e => e.Name == product);

            p.buyProduct(pr);

            consoleInput = Console.ReadLine();
        }

        // Print result
        foreach (Person p in personList)
        {
            Console.WriteLine(p);
        }
    }
}

// Create practice Person class
class Person
{
    public string Name { get; set; }
    public double Money { get; set; }
    public List<Product> Products { get; set; }

    public Person(string name, double money)
    {
        this.Name = name;
        this.Money = money;
        this.Products = new List<Product>();
    }

    public void buyProduct(Product product)
    {
        if (product.Cost <= this.Money)
        {
            this.Money -= product.Cost;
            this.Products.Add(product);
            Console.WriteLine($"{this.Name} bought {product.Name}");
        }
        else
        {
            Console.WriteLine($"{this.Name} can't afford {product.Name}");
        }
    }

    public override string ToString()
    {
        return Products.Count > 0 ? $"{this.Name} - {string.Join(", ", this.Products)}" : $"{this.Name} - Nothing bought";
    }
}

// Create practice Product class
class Product
{
    public string Name { get; set; }
    public double Cost { get; set; }

    public Product(string name, double cost) {
        this.Name = name;
        this.Cost = cost;
    }

    public override string ToString()
    {
        return $"{this.Name}";
    }
}
