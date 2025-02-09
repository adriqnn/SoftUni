package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String console = scan.nextLine();

        // Manipulate the list based on the given commands
        while (!console.equals("end")) {
            String[] commandLine = console.split("\\s+");

            if (commandLine[0].equals("Contains")) {
                if (numbersList.contains(Integer.parseInt(commandLine[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (commandLine[0].equals("Print")) {
                boolean isChanged = false;

                if (commandLine[1].equals("even")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) % 2 == 0) {
                            isChanged = true;
                        }
                    }
                    
                    if (isChanged) {
                        numbersList.stream().forEach(e -> {
                            if (e % 2 == 0) {
                                System.out.print(e + " ");
                            }
                        });

                        System.out.println();
                    }
                } else if (commandLine[1].equals("odd")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) % 2 != 0) {
                            isChanged = true;
                        }
                    }

                    if (isChanged) {
                        numbersList.stream().forEach(e -> {
                            if (e % 2 != 0) {
                                System.out.print(e + " ");
                            }
                        });

                        System.out.println();
                    }
                }
            } else if (commandLine[0].equals("Get")) {
                int sum = 0;

                for (int i = 0; i < numbersList.size(); i++) {
                    sum += numbersList.get(i);
                }

                System.out.println(sum);
            } else if (commandLine[0].equals("Filter")) {
                numbersList.stream().forEach(e -> {
                    if (commandLine[1].equals("<")) {
                        if (e < Integer.parseInt(commandLine[2])) {
                            System.out.print(e + " ");
                        }
                    } else if (commandLine[1].equals(">")) {
                        if (e > Integer.parseInt(commandLine[2])) {
                            System.out.print(e + " ");
                        }
                    } else if (commandLine[1].equals(">=")) {
                        if (e >= Integer.parseInt(commandLine[2])) {
                            System.out.print(e + " ");
                        }
                    } else if (commandLine[1].equals("<=")) {
                        if (e <= Integer.parseInt(commandLine[2])) {
                            System.out.print(e + " ");
                        }
                    }
                });

                System.out.println();
            }

            console = scan.nextLine();
        }

        scan.close();
    }
}
