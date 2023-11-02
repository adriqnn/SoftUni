package _04_JavaOOP._08_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _02_SquareRootV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        try{
            int sqr = Integer.parseInt(input);
            
            if(sqr < 0 ){
                throw new IllegalArgumentException();
            }
            
            System.out.printf("%.2f%n", Math.sqrt(sqr));
        }catch(Exception e){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }
        
        scan.close();
    }
}
