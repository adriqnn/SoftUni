package _04_JavaOOP._01_WorkingWithAbstraction;

import java.util.Scanner;

public class _02_RhombusOfStarsV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //printRhombus(n);
        _01_RhombusOfStars rhombus = new _01_RhombusOfStars(n);
        System.out.println(rhombus.getRhombus());
    }
    public static void printRhombus(int n){
        printTop(n);
        printMiddle(n);
        printBottom(n);
    }
    public static void printTop(int n){
        for (int i = 1; i < n; i++) {
            repeatAndPrintString(n-i," ");
            repeatAndPrintString(i,"* ");
            System.out.println();
        }
    }
    public static void printMiddle(int n){
        repeatAndPrintString(n,"* ");
        System.out.println();
    }
    public static void printBottom(int n){
        for (int i = 1; i < n; i++) {
            repeatAndPrintString(i," ");
            repeatAndPrintString(n-i,"* ");
            System.out.println();
        }
    }
    public static void repeatAndPrintString(int count, String str){
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }
}
