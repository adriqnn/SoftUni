package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String initialize = scan.nextLine();
        int size = Integer.parseInt(scan.nextLine());
        char[][] charMatrix = new char[size][];
        for (int i = 0; i < size; i++) {
            charMatrix[i] = scan.nextLine().toCharArray();
        }
        Deque<String> queueCommands = new ArrayDeque<>();
        String commands = scan.nextLine();
        while(!commands.equals("end")){
            queueCommands.offer(commands);
            commands = scan.nextLine();
        }
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < charMatrix.length; i++) {
            for (int j = 0; j < charMatrix[i].length; j++) {
                if(charMatrix[i][j] == 'P'){
                    startRow = i;
                    startCol = j;
                }
            }

        }
        while(!queueCommands.isEmpty()){
            String command = queueCommands.poll();
            charMatrix[startRow][startCol] = '-';
            if(command.equals("up")){
                if(isValid(startRow-1,startCol,charMatrix)){
                    startRow--;
                    if(charMatrix[startRow][startCol] != '-'){
                        initialize = initialize + charMatrix[startRow][startCol];
                    }
                    charMatrix[startRow][startCol] = 'P';
                }else{
                    if(initialize.length() > 0){
                        initialize = initialize.substring(0,initialize.length()-1);
                    }
                    charMatrix[startRow][startCol] = 'P';
                }
            }else if(command.equals("down")){
                if(isValid(startRow+1,startCol,charMatrix)){
                    startRow++;
                    if(charMatrix[startRow][startCol] != '-'){
                        initialize = initialize + charMatrix[startRow][startCol];
                    }
                    charMatrix[startRow][startCol] = 'P';
                }else{
                    if(initialize.length() > 0){
                        initialize = initialize.substring(0,initialize.length()-1);
                    }
                    charMatrix[startRow][startCol] = 'P';
                }
            }else if(command.equals("left")){
                if(isValid(startRow,startCol-1,charMatrix)){
                    startCol--;
                    if(charMatrix[startRow][startCol] != '-'){
                        initialize = initialize + charMatrix[startRow][startCol];
                    }
                    charMatrix[startRow][startCol] = 'P';
                }else{
                    if(initialize.length() > 0){
                        initialize = initialize.substring(0,initialize.length()-1);
                    }
                    charMatrix[startRow][startCol] = 'P';
                }
            }else if(command.equals("right")){
                if(isValid(startRow,startCol+1,charMatrix)){
                    startCol++;
                    if(charMatrix[startRow][startCol] != '-'){
                        initialize = initialize + charMatrix[startRow][startCol];
                    }
                    charMatrix[startRow][startCol] = 'P';
                }else{
                    if(initialize.length() > 0){
                        initialize = initialize.substring(0,initialize.length()-1);
                    }
                    charMatrix[startRow][startCol] = 'P';
                }
            }
        }
        System.out.println(initialize);
        for (int i = 0; i < charMatrix.length; i++) {
            for (int j = 0; j < charMatrix[i].length; j++) {
                System.out.print(charMatrix[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isValid(int row, int col, char[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
