using System;

public class _01_SumSeconds
{
    public static void Main(string[] args)
    {
        // Read the input times
        int timeFirst = int.Parse(Console.ReadLine());
        int timeSecond = int.Parse(Console.ReadLine());
        int timeThird = int.Parse(Console.ReadLine());

        // Calculate the total time in seconds
        int totalTime = timeFirst + timeSecond + timeThird;

        // Convert the total time to minutes and seconds
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        // Print the result in the desired format
        string timeResult = seconds < 10 ? string.Format("{0}:0{1}", minutes, seconds) : string.Format("{0}:{1}", minutes, seconds);
        Console.WriteLine(timeResult);
    }
}
