package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.Scanner;

public class _61_JavaLambdaExpressions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Expression expression = new Expression();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String print = "";
            int[] commands = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(commands[0] == 1){
                print = expression.isOdd(commands[1]);
            }else if(commands[0] == 2){
                print = expression.isPrime(commands[1]);
            }else if(commands[0] == 3){
                print = expression.isPalindrome(commands[1]);
            }
            System.out.println(print);
        }
    }
}

class Expression{

    public String isOdd(int n){
        return n % 2 == 0 ? "EVEN" : "ODD";
    }

    public String isPrime(int n){
        return this.isPrimeCheck(n) ? "PRIME" : "COMPOSITE";
    }

    public String isPalindrome(int n){
        return (n + "").equals(new StringBuilder(n + "").reverse().toString()) ? "PALINDROME" : "NOT PALINDROME";
    }

    public boolean isPrimeCheck(int a){
        for(int i = 2; i <= Math.sqrt(a); i++)
            if(a % i == 0)
                return false;
        return true;
    }
}