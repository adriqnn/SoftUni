using System;
using System.Linq;

public class _09_ArrayModifier
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] array = Console.ReadLine().Split().Select(int.Parse).ToArray();
        string input = Console.ReadLine();

        // Accept commands and modify the array
        while (!input.Equals("end"))
        {
            string[] commands = input.Split("\\s+");
            string command = commands[0];

            if (command.Equals("swap"))
            {
                int firstNumber = int.Parse(commands[1]);
                int secondNumber = int.Parse(commands[2]);
                int swap = array[firstNumber];

                array[firstNumber] = array[secondNumber];
                array[secondNumber] = swap;
            }
            else if (command.Equals("multiply"))
            {
                int firstNumber = int.Parse(commands[1]);
                int secondNumber = int.Parse(commands[2]);

                array[firstNumber] = array[firstNumber] * array[secondNumber];
            }
            else
            {
                array = array.Select(e => e - 1).ToArray();
            }

            input = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(", ", array));
    }
}
