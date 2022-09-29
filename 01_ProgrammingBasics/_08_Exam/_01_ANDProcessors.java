package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _01_ANDProcessors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int processors = Integer.parseInt(scan.nextLine());
        int staff = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int work = staff*days*8;
        double processors2 = Math.floor(1.00*work/3);
        double total = Math.abs(processors-processors2);

        if (processors<=processors2){
            System.out.printf("Profit: -> %.2f BGN",total*110.10);
        }else{
            System.out.printf("Losses: -> %.2f BGN",total*110.10);
        }
    }
}
