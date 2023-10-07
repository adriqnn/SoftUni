package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class CookingJourney {
    public static int rowP;
    public static int colP;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        char[][] journeyMatrix = new char[size][];

        for (int i = 0; i < journeyMatrix.length; i++) {
            journeyMatrix[i] = scan.nextLine().toCharArray();
        }

        int r = 0;
        int c = 0;

        for (int i = 0; i < journeyMatrix.length; i++) {
            for (int j = 0; j < journeyMatrix[i].length; j++) {
                if(journeyMatrix[i][j] == 'S'){
                    r = i;
                    c = j;
                }
            }
        }

        int money = 0;
        boolean isOut = false;
        String command = scan.nextLine();

        while(money < 50){
            journeyMatrix[r][c] = '-';

            if (command.equals("up")){
                if(isValid(r-1, c, journeyMatrix)){
                    r--;
                    char place = journeyMatrix[r][c];
                    journeyMatrix[r][c] = '-';

                    if(Character.isDigit(place)){
                        money += Character.getNumericValue(place);
                    }else if(place == 'P'){
                        getOtherP(r, c, journeyMatrix);
                        journeyMatrix[rowP][colP] = '-';
                        r = rowP;
                        c = colP;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("down")){
                if(isValid(r+1, c, journeyMatrix)){
                    r++;
                    char place = journeyMatrix[r][c];
                    journeyMatrix[r][c] = '-';

                    if(Character.isDigit(place)){
                        money += Character.getNumericValue(place);
                    }else if(place == 'P'){
                        getOtherP(r, c, journeyMatrix);
                        journeyMatrix[rowP][colP] = '-';
                        r = rowP;
                        c = colP;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("left")){
                if(isValid(r, c-1, journeyMatrix)){
                    c--;
                    char place = journeyMatrix[r][c];
                    journeyMatrix[r][c] = '-';

                    if(Character.isDigit(place)){
                        money += Character.getNumericValue(place);
                    }else if(place == 'P'){
                        getOtherP(r, c, journeyMatrix);
                        journeyMatrix[rowP][colP] = '-';
                        r = rowP;
                        c = colP;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("right")){
                if(isValid(r, c+1, journeyMatrix)){
                    c++;
                    char place = journeyMatrix[r][c];
                    journeyMatrix[r][c] = '-'; 
                    
                    if(Character.isDigit(place)){
                        money += Character.getNumericValue(place);
                    }else if(place == 'P'){
                        getOtherP(r, c, journeyMatrix);
                        journeyMatrix[rowP][colP] = '-';
                        r = rowP;
                        c = colP;
                    }
                }else{
                    isOut = true;
                }
            }
            
            if(isOut){
                break;
            }
            
            journeyMatrix[r][c] = 'S';
            if(money >= 50){
                break;
            }
            
            command = scan.nextLine();
        }
        
        if(isOut){
            System.out.println("Bad news! You are out of the pastry shop.");
        }else if(money >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        
        System.out.printf("Money: %d%n", money);
        for (int i = 0; i < journeyMatrix.length; i++) {
            for (int j = 0; j < journeyMatrix[i].length; j++) {
                System.out.print(journeyMatrix[i][j]);
            }
            
            System.out.println();
        }
        
        scan.close();
    }

    private static void getOtherP(int r, int c, char[][] journeyMatrix) {
        for (int i = 0; i < journeyMatrix.length; i++) {
            for (int j = 0; j < journeyMatrix[i].length; j++) {
                if(journeyMatrix[i][j] == 'P' && i != r && j != c){
                    rowP = i;
                    colP = j;
                }
            }
        }
    }

    public static boolean isValid(int r, int c, char[][] matrix){
        return  r >= 0 && r < matrix.length && c >= 0 && c < matrix.length;
    }
}
