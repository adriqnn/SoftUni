package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numberList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String console = scan.nextLine();

        // Manipulate lists based on the given commands
        while (!console.equals("end")) {
            String commandline = console.split("\\s+")[0];

            if (commandline.equals("Add")) {
                numberList.add(Integer.parseInt(console.split("\\s+")[1]));
            } else if (commandline.equals("Remove")) {
                numberList.remove(Integer.valueOf(Integer.parseInt(console.split("\\s+")[1])));
            } else if (commandline.equals("RemoveAt")) {
                numberList.remove(Integer.parseInt(console.split("\\s+")[1]));
            } else if (commandline.equals("Insert")) {
                numberList.add(Integer.parseInt(console.split("\\s+")[2]), Integer.parseInt(console.split("\\s+")[1]));
            }

            console = scan.nextLine();
        }

        // Print result
        numberList.stream().forEach(e-> System.out.print(e + " "));

        scan.close();
    }
}
