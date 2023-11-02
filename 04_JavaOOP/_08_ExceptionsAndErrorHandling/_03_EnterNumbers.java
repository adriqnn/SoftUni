package _04_JavaOOP._08_ExceptionsAndErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_EnterNumbers {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int lowerRange = 1;
        int upperRange = 100;

        while(numbers.size() < 10){
            String input = scan.nextLine();

            try{
                int number = Integer.parseInt(input);
                
                if(number > lowerRange && number < upperRange){
                    lowerRange = number;
                    numbers.add(number);
                }else{
                    System.out.printf("Your number is not in range %d - %d!%n", lowerRange, upperRange);
                }
            }catch(Exception e){
                System.out.println("Invalid Number!");
            }

        }
        
        System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        
        scan.close();
    }
}
