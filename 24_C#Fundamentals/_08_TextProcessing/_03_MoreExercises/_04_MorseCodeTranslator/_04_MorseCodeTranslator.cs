using System;

public class _04_MorseCodeTranslator
{
    public static void Main(string[] args)
    {
        // Read input value
        string code = Console.ReadLine();

        // Add variable
        List<string> morseCode = code.Split(" | ", StringSplitOptions.RemoveEmptyEntries).ToList();

        // Decipher morse code message
        for (int i = 0; i < morseCode.Count; i++)
        {
            string[] actualDecode = morseCode[i].Split(" ", StringSplitOptions.RemoveEmptyEntries);

            for (int j = 0; j < actualDecode.Length; j++)
            {
                string thisPart = actualDecode[j].Trim();

                switch (thisPart)
                {
                    case ".-":
                        Console.Write("A");
                        break;
                    case "-...":
                        Console.Write("B");
                        break;
                    case "-.-.":
                        Console.Write("C");
                        break;
                    case "-..":
                        Console.Write("D");
                        break;
                    case ".":
                        Console.Write("E");
                        break;
                    case "..-.":
                        Console.Write("F");
                        break;
                    case "--.":
                        Console.Write("G");
                        break;
                    case "....":
                        Console.Write("H");
                        break;
                    case "..":
                        Console.Write("I");
                        break;
                    case ".---":
                        Console.Write("J");
                        break;
                    case "-.-":
                        Console.Write("K");
                        break;
                    case ".-..":
                        Console.Write("L");
                        break;
                    case "--":
                        Console.Write("M");
                        break;
                    case "-.":
                        Console.Write("N");
                        break;
                    case "---":
                        Console.Write("O");
                        break;
                    case ".--.":
                        Console.Write("P");
                        break;
                    case "--.-":
                        Console.Write("Q");
                        break;
                    case ".-.":
                        Console.Write("R");
                        break;
                    case "...":
                        Console.Write("S");
                        break;
                    case "-":
                        Console.Write("T");
                        break;
                    case "..-":
                        Console.Write("U");
                        break;
                    case "...-":
                        Console.Write("V");
                        break;
                    case ".--":
                        Console.Write("W");
                        break;
                    case "-..-":
                        Console.Write("X");
                        break;
                    case "-.--":
                        Console.Write("Y");
                        break;
                    case "--..":
                        Console.Write("Z");
                        break;
                }
            }

            // Print result
            Console.Write(" ");
        }
    }
}
