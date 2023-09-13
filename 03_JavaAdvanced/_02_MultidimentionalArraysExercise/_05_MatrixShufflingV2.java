package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _05_MatrixShufflingV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String dimensions = scan.nextLine();

        // Set rows and cols of the matrix
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        // Generate the matrix
        String[][] matrix = new String[rows][cols];
        fillMatrix(scan, rows, matrix);
        String commandLine = scan.nextLine();

        // Execute operations with the given matrix
        while(!commandLine.equals("END")){
            if(validateCommand(commandLine, rows, cols)){
                String[] command = commandLine.split("\\s+");

                int row1 = Integer.parseInt(command[1]); int col1 = Integer.parseInt(command[2]); int row2 = Integer.parseInt(command[3]); int col2 = Integer.parseInt(command[4]);

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

        scan.close();
    }

    // Method that prints the matrix
    public static void printMatrix(String[][] matrix){
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }

            System.out.println();
        }
    }


    private static boolean validateCommand(String commandLine, int rows, int cols) {
        String[] command = commandLine.split("\\s+");

        if(!command[0].equals("swap") || command.length != 5){
            return false;
        }

        int row1 = Integer.parseInt(command[1]); int col1 = Integer.parseInt(command[2]); int row2 = Integer.parseInt(command[3]); int col2 = Integer.parseInt(command[4]);

        return row1 >= 0 && row1 < rows && row2 >= 0 && row2 < rows && col1 >= 0 && col1 < cols && col2 >= 0 && col2 < cols;
    }

    // Method that fills the matrix
    private static void fillMatrix(Scanner scan, int rows, String[][] matrix){
        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
    }
}
