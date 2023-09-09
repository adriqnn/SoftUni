package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String tasks = scan.nextLine();

        // Add variable
        ArrayDeque<String> queueOfPrinterTasks = new ArrayDeque<>();

        // Create printer queue
        while(!tasks.equals("print")){
            if(tasks.equals("cancel")){
                if(queueOfPrinterTasks.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    String canceledTask = queueOfPrinterTasks.poll();
                    System.out.println("Canceled " + canceledTask);
                }
            }else{
                queueOfPrinterTasks.offer(tasks);
            }

            tasks = scan.nextLine();
        }

        /*for (String file : queueOfPrinterTasks) {
            System.out.println(file);
        }*/

        //queueOfPrinterTasks.stream().map(String::valueOf).collect(Collectors.joining(", "))

        //queueOfPrinterTasks.stream().collect(Collectors.joining(", "));

        /*while(!queueOfPrinterTasks.isEmpty()){
            System.out.println(queueOfPrinterTasks.poll());
        }*/

        // Print result
        System.out.println(queueOfPrinterTasks.stream().collect(Collectors.joining(System.lineSeparator())));

        scan.close();
    }
}
