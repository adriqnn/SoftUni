package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class Bee {
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
                if(territoryMatrix[i][j] == 'B'){
                    r = i;
                    c = j;
                }
            }
        }

        int pollinatedFlowers = 0;
        boolean isOut = false;
        String command = scan.nextLine();

        while(!command.equals("End")){
            territoryMatrix[r][c] = '.';

            if(command.equals("up")){
                if(isValid(r-1,c,territoryMatrix)){
                    r--;
                    char character = territoryMatrix[r][c];

                    if(character == 'f'){
                        pollinatedFlowers++;
                    }else if(character == 'O'){
                        territoryMatrix[r][c] = '.';
                        r--;

                        if(territoryMatrix[r][c] == 'f'){
                            pollinatedFlowers++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("down")){
                if(isValid(r+1,c,territoryMatrix)){

                    r++;
                    char character = territoryMatrix[r][c];

                    if(character == 'f'){
                        pollinatedFlowers++;
                    }else if(character == 'O'){
                        territoryMatrix[r][c] = '.';
                        r++;
                        
                        if(territoryMatrix[r][c] == 'f'){
                            pollinatedFlowers++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("left")){
                if(isValid(r,c-1,territoryMatrix)){
                    c--;
                    char character = territoryMatrix[r][c];
                    if(character == 'f'){
                        pollinatedFlowers++;
                    }else if(character == 'O'){
                        territoryMatrix[r][c] = '.';
                        c--;
                        if(territoryMatrix[r][c] == 'f'){
                            pollinatedFlowers++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("right")){
                if(isValid(r,c+1,territoryMatrix)){
                    c++;
                    char character = territoryMatrix[r][c];
                    if(character == 'f'){
                        pollinatedFlowers++;
                    }else if(character == 'O'){
                        territoryMatrix[r][c] = '.';
                        c++;
                        if(territoryMatrix[r][c] == 'f'){
                            pollinatedFlowers++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }
            if(isOut){
                break;
            }
            territoryMatrix[r][c] = 'B';
            command = scan.nextLine();
        }
        if(isOut){
            System.out.println("The bee got lost!");
        }
        if(pollinatedFlowers < 5){
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n",5-pollinatedFlowers);
        }else{
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",pollinatedFlowers);
        }
        for (int i = 0; i < territoryMatrix.length; i++) {
            for (int j = 0; j < territoryMatrix[i].length; j++) {
                System.out.print(territoryMatrix[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isValid(int r,int c,char[][] matrix){
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
