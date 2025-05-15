package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.*;

public class _06_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();

        // Execute commands to the array with the created methods based on the console input
        while (!command.equals("end")) {
            String commandLine = command.split("\\s+")[0];

            if (commandLine.equals("exchange")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);

                if (indexIsValidExchange(numbersArray, index)) {
                    numbersArray = exchangeInsideArray(numbersArray, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine.equals("max")) {
                String isItEvenOrOddMax = command.split("\\s+")[1];

                returnMaxOrMinArray(numbersArray, isItEvenOrOddMax);
            } else if (commandLine.equals("min")) {
                String isItEvenOrOddMin = command.split("\\s+")[1];

                returnMinOrMaxArray(numbersArray, isItEvenOrOddMin);
            } else if (commandLine.equals("first")) {
                int countFirst = Integer.parseInt(command.split("\\s+")[1]);
                String firstIsItOddOrEven = command.split("\\s+")[2];

                if (countFirst >= 0 && indexIsValidFirstLast(numbersArray, countFirst)) {
                    firstCountEvenOdd(numbersArray, countFirst, firstIsItOddOrEven);
                } else {
                    System.out.println("Invalid count");
                }
            } else if (commandLine.equals("last")) {
                int countLast = Integer.parseInt(command.split("\\s+")[1]);
                String firstIsItOddOrEven = command.split("\\s+")[2];

                if (countLast >= 0 && indexIsValidFirstLast(numbersArray, countLast)) {
                    lastCountEvenOdd(numbersArray, countLast, firstIsItOddOrEven);
                } else {
                    System.out.println("Invalid count");
                }
            }

            command = scan.nextLine();
        }

        // Create printing method
        printArray(numbersArray);

        scan.close();
    }

    private static void lastCountEvenOdd(int[] numbersArray, int countLast, String firstIsItOddOrEven) {
        List<Integer> reverseArray = new ArrayList<>();
        int countNumbers = 0;

        if (firstIsItOddOrEven.equals("odd")) {
            for (int i = numbersArray.length - 1; i >= 0; i--) {
                if (numbersArray[i] % 2 != 0 && countLast > countNumbers) {
                    reverseArray.add(numbersArray[i]);
                    countNumbers++;
                }
            }
        } else {
            for (int i = numbersArray.length - 1; i >= 0; i--) {
                if (numbersArray[i] % 2 == 0 && countLast > countNumbers) {
                    reverseArray.add(numbersArray[i]);
                    countNumbers++;
                }
            }
        }

        Collections.reverse(reverseArray);

        if (reverseArray.isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.println(reverseArray);
        }
    }

    private static void firstCountEvenOdd(int[] numbersArray, int countFirst, String firstIsItOddOrEven) {
        String arrayString = "";
        int countNumbers = 0;

        if (firstIsItOddOrEven.equals("odd")) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (countFirst == countNumbers) {
                    break;
                }

                if (numbersArray[i] % 2 != 0) {
                    arrayString += numbersArray[i] + " ";
                    countNumbers++;
                }
            }
        }

        if (firstIsItOddOrEven.equals("even")) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (countFirst == countNumbers) {
                    break;
                }

                if (numbersArray[i] % 2 == 0) {
                    arrayString += numbersArray[i] + " ";
                    countNumbers++;
                }
            }
        }

        if (arrayString.equals("")) {
            System.out.println("[]");
            return;
        }

        int[] firstCountArray = Arrays.stream(arrayString.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        printArray(firstCountArray);
    }

    private static void returnMinOrMaxArray(int[] numbersArray, String isItEvenOrOddMin) {
        int min = Integer.MAX_VALUE;
        int indexOfMin = -1;

        if (isItEvenOrOddMin.equals("odd")) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] <= min && numbersArray[i] % 2 != 0) {
                    min = numbersArray[i];
                    indexOfMin = i;
                }
            }
        } else {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] <= min && numbersArray[i] % 2 == 0) {
                    min = numbersArray[i];
                    indexOfMin = i;
                }
            }
        }

        if (indexOfMin != -1) {
            System.out.println(indexOfMin);
        } else {
            System.out.println("No matches");
        }
    }

    private static void returnMaxOrMinArray(int[] numbersArray, String isItEvenOrOddMax) {
        int max = Integer.MIN_VALUE;
        int indexOfMax = -1;

        if (isItEvenOrOddMax.equals("odd")) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] >= max && numbersArray[i] % 2 != 0) {
                    max = numbersArray[i];
                    indexOfMax = i;
                }
            }
        } else {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] >= max && numbersArray[i] % 2 == 0) {
                    max = numbersArray[i];
                    indexOfMax = i;
                }
            }
        }

        if (indexOfMax != -1) {
            System.out.println(indexOfMax);
        } else {
            System.out.println("No matches");
        }
    }

    private static int[] exchangeInsideArray(int[] numbersArray, int index) {
        if (index == numbersArray.length - 1) {
            return numbersArray;
        }

        int[] afterExchange = new int[numbersArray.length];
        int change = 0;

        for (int i = index + 1; i < numbersArray.length; i++) {
            afterExchange[change] = numbersArray[i];
            change++;
        }

        for (int i = 0; i <= index; i++) {
            afterExchange[change] = numbersArray[i];
            change++;
        }

        return afterExchange;
    }

    private static void printArray (int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i == array.length - 1){
                System.out.print("]");
                break;
            }

            System.out.print(",");
            System.out.print(" ");
        }

        System.out.println();
    }

    private static boolean indexIsValidExchange (int[] array, int n) {
        return (n <= array.length - 1 && n >= 0);
    }

    private static boolean indexIsValidFirstLast(int[] array, int n) {
        return (n <= array.length && n > 0);
    }
}
