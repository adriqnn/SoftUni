using System;

public class _06_Bills
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfMonths = int.Parse(Console.ReadLine());

        // Add variables
        double electricityBill = 0;
        double waterBill = numberOfMonths * 20;
        double internetBill = numberOfMonths * 15;
        double otherBills = 0;

        // Process each month's bills and calculate expenses
        for (int i = 0; i < numberOfMonths; i++)
        {
            double monthlyElectricityBill = double.Parse(Console.ReadLine());

            electricityBill += monthlyElectricityBill;
            otherBills += (monthlyElectricityBill + 20 + 15) * 1.2;
        }

        double allExpenses = electricityBill + waterBill + internetBill + otherBills;

        // Print the expenses and average
        Console.WriteLine("Electricity: {0:F2} lv", electricityBill);
        Console.WriteLine("Water: {0:F2} lv", waterBill);
        Console.WriteLine("Internet: {0:F2} lv", internetBill);
        Console.WriteLine("Other: {0:F2} lv", otherBills);
        Console.WriteLine("Average: {0:F2} lv", allExpenses / numberOfMonths);
    }
}
