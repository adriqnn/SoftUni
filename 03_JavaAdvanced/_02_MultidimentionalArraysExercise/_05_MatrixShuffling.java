package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dimensions = scan.nextLine();
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);
        String[][] matrix = new String[rows][cols];
        fillMatrix(scan,rows,matrix);
        String commandLine = scan.nextLine();
        while(!commandLine.equals("END")){
            if(validateCommand(commandLine,rows,cols)){
                String[] command = commandLine.split("\\s+");
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                String one = matrix[row1][col1];
                String two = matrix[row2][col2];
                matrix[row1][col1] = two;
                matrix[row2][col2] = one;
                printMatrix(matrix);
            }else{
                System.out.println("Invalid input!");
            }
            commandLine = scan.nextLine();
        }
    }
    public static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean validateCommand(String commandLine,int rows,int cols) {
        String[] command = commandLine.split("\\s+");
        if(!command[0].equals("swap")){
            return false;
        }
        if(command.length != 5){
            return false;
        }
        int row1 = Integer.parseInt(command[1]);
        int col1 = Integer.parseInt(command[2]);
        int row2 = Integer.parseInt(command[3]);
        int col2 = Integer.parseInt(command[4]);
        if(row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols){
            return false;
        }
        return true;
    }
    private static void fillMatrix(Scanner scan,int rows,String[][] matrix){
        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
    }
}
