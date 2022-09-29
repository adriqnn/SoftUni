package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String book = scan.nextLine();
        String fav = scan.nextLine();

        int count = 0;

        while(!fav.equals(book)){
            if (fav.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", count);
                break;
            }
            count++;
            fav = scan.nextLine();
        }

        if (fav.equals(book)){
            System.out.printf("You checked %d books and found it.", count);
        }
    }
}
