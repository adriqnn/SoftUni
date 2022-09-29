package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();
        int wholeCake = width*length;
        int cake = wholeCake;
        int allSlices = 0;

        while(!console.equals("STOP")){
            int slices = Integer.parseInt(console);
            cake -= slices;
            allSlices += slices;
            if (cake<=0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(wholeCake-allSlices));
                break;
            }
            console = scan.nextLine();
        }
        if (console.equals("STOP")){
            System.out.printf("%d pieces are left.",cake);
        }
    }
}
