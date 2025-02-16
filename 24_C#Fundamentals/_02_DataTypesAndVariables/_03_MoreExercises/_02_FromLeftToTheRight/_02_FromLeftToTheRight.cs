using System;

public class _02_FromLeftToTheRight
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Examine left and right numbers
        for (int i = 0; i < n; i++)
        {
            long[] numbersArray = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(long.Parse).ToArray();

            // Add variables
            long firstNumber = numbersArray[0];
            long secondNumber = numbersArray[1];
            long sum = 0;

            // Compare numbers
            if (firstNumber >= secondNumber)
            {
                firstNumber = Math.Abs(firstNumber);

                while (firstNumber > 0)
                {
                    sum += firstNumber % 10;
                    firstNumber = firstNumber / 10;
                }
            }
            else
            {
                secondNumber = Math.Abs(secondNumber);

                while (secondNumber > 0)
                {
                    sum += secondNumber % 10;
                    secondNumber = secondNumber / 10;
                }
            }

            // Print result
            Console.WriteLine(sum);
        }
    }
}
