using System;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input value
        StringBuilder input = new StringBuilder(scan.nextLine());
        
        // Reverse strings
        while (!input.toString().equals("end")) {
            String original = input.toString();
            input.reverse();
            
            // Print result
            System.out.printf("%s = %s%n", original, input);
            
            input = new StringBuilder(scan.nextLine());
        }
    }
}
