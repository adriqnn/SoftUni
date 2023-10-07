package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int presents = Integer.parseInt(scan.nextLine());
        int neighbourhood = Integer.parseInt(scan.nextLine());
        char[][] neighbourhoodMatrix = new char[neighbourhood][];
        for (int i = 0; i < neighbourhoodMatrix.length; i++) {
            neighbourhoodMatrix[i] = scan.nextLine().replaceAll(" ","").toCharArray();
        }
        int startRow = 0;
        int startCol = 0;
        int good = 0;
        int gotPresent = 0;
        int bad = 0;
        int cookies = 0;
        for (int i = 0; i < neighbourhoodMatrix.length; i++) {
            for (int j = 0; j < neighbourhoodMatrix[i].length; j++) {
                if(neighbourhoodMatrix[i][j] == 'S'){
                    startRow = i;
                    startCol = j;
                }
                if(neighbourhoodMatrix[i][j] == 'X'){
                    bad++;
                }
                if(neighbourhoodMatrix[i][j] == 'V'){
                    good++;
                }
                if(neighbourhoodMatrix[i][j] == 'C'){
                    cookies++;
                }
            }
        }
        boolean ranOut = false;
        String command = scan.nextLine();
        while(!command.equals("Christmas morning") && presents > 0){
            neighbourhoodMatrix[startRow][startCol] = '-';
            if(command.equals("up")){
                if(isValid(startRow-1,startCol,neighbourhoodMatrix)){
                    startRow--;
                    if(neighbourhoodMatrix[startRow][startCol] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[startRow][startCol] == 'C'){
                        if(neighbourhoodMatrix[startRow][startCol-1] == 'V' || neighbourhoodMatrix[startRow][startCol-1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol-1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol-1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow][startCol+1] == 'V' || neighbourhoodMatrix[startRow][startCol+1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol+1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol+1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow-1][startCol] == 'V' || neighbourhoodMatrix[startRow-1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow-1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow-1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow+1][startCol] == 'V' || neighbourhoodMatrix[startRow+1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow+1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow+1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(command.equals("down")){
                if(isValid(startRow+1,startCol,neighbourhoodMatrix)){
                    startRow++;
                    if(neighbourhoodMatrix[startRow][startCol] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[startRow][startCol] == 'C'){
                        if(neighbourhoodMatrix[startRow][startCol-1] == 'V' || neighbourhoodMatrix[startRow][startCol-1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol-1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol-1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow][startCol+1] == 'V' || neighbourhoodMatrix[startRow][startCol+1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol+1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol+1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow-1][startCol] == 'V' || neighbourhoodMatrix[startRow-1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow-1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow-1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow+1][startCol] == 'V' || neighbourhoodMatrix[startRow+1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow+1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow+1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(command.equals("left")){
                if(isValid(startRow,startCol-1,neighbourhoodMatrix)){
                    startCol--;
                    if(neighbourhoodMatrix[startRow][startCol] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[startRow][startCol] == 'C'){
                        if(neighbourhoodMatrix[startRow][startCol-1] == 'V' || neighbourhoodMatrix[startRow][startCol-1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol-1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol-1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow][startCol+1] == 'V' || neighbourhoodMatrix[startRow][startCol+1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol+1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol+1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow-1][startCol] == 'V' || neighbourhoodMatrix[startRow-1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow-1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow-1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow+1][startCol] == 'V' || neighbourhoodMatrix[startRow+1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow+1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow+1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(command.equals("right")){
                if(isValid(startRow,startCol+1,neighbourhoodMatrix)){
                    startCol++;
                    if(neighbourhoodMatrix[startRow][startCol] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[startRow][startCol] == 'C'){
                        if(neighbourhoodMatrix[startRow][startCol-1] == 'V' || neighbourhoodMatrix[startRow][startCol-1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol-1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol-1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow][startCol+1] == 'V' || neighbourhoodMatrix[startRow][startCol+1] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow][startCol+1] = '-';
                            if(neighbourhoodMatrix[startRow][startCol+1] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow-1][startCol] == 'V' || neighbourhoodMatrix[startRow-1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow-1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow-1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                        if(neighbourhoodMatrix[startRow+1][startCol] == 'V' || neighbourhoodMatrix[startRow+1][startCol] == 'X' && presents > 0){
                            presents--;
                            neighbourhoodMatrix[startRow+1][startCol] = '-';
                            if(neighbourhoodMatrix[startRow+1][startCol] =='V'){
                                gotPresent++;
                            }
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }
            neighbourhoodMatrix[startRow][startCol] = 'S';
            if(presents == 0){
                break;
            }
            command = scan.nextLine();
        }
        if(ranOut || presents == 0){
            System.out.println("Santa ran out of presents!");
        }
        for (int i = 0; i < neighbourhoodMatrix.length; i++) {
            for (int j = 0; j < neighbourhoodMatrix[i].length; j++) {
                System.out.print(neighbourhoodMatrix[i][j] + " ");
            }
            System.out.println();
        }
        if(gotPresent == good){
            System.out.printf("Good job, Santa! %d happy nice kid/s.%n",good);
        }else{
            System.out.printf("No presents for %d nice kid/s.%n",good-gotPresent);
        }

    }
    public static boolean isValid(int row,int col,char[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
