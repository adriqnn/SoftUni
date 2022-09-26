package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] commands = input.split("\\s+");
            String command = commands[0];

            if(command.equals("swap")){
                int firstNumber = Integer.parseInt(commands[1]);
                int secondNumber = Integer.parseInt(commands[2]);
                int swap = array[firstNumber];
                array[firstNumber] = array[secondNumber];
                array[secondNumber] = swap;
            }else if(command.equals("multiply")){
                int firstNumber = Integer.parseInt(commands[1]);
                int secondNumber = Integer.parseInt(commands[2]);
                array[firstNumber] = array[firstNumber] * array[secondNumber];
            }else{
                array = Arrays.stream(array).map(e -> e - 1).toArray();
            }
            input = scan.nextLine();
        }
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }
}
