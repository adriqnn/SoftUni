using System;

public class _07_FoldAndSum
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] arr = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int mid = arr.Length / 2 / 2;
        List<int> listFirstRev = arr.Take(mid).Reverse().ToList();
        List<int> listLastRev = arr.Skip(arr.Length - mid).Reverse().ToList();

        // Operations
        List<int> newArrFirstLast = listFirstRev.Concat(listLastRev).ToList();
        List<int> newArrMiddle = arr.Skip(mid).Take(arr.Length - 2 * mid).ToList();
        List<int> result = new List<int>();

        for (int i = 0; i < newArrFirstLast.Count; i++)
        {
            result.Add(newArrFirstLast[i] + newArrMiddle[i]);
        }


        // Print result
        Console.WriteLine(string.Join(" ", result.ToArray()));
    }
}
