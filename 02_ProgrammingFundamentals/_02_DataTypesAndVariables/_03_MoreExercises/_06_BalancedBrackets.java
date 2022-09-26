package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;

public class _06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        int counter = 0;
        int counterOpeningAndClosing = 0;
        int stack = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String console = scan.nextLine();
            if(console.length() == 1 && console.charAt(0) == '('){
                counterOpeningAndClosing++;
                if (counter > 0){
                    counter = 0;
                }
                counter++;
            }else if(console.length() == 1 && console.charAt(0) == ')'){
                if (counter > 0){
                    counter = 0;
                    stack++;
                }
                counterOpeningAndClosing++;
            }
        }
        if((1.00*counterOpeningAndClosing)/2 != stack){
            System.out.println("UNBALANCED");
        }else{
            System.out.println("BALANCED");
        }
    }
}
