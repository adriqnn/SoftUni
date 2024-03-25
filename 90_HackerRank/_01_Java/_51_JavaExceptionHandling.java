package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _51_JavaExceptionHandling {
    public static final MyC my_calculator = new MyC();
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int p = scan.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyC{
    public int power(int one, int two) throws Exception {
        if(one == 0 && two == 0){
            throw new Exception("n and p should not be zero.");
        }else if(one < 0 || two < 0){
            throw new Exception("n or p should not be negative.");
        }
        return (int) Math.pow(one, two);
    }
}