package _04_JavaOOP._08_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _01_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] range = scan.nextLine().split("\\s+");
        int startRange = Integer.parseInt(range[0]);
        int endRange = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]%n", startRange, endRange);

        boolean isValid = false;
        while(!isValid){
            String input = scan.nextLine();
            try{
                int number = Integer.parseInt(input);
                if(number >= startRange && number <= endRange){
                    System.out.printf("Valid number: %d%n", number);
                    isValid = true;
                    continue;
                }
                System.out.printf("Invalid number: %d%n", number);
            }catch(Exception e){
                System.out.printf("Invalid number: %s%n", input);
            }
        }
    }
}
