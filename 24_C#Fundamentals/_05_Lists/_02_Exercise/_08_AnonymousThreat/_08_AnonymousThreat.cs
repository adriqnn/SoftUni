using System;
using System.Text;

public class _08_AnonymousThreat
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> stringList = Console.ReadLine().Split().ToList();
        string commandLine = Console.ReadLine();

        // Read and execute commands based on the input
        while (!commandLine.Equals("3:1"))
        {
            string[] commandsInformation = commandLine.Split();
            string command = commandsInformation[0];
            StringBuilder appendElements = new StringBuilder();

            if (command.Equals("merge"))
            {
                int startIndex = int.Parse(commandsInformation[1]);
                int endIndex = int.Parse(commandsInformation[2]);

                if (startIndex > stringList.Count - 1 || startIndex < 0)
                {
                    startIndex = 0;
                }

                if (endIndex < 0 || endIndex > stringList.Count - 1)
                {
                    endIndex = stringList.Count - 1;
                }

                if (startIndex <= stringList.Count - 1 && endIndex >= 0)
                {
                    for (int i = startIndex; i <= endIndex; i++)
                    {
                        appendElements.Append(stringList[i]);
                    }

                    stringList.RemoveRange(startIndex, endIndex - startIndex + 1);
                    stringList.Insert(startIndex, appendElements.ToString());
                }
            }
            else if (command.Equals("divide"))
            {
                List<string> dividedInput = new List<string>();
                int index = int.Parse(commandsInformation[1]);
                int partitions = int.Parse(commandsInformation[2]);

                string word = stringList[index];
                int parts = word.Length / partitions;
                stringList.RemoveAt(index);

                for (int i = 0; i < partitions; i++)
                {
                    if (i == partitions - 1)
                    {
                        dividedInput.Add(word.Substring(i * parts));
                    }
                    else
                    {
                        dividedInput.Add(word.Substring(i * parts, parts));
                    }
                }

                stringList.InsertRange(index, dividedInput);
            }

            commandLine = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", stringList));
    }
}
