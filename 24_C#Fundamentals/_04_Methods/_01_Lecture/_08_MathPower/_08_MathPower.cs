using System;

public class _08_MathPower
{
    public static void Main(string[] args)
    {
        // Read input value
        double num = double.Parse(Console.ReadLine());
        double power = double.Parse(Console.ReadLine());

        // Print result from the method
        double result = WhatIsThePowerOF(num, power);
        Console.WriteLine(result.ToString("0.####"));
    }

    private static double WhatIsThePowerOF(double num, double power)
    {
        return Math.Pow(num, power);
    }
}
