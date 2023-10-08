package _03_JavaAdvanced._12_WorkshopBasicAlgorithms;


import java.util.Scanner;

public class _02_RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long sum = factorial(n);

        System.out.println(sum);

        scan.close();
    }

    static long factorial(int n){
        if(n <= 1){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
