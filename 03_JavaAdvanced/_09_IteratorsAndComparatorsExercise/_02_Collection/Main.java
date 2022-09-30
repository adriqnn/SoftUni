package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._02_Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ListyIterator listyIterator = null;
        while(!line.equals("END")){
            String[] commandParts = line.split("\\s+");
            String commandName = commandParts[0];
            switch(commandName){
                case "Create":
                    if(commandParts.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(commandParts, 1, commandParts.length));
                        //Arrays.stream(commandParts).skip(1).collect(Collectors.toList());
                    }else{
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try{
                        listyIterator.print();
                    }catch(IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            line = scan.nextLine();
        }
    }
}
