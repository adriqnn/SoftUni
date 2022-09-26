package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= n; i++) {
            boolean isNPrime = true;
            for (int j = 2; j < i; j++) {
                if(i%j ==0){
                    isNPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n",i,isNPrime);
        }
    }
}
