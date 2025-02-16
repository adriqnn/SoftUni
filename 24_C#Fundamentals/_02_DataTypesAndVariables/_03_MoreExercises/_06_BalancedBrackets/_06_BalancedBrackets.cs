using System;

public class _06_BalancedBrackets
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfLines = int.Parse(Console.ReadLine());

        // Add variables
        int counterOpeningAndClosing = 0;
        int counter = 0;
        int stack = 0;

        // Determine the count of the brackets
        for (int i = 0; i < numberOfLines; i++)
        {
            string console = Console.ReadLine();

            if (console.Length == 1 && console[0] == '(')
            {
                counterOpeningAndClosing++;

                if (counter > 0)
                {
                    counter = 0;
                }

                counter++;
            }
            else if (console.Length == 1 && console[0] == ')')
            {
                counterOpeningAndClosing++;

                if (counter > 0)
                {
                    counter = 0;
                    stack++;
                }
            }
        }

        // Print result
        if ((1.00 * counterOpeningAndClosing) / 2 != stack)
        {
            Console.WriteLine("UNBALANCED");
        }
        else
        {
            Console.WriteLine("BALANCED");
        }
    }
}
