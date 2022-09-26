package _01_Programming_Basics._06_NestedLoops;

import java.util.Scanner;

public class _06_Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int i = floors; i > floors-1; i=floors-1) {
            for (int j = 0; j < rooms; j++) {
                System.out.printf("L%d%d ",i,j);
            }
        }
        for (int i = floors-1; i >= 1;i--){
            System.out.printf("%n");
            if (i%2 != 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            if (i%2 ==0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("O%d%d ", i, j);
                }
            }
        }
    }
}
