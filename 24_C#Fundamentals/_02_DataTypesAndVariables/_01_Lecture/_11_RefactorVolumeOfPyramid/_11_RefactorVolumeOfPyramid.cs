using System;

public class _11_RefactorVolumeOfPyramid
{
    public static void Main(string[] args)
    {
        // Read input values
        double length = double.Parse(Console.ReadLine()), width = double.Parse(Console.ReadLine()), height = double.Parse(Console.ReadLine());

        // Print result
        Console.Write("Length: ");
        Console.Write("Width: ");
        Console.Write("Height: ");
        Console.WriteLine($"Pyramid Volume: {(length * width * height) / 3:F2}");
    }
}
