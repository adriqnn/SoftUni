using System;

public class _06_ArrayManipulator
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbersArray = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
        string command = Console.ReadLine();

        // Execute commands to the array with the created methods based on the console input
        while (command != "end")
        {
            string[] parts = command.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
            string commandLine = parts[0];

            if (commandLine == "exchange")
            {
                int index = int.Parse(parts[1]);
                
                if (IndexIsValidExchange(numbersArray, index))
                {
                    numbersArray = ExchangeInsideArray(numbersArray, index);
                }
                else
                {
                    Console.WriteLine("Invalid index");
                }
            }
            else if (commandLine == "max")
            {
                string oddOrEven = parts[1];
                ReturnMaxOrMinArray(numbersArray, oddOrEven);
            }
            else if (commandLine == "min")
            {
                string oddOrEven = parts[1];
                ReturnMinOrMaxArray(numbersArray, oddOrEven);
            }
            else if (commandLine == "first")
            {
                int countFirst = int.Parse(parts[1]);
                string oddOrEven = parts[2];
                
                if (countFirst >= 0 && IndexIsValidFirstLast(numbersArray, countFirst))
                {
                    FirstCountEvenOdd(numbersArray, countFirst, oddOrEven);
                }
                else
                {
                    Console.WriteLine("Invalid count");
                }
            }
            else if (commandLine == "last")
            {
                int countLast = int.Parse(parts[1]);
                string oddOrEven = parts[2];
                
                if (countLast >= 0 && IndexIsValidFirstLast(numbersArray, countLast))
                {
                    LastCountEvenOdd(numbersArray, countLast, oddOrEven);
                }
                else
                {
                    Console.WriteLine("Invalid count");
                }
            }

            command = Console.ReadLine();
        }

        // Print the final array
        PrintArray(numbersArray);
    }

    private static void LastCountEvenOdd(int[] numbersArray, int countLast, string oddOrEven)
    {
        List<int> resultList = new List<int>();
        int countNumbers = 0;

        if (oddOrEven == "odd")
        {
            for (int i = numbersArray.Length - 1; i >= 0; i--)
            {
                if (numbersArray[i] % 2 != 0 && countLast > countNumbers)
                {
                    resultList.Add(numbersArray[i]);
                    countNumbers++;
                }
            }
        }
        else // even
        {
            for (int i = numbersArray.Length - 1; i >= 0; i--)
            {
                if (numbersArray[i] % 2 == 0 && countLast > countNumbers)
                {
                    resultList.Add(numbersArray[i]);
                    countNumbers++;
                }
            }
        }

        // Reverse to preserve the original order
        resultList.Reverse();

        if (resultList.Count == 0)
        {
            Console.WriteLine("[]");
        }
        else
        {
            Console.WriteLine("[" + string.Join(", ", resultList) + "]");
        }
    }

    private static void FirstCountEvenOdd(int[] numbersArray, int countFirst, string oddOrEven)
    {
        List<int> resultList = new List<int>();
        int countNumbers = 0;

        if (oddOrEven == "odd")
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (countNumbers == countFirst)
                    break;

                if (numbersArray[i] % 2 != 0)
                {
                    resultList.Add(numbersArray[i]);
                    countNumbers++;
                }
            }
        }
        else if (oddOrEven == "even")
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (countNumbers == countFirst)
                    break;

                if (numbersArray[i] % 2 == 0)
                {
                    resultList.Add(numbersArray[i]);
                    countNumbers++;
                }
            }
        }

        if (resultList.Count == 0)
        {
            Console.WriteLine("[]");
        }
        else
        {
            Console.WriteLine("[" + string.Join(", ", resultList) + "]");
        }
    }

    private static void ReturnMinOrMaxArray(int[] numbersArray, string oddOrEven)
    {
        int min = int.MaxValue;
        int indexOfMin = -1;

        if (oddOrEven == "odd")
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (numbersArray[i] % 2 != 0 && numbersArray[i] <= min)
                {
                    min = numbersArray[i];
                    indexOfMin = i;
                }
            }
        }
        else // even
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (numbersArray[i] % 2 == 0 && numbersArray[i] <= min)
                {
                    min = numbersArray[i];
                    indexOfMin = i;
                }
            }
        }

        if (indexOfMin != -1)
        {
            Console.WriteLine(indexOfMin);
        }
        else
        {
            Console.WriteLine("No matches");
        }
    }

    private static void ReturnMaxOrMinArray(int[] numbersArray, string oddOrEven)
    {
        int max = int.MinValue;
        int indexOfMax = -1;

        if (oddOrEven == "odd")
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (numbersArray[i] % 2 != 0 && numbersArray[i] >= max)
                {
                    max = numbersArray[i];
                    indexOfMax = i;
                }
            }
        }
        else // even
        {
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (numbersArray[i] % 2 == 0 && numbersArray[i] >= max)
                {
                    max = numbersArray[i];
                    indexOfMax = i;
                }
            }
        }

        if (indexOfMax != -1)
        {
            Console.WriteLine(indexOfMax);
        }
        else
        {
            Console.WriteLine("No matches");
        }
    }

    private static int[] ExchangeInsideArray(int[] numbersArray, int index)
    {
        if (index == numbersArray.Length - 1)
        {
            return numbersArray;
        }

        int[] afterExchange = new int[numbersArray.Length];
        int pos = 0;

        for (int i = index + 1; i < numbersArray.Length; i++)
        {
            afterExchange[pos] = numbersArray[i];
            pos++;
        }
        for (int i = 0; i <= index; i++)
        {
            afterExchange[pos] = numbersArray[i];
            pos++;
        }

        return afterExchange;
    }

    private static void PrintArray(int[] array)
    {
        Console.Write("[");
        Console.Write(string.Join(", ", array));
        Console.WriteLine("]");
    }

    private static bool IndexIsValidExchange(int[] array, int n)
    {
        return n >= 0 && n < array.Length;
    }

    private static bool IndexIsValidFirstLast(int[] array, int n)
    {
        return n > 0 && n <= array.Length;
    }
}
