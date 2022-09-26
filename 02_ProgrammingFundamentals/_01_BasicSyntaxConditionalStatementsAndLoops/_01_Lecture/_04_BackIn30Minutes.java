package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int timePlus30 = hours*60 + minutes + 30;
        int newHour = timePlus30/60;
        int newMinutes = timePlus30%60;

        if (newHour > 23){
            newHour = 0;
        }

        System.out.printf("%d:%02d",newHour,newMinutes);
    }
}
