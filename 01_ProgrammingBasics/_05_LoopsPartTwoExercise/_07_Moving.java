package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int volume = width*length*height;

        String input = scan.nextLine();

        int boxesSum = 0;

        while(!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            boxesSum +=boxes;
            if(boxesSum>=volume){
                break;
            }
            input = scan.nextLine();
        }
        int diff = Math.abs(boxesSum-volume);
        if (boxesSum>=volume){
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }else{
            System.out.printf("%d Cubic meters left.",diff);
        }
    }
}
