package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class Snake {
    public static int rB;
    public static int cB;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        char[][] territoryMatrix = new char[size][];
        for (int i = 0; i < territoryMatrix.length; i++) {
            territoryMatrix[i] = scan.nextLine().toCharArray();
        }
        int r = 0;
        int c = 0;
        for (int i = 0; i < territoryMatrix.length; i++) {
            for (int j = 0; j < territoryMatrix[i].length; j++) {
                if(territoryMatrix[i][j] == 'S'){
                    r = i;
                    c = j;
                }
            }
        }
        int eaten = 0;
        boolean isOut = false;
        while(eaten < 10){
            String command = scan.nextLine();
            territoryMatrix[r][c] = '.';
            if(command.equals("up")){
                if(isValid(r-1,c,territoryMatrix)){
                    r--;
                    if(territoryMatrix[r][c] == '*'){
                        eaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '.';
                        findB(r,c,territoryMatrix);
                        r = rB;
                        c = cB;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("down")){
                if(isValid(r+1,c,territoryMatrix)){
                    r++;
                    if(territoryMatrix[r][c] == '*'){
                        eaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '.';
                        findB(r,c,territoryMatrix);
                        r = rB;
                        c = cB;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("left")){
                if(isValid(r,c-1,territoryMatrix)){
                    c--;
                    if(territoryMatrix[r][c] == '*'){
                        eaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '.';
                        findB(r,c,territoryMatrix);
                        r = rB;
                        c = cB;
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("right")){
                if(isValid(r,c+1,territoryMatrix)){
                    c++;
                    if(territoryMatrix[r][c] == '*'){
                        eaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '.';
                        findB(r,c,territoryMatrix);
                        r = rB;
                        c = cB;
                    }
                }else{
                    isOut = true;
                }
            }
            if(isOut){
                break;
            }
            territoryMatrix[r][c] = 'S';
            if(eaten == 10){
                break;
            }
        }
        if(isOut){
            System.out.println("Game over!");
        }else{
            System.out.println("You won! You fed the snake.");
        }
        System.out.println("Food eaten: " + eaten);
        for (int i = 0; i < territoryMatrix.length; i++) {
            for (int j = 0; j < territoryMatrix[i].length; j++) {
                System.out.print(territoryMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void findB(int r, int c, char[][] territoryMatrix) {
        for (int i = 0; i < territoryMatrix.length; i++) {
            for (int j = 0; j < territoryMatrix[i].length; j++) {
                if(territoryMatrix[i][j] == 'B'){
                    rB = i;
                    cB = j;
                }
            }
        }
    }

    public static boolean isValid(int r, int c, char[][] matrix){
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
