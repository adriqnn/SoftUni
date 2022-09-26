package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        try{
            System.out.println(days[n-1]);
        }catch (Exception e){
            System.out.println("Invalid day!");
        }
    }
}
