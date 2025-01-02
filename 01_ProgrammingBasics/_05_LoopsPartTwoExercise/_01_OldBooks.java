package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String book = scan.nextLine();
        String favoriteBook = scan.nextLine();

        // Staging
        int count = 0;

        // Use a while loop to search for the favorite book
        while (!favoriteBook.equals(book)) {
            if (favoriteBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", count);
                break;
            }
            
            count++;
            favoriteBook = scan.nextLine();
        }

        // Display the result based on whether the favorite book was found
        if (favoriteBook.equals(book)) {
            System.out.printf("You checked %d books and found it.", count);
        }

        scan.close();
    }
}
