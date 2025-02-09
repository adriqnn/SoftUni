package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String console = scan.nextLine();

        // Change the list based on the commands
        while (!console.equals("end")) {
            String[] commandLine = console.split("\\s+");
            String command = commandLine[0];

            if (command.equals("Delete")) {
                int element = Integer.parseInt(commandLine[1]);

                numbersList.removeIf(e -> e == element);
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(commandLine[2]);
                int num = Integer.parseInt(commandLine[1]);

                numbersList.add(index, num);
            }
            
            console = scan.nextLine();
        }

        // Print result
        numbersList.stream().forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
