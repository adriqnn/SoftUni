using System;

public class _06_OperationsBetweenNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        int numberOne = int.Parse(Console.ReadLine());
        int numberTwo = int.Parse(Console.ReadLine());
        string op = Console.ReadLine();

        double result = 0;
        String resultType = "";

        // Perform the selected operation based on the operator
        if (op.Equals("+")) {
            result = numberOne + numberTwo;
        } else if (op.Equals("-")) {
            result = numberOne - numberTwo;
        } else if (op.Equals("*")) {
            result = numberOne * numberTwo;
        } else if (op.Equals("/")) {
            if (numberTwo != 0)
            {
                result = numberOne * 1.0 / numberTwo;
            }
            else
            {
                Console.WriteLine($"Cannot divide {numberOne} by zero\n");
                return; // Exit the program if division by zero
            }
        } else if (op.Equals("%")) {
            if (numberTwo != 0)
            {
                result = numberOne % numberTwo;
            }
            else
            {
                Console.WriteLine($"Cannot divide {numberOne} by zero\n");
                return; // Exit the program if division by zero
            }
        }

        // Determine whether the result is even or odd for +, -, and *
        if (op.Equals("+") || op.Equals("-") || op.Equals("*")) {
            if (result % 2 == 0)
            {
                resultType = "even";
            }
            else
            {
                resultType = "odd";
            }
        }

        // Display the result based on the operation and input values
        if (op.Equals("+") || op.Equals("-") || op.Equals("*")) {
            Console.WriteLine($"{numberOne} {op} {numberTwo} = {result:F0} - {resultType}\n");
        } else if (op.Equals("/")) {
            Console.WriteLine($"{numberOne} {op} {numberTwo} = {result:F2}\n", numberOne, op, numberTwo, result);
        } else if (op.Equals("%")) {
            Console.WriteLine($"{numberOne} {op} {numberTwo} = {result:F0}\n", numberOne, op, numberTwo, result);
        }
    }
}
