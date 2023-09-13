package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine().replace("Rotate(","").replace(")","");

        // Add variables
        int n = Integer.parseInt(console) % 360;
        int maxLength = -1;
        List<String> strings = new ArrayList<>();

        console = scan.nextLine();

        // Read additional input
        while (!console.equals("END")){
            if (console.length() > maxLength){
                maxLength = console.length();
            }

            strings.add(console);

            console = scan.nextLine();
        }

        // Determine the empty spaces based on the length of the word
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() < maxLength){
                int difference = maxLength - strings.get(i).length();
                String empty = "";

                for (int j = 0; j < difference; j++) {
                    empty += " ";
                }

                strings.set(i, strings.get(i) + empty);
            }
        }

        char[][] matrix = new char[strings.size()][maxLength];

        // Rotate the matrix based on the degrees
        switch(n){
            case 0:
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i] = strings.get(i).toCharArray();
                }

                break;
            case 90:
                char[][] newMatrix90 = new char[maxLength][strings.size()];
                int reverse = strings.size()-1;

                for (int i = 0; i < strings.size(); i++) {
                    for (int j = 0; j < strings.get(i).length(); j++) {
                        newMatrix90[j][i] = strings.get(reverse).charAt(j);
                    }

                    reverse--;
                }

                matrix = newMatrix90;

                break;
            case 180:
                int word = strings.size()-1;

                for (int i = 0; i < matrix.length; i++) {
                    matrix[i] = new StringBuilder(strings.get(word)).reverse().toString().toCharArray();
                    word--;
                }

                break;
            case 270:
                char[][] newMatrix270 = new char[maxLength][strings.size()];

                for (int i = 0; i < strings.size(); i++) {
                    int length = strings.get(i).length()-1;
                    for (int j = 0; j < strings.get(i).length(); j++) {
                        newMatrix270[j][i] = strings.get(i).charAt(length);
                        length--;
                    }
                }

                matrix = newMatrix270;

                break;
        }

        // Print result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

        scan.close();
    }
}
