package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfCommands = Integer.parseInt(scan.nextLine());

        // Add variables
        StringBuilder text = new StringBuilder();
        Deque<String> undoOperation = new ArrayDeque<>();
        Deque<String> lastOperation = new ArrayDeque<>();

        // Execute string operations
        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandLine = scan.nextLine().split("\\s+");

            String command = commandLine[0];

            if (command.equals("1")) {
                undoOperation.push(text.toString());

                String string = commandLine[1];
                text.append(string);

                lastOperation.push("1");

            } else if (command.equals("2")) {
                undoOperation.push(text.toString());

                int count = Integer.parseInt(commandLine[1]);
                for (int j = 0; j < count; j++) {
                    if(text.length()>0){
                        text.deleteCharAt(text.length()-1);
                    }
                }

                lastOperation.push("2");

            } else if (command.equals("3")) {
                int index = Integer.parseInt(commandLine[1]);

                if(index >= 0 && index <= text.length()){
                    System.out.println(text.charAt(index-1));
                }
            }else if(command.equals("4")){
                assert lastOperation.peek() != null;

                text.setLength(0);
                text.append(undoOperation.pop());
                lastOperation.pop();
            }
        }

        scan.close();
    }
}
