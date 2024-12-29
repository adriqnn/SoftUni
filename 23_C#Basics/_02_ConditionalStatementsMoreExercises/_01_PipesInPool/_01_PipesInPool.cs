using System;

public class _01_PipesInPool
{
    public static void Main(string[] args)
    {
        // Read input values
        double volumeOfThePool = double.Parse(Console.ReadLine());
        double pipeOneFlowRate = double.Parse(Console.ReadLine());
        double pipeTwoFlowRate = double.Parse(Console.ReadLine());
        double hoursWorkerIsOut = double.Parse(Console.ReadLine());

        // Calculate volumes filled by each pipe
        double volumeFilledByPipeOne = pipeOneFlowRate * hoursWorkerIsOut;
        double volumeFilledByPipeTwo = pipeTwoFlowRate * hoursWorkerIsOut;

        // Calculate the combined volume filled by both pipes
        double combinedBothPipes = volumeFilledByPipeOne + volumeFilledByPipeTwo;

        // Check if the pool overflows or not
        if (combinedBothPipes > volumeOfThePool)
        {
            Console.WriteLine($"For {hoursWorkerIsOut:F2} hours the pool overflows with {combinedBothPipes - volumeOfThePool:F2} liters.");
        }
        else
        {
            // Calculate percentages and provide output
            double percentToWhichThePoolIsFilled = (combinedBothPipes / volumeOfThePool) * 100;
            double percentFirstPipe = (volumeFilledByPipeOne / combinedBothPipes) * 100;
            double percentSecondPipe = (volumeFilledByPipeTwo / combinedBothPipes) * 100;
            Console.WriteLine($"The pool is {percentToWhichThePoolIsFilled:F2}% full. Pipe 1: {percentFirstPipe:F2}%. Pipe 2: {percentSecondPipe:F2}%.");
        }
    }
}
