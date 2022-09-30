package _03_JavaAdvanced._08_GenericsExercise._07_08_09_CustomListWithSorterAndIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();
        while(!console.equals("END")){
            String[] commandLine = console.split("\\s+");
            String commandName = commandLine[0];
            switch (commandName){
                case "Add":
                    String elementToAdd = commandLine[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandLine[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String elementToContain = commandLine[1];
                    System.out.println(customList.contains(elementToContain));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    String elementToCompare = commandLine[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.print(customList);
                    break;
            }
            console = scanner.nextLine();
        }
    }
}
