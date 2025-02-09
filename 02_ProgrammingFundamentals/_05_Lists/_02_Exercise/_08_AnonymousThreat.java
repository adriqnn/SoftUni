package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> stringList = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String commandLine = scan.nextLine();

        // Read and execute commands based on the input
        while (!commandLine.equals("3:1")) {
            String[] commandsInformation = commandLine.split("\\s+");
            String command = commandsInformation[0];
            StringBuilder appendElements = new StringBuilder();

            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(commandsInformation[1]);
                int endIndex = Integer.parseInt(commandsInformation[2]);

                if (startIndex <= stringList.size() - 1 && startIndex < 0 ) {
                    startIndex = 0;
                }

                if (endIndex >= 0 && endIndex > stringList.size() - 1) {
                    endIndex = stringList.size() - 1;
                }

                if (startIndex <= stringList.size() - 1 && endIndex >= 0) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        appendElements.append(stringList.get(i));
                        stringList.remove(i);

                        i--;
                        endIndex--;
                    }

                    stringList.add(startIndex, appendElements.toString());
                }
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(commandsInformation[1]);
                int partitions = Integer.parseInt(commandsInformation[2]);

                String toDivide = stringList.get(index);
                stringList.remove(index);

                int partitionSize = toDivide.length() / partitions;
                int begin = 0;

                for (int i = 1; i < partitions; i++) {
                    stringList.add(index, toDivide.substring(begin, begin + partitionSize));
                    index++;
                    begin += partitionSize;
                }

                stringList.add(index, toDivide.substring(begin));
            }

            commandLine = scan.nextLine();
        }

        // Print result
        System.out.println(String.join(" ", stringList));

        scan.close();
    }
}
