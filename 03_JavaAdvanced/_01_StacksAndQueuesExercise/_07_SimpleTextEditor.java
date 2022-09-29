package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        int numberOfCommands = Integer.parseInt(scan.nextLine());
        Deque<String> undoOperation = new ArrayDeque<>();
        Deque<String> lastOperation = new ArrayDeque<>();
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
                if(lastOperation.peek().equals("1")){
                    text.setLength(0);
                    text.append(undoOperation.pop());
                    lastOperation.pop();
                }else{
                    text.setLength(0);
                    text.append(undoOperation.pop());
                    lastOperation.pop();
                }
            }
        }
    }
}
