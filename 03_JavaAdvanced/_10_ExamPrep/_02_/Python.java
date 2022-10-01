package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<String> directions = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).forEach(directions::offer);
        char[][] pythonField = new char[n][];
        for (int i = 0; i < pythonField.length; i++) {
            pythonField[i] = scan.nextLine().replaceAll(" ","").toCharArray();
        }
        boolean gotKilled = false;
        int startRow = 0;
        int startColumn = 0;
        int food = 0;
        for (int i = 0; i < pythonField.length; i++) {
            for (int j = 0; j < pythonField[i].length; j++) {
                if(pythonField[i][j] == 'f'){
                    food++;
                }
                if(pythonField[i][j] == 's'){
                    startRow = i;
                    startColumn = j;
                }
            }
        }
        int length = 1;
        while (!directions.isEmpty()){
            if(food == 0){
                break;
            }
            String moveCommand = directions.poll();
            if(moveCommand.equals("up")){
                if(isValid(startRow-1,startColumn,pythonField)){
                    startRow--;
                }else{
                    startRow = pythonField.length-1;
                }

            }else if(moveCommand.equals("down")){
                if(isValid(startRow+1,startColumn,pythonField)){
                    startRow++;
                }else{
                    startRow = 0;
                }

            }else if(moveCommand.equals("right")){
                if(isValid(startRow,startColumn+1,pythonField)){
                    startColumn++;
                }else{
                    startColumn = 0;
                }
            }else if(moveCommand.equals("left")){
                if(isValid(startRow,startColumn-1,pythonField)){
                    startColumn--;
                }else{
                    startColumn = pythonField[startRow].length-1;
                }
            }
            char charAt = pythonField[startRow][startColumn];
            if (charAt == 'e'){
                gotKilled = true;
                break;
            }else if (charAt == 'f'){
                length++;
                food--;
            }
        }
        if(food == 0 && !gotKilled){
            System.out.println("You win! Final python length is " + length);
        }else if(food > 0 && !gotKilled){
            System.out.println("You lose! There is still " + food + " food to be eaten.");
        }else if(gotKilled){
            System.out.println("You lose! Killed by an enemy!");
        }
    }
    private static boolean isValid(int r, int c, char[][] matrix){
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
