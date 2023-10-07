package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class Selling {
    public static int otherOR;
    public static int otherOC;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = Integer.parseInt(scan.nextLine());
        char[][] sellingMatrix = new char[size][];
        
        for (int i = 0; i < sellingMatrix.length; i++) {
            sellingMatrix[i] = scan.nextLine().toCharArray();
        }
        
        int r = 0;
        int c = 0;
        
        for (int i = 0; i < sellingMatrix.length; i++) {
            for (int j = 0; j < sellingMatrix[i].length; j++) {
                if(sellingMatrix[i][j] == 'S'){
                    r = i;
                    c = j;
                }
            }
        }
        
        boolean isOut = false;
        int sum = 0;
        String command = scan.nextLine();
        
        while(sum < 50){
            sellingMatrix[r][c] = '-';
            
            if(command.equals("up")){
                if(isValid(r-1, c, sellingMatrix)){
                    r--;
                    char place = sellingMatrix[r][c];
                    sellingMatrix[r][c] = '-';
                    
                    if(Character.isDigit(place)){
                        sum += Character.getNumericValue(place);
                    }else if(place == 'O'){
                        getOtherO(r, c, sellingMatrix);
                        sellingMatrix[otherOR][otherOC] = '-';
                        r = otherOR;
                        c = otherOC;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("down")){
                if(isValid(r+1, c, sellingMatrix)){
                    r++;
                    char place = sellingMatrix[r][c];
                    sellingMatrix[r][c] = '-';
                    
                    if(Character.isDigit(place)){
                        sum += Character.getNumericValue(place);
                    }else if(place == 'O'){
                        getOtherO(r, c, sellingMatrix);
                        sellingMatrix[otherOR][otherOC] = '-';
                        r = otherOR;
                        c = otherOC;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("left")){
                if(isValid(r, c-1, sellingMatrix)){
                    c--;
                    char place = sellingMatrix[r][c];
                    sellingMatrix[r][c] = '-';
                    
                    if(Character.isDigit(place)){
                        sum += Character.getNumericValue(place);
                    }else if(place == 'O'){
                        getOtherO(r, c, sellingMatrix);
                        sellingMatrix[otherOR][otherOC] = '-';
                        r = otherOR;
                        c = otherOC;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("right")){
                if(isValid(r, c+1, sellingMatrix)){
                    c++;
                    char place = sellingMatrix[r][c];
                    sellingMatrix[r][c] = '-';
                    
                    if(Character.isDigit(place)){
                        sum += Character.getNumericValue(place);
                    }else if(place == 'O'){
                        getOtherO(r, c, sellingMatrix);
                        sellingMatrix[otherOR][otherOC] = '-';
                        r = otherOR;
                        c = otherOC;
                    }
                }else{
                    isOut = true;
                }
            }
            
            if(isOut){
                break;
            }
            
            sellingMatrix[r][c] = 'S';
            if(sum >= 50){
                break;
            }
            
            command = scan.nextLine();
        }
        
        if(isOut){
            System.out.println("Bad news, you are out of the bakery.");
        }else if(sum >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        
        System.out.printf("Money: %d%n",sum);
        for (int i = 0; i < sellingMatrix.length; i++) {
            for (int j = 0; j < sellingMatrix[i].length; j++) {
                System.out.print(sellingMatrix[i][j]);
            }
            
            System.out.println();
        }
        
        scan.close();
    }

    private static void getOtherO(int r, int c, char[][] sellingMatrix) {
        for (int i = 0; i < sellingMatrix.length; i++) {
            for (int j = 0; j < sellingMatrix[i].length; j++) {
                if(sellingMatrix[i][j] == 'O' && i != r && j != c){
                    otherOR = i;
                    otherOC = j;
                }
            }
        }
    }

    public static boolean isValid(int r, int c, char[][] matrix){
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix.length;
    }
}
