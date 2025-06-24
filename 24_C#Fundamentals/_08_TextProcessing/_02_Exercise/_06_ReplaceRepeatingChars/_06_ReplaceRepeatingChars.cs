using System;
using System.Text;

public class _06_ReplaceRepeatingChars
{
    public static void Main(string[] args)
    {
        // Read input value
        StringBuilder console = new StringBuilder(Console.ReadLine());

        // Replace repeating character
        for (int i = 1; i < console.Length; i++)
        {
            if (console[i] == console[i - 1])
            {
                console.Remove(i, 1);
                i--;
            }
        }

        // Print result
        Console.WriteLine(console);
    }
}
