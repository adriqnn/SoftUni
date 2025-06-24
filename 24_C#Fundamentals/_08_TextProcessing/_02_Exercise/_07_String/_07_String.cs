using System;
using System.Text;

public class _07_String
{
    static void Main(string[] args)
    {
        // Read input value
        StringBuilder console = new StringBuilder(Console.ReadLine());

        // Add variables
        int leftover = 0;
        bool has = false;

        // Remove appropriate characters based on the task
        for (int i = 0; i < console.Length; i++)
        {
            int index = 0;
            int remove = 0;

            if (console[i] == '>')
            {
                if (has)
                {
                    index = (int)char.GetNumericValue(console[i + 1]) + leftover;
                    remove = (int)char.GetNumericValue(console[i + 1]) + leftover;

                    has = false;
                }
                else
                {
                    index = (int)char.GetNumericValue(console[i + 1]);
                    remove = (int)char.GetNumericValue(console[i + 1]);
                }

                if (i + index >= console.Length - 1 && !console.ToString().Substring(i + 1, console.Length - i - 2).Contains(">"))
                {
                    console.Remove(i + 1, Math.Min(index, console.Length - i - 1));
                    continue;
                }
                else if (i + index >= console.Length - 1)
                {
                    for (int j = i + 1; j < i + index + 1 && j < console.Length; j++)
                    {
                        if (console[j] != '>')
                        {
                            console.Remove(j, 1);
                            remove--;
                            j--;
                        }
                        else
                        {
                            leftover = remove;
                            has = true;
                            break;
                        }
                    }

                    continue;
                }

                if (!console.ToString().Substring(i + 1, index).Contains(">"))
                {
                    console.Remove(i + 1, index);
                }
                else
                {
                    for (int j = i + 1; j < i + index + 1 && j < console.Length; j++)
                    {
                        if (console[j] != '>')
                        {
                            console.Remove(j, 1);
                            remove--;
                            j--;
                        }
                        else
                        {
                            leftover = remove;
                            has = true;
                            break;
                        }
                    }
                }
            }
        }

        // Print result
        Console.WriteLine(console.ToString());
    }
}
