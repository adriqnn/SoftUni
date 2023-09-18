package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _10_RadioactiveMutantVampireBunnies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] dimensions = scan.nextLine().split("\\s+");

        // Add variables
        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[1]);
        char[][] rabbitDen = new char[row][];

        // Create the matrix
        for (int i = 0; i < rabbitDen.length; i++) {
            rabbitDen[i] = scan.nextLine().replaceAll(" ", "").toCharArray();
        }

        // Create the move-set
        String movement = scan.nextLine();
        ArrayDeque<Character> moves = new ArrayDeque<>();
        for (int i = 0; i < movement.length(); i++) {
            moves.offer(movement.charAt(i));
        }

        int player = 1;
        int playerLastR = -10;
        int playerLastL = -10;
        String playerCoordinates = "";

        // Determine player location
        for (int i = 0; i < rabbitDen.length; i++) {
            for (int j = 0; j < rabbitDen[i].length; j++) {
                if(rabbitDen[i][j] == 'P'){
                    playerCoordinates = i + " " + j;
                }
            }
        }

        // PLay the game
        while(!moves.isEmpty() && player == 1){
            char move = moves.poll();

            int r = Integer.parseInt(playerCoordinates.split("\\s+")[0]);
            int c = Integer.parseInt(playerCoordinates.split("\\s+")[1]);

            if(move == 'U'){
                try {
                    rabbitDen[r][c] = '.';

                    if(rabbitDen[r-1][c] != 'B'){
                        rabbitDen[r-1][c] = 'P';
                        int moveUP = r-1;
                        playerCoordinates = moveUP + " " + c;
                    }else{
                        player -= 1;
                        playerLastR = r-1;
                        playerLastL = c;
                    }

                }catch (Exception e){
                    player += 1;
                    playerLastR = r;
                    playerLastL = c;
                }
            }else if(move == 'D'){
                try {
                    rabbitDen[r][c] = '.';

                    if(rabbitDen[r+1][c] != 'B'){
                        rabbitDen[r+1][c] = 'P';
                        int moveDOWN = r+1;
                        playerCoordinates = moveDOWN + " " + c;
                    }else{
                        player -= 1;
                        playerLastR = r+1;
                        playerLastL = c;
                    }

                }catch (Exception e){
                    player += 1;
                    playerLastR = r;
                    playerLastL = c;
                }
            }else if(move == 'L'){
                try {
                    rabbitDen[r][c] = '.';

                    if(rabbitDen[r][c-1] != 'B'){
                        rabbitDen[r][c-1] = 'P';
                        int moveLeft = c-1;
                        playerCoordinates = r + " " + moveLeft;
                    }else{
                        player -= 1;
                        playerLastR = r;
                        playerLastL = c-1;
                    }
                }catch (Exception e){
                    player += 1;
                    playerLastR = r;
                    playerLastL = c;
                }
            }else if(move == 'R'){
                try {
                    rabbitDen[r][c] = '.';

                    if(rabbitDen[r][c+1] != 'B'){
                        rabbitDen[r][c+1] = 'P';
                        int moveRight = c+1;
                        playerCoordinates = r + " " + moveRight;
                    }else{
                        player -= 1;
                        playerLastR = r;
                        playerLastL = c+1;
                    }
                }catch (Exception e){
                    player += 1;
                    playerLastR = r;
                    playerLastL = c;
                }
            }

            // Determine the indexes
            ArrayDeque<String> indexes = new ArrayDeque<>();
            for (int i = 0; i < rabbitDen.length; i++) {
                for (int j = 0; j < rabbitDen[i].length; j++) {
                    if(rabbitDen[i][j] == 'B'){
                        indexes.offer(i + " " + j);
                    }
                }
            }

            // Determine the outcome based on the provided indexes
            while(!indexes.isEmpty()){
                String[] indexesForMultiply = indexes.poll().split("\\s+");

                int rr = Integer.parseInt(indexesForMultiply[0]);
                int cc = Integer.parseInt(indexesForMultiply[1]);

                if(isValid(rr-1, cc, rabbitDen)){
                    if(rabbitDen[rr-1][cc] == 'P'){
                        player -= 1;
                        playerLastR = rr-1;
                        playerLastL = cc;
                    }

                    rabbitDen[rr-1][cc] = 'B';
                }

                if(isValid(rr+1, cc, rabbitDen)){
                    if(rabbitDen[rr+1][cc] == 'P'){
                        player -= 1;
                        playerLastR = rr+1;
                        playerLastL = cc;
                    }

                    rabbitDen[rr+1][cc] = 'B';
                }

                if(isValid(rr, cc-1, rabbitDen)){
                    if(rabbitDen[rr][cc-1] == 'P'){
                        player -= 1;
                        playerLastR = rr;
                        playerLastL = cc-1;
                    }

                    rabbitDen[rr][cc-1] = 'B';
                }
                if(isValid(rr, cc+1, rabbitDen)){
                    if(rabbitDen[rr][cc+1] == 'P'){
                        player -= 1;
                        playerLastR = rr;
                        playerLastL = cc+1;
                    }

                    rabbitDen[rr][cc+1] = 'B';
                }
            }
        }

        // Print result
        for (int i = 0; i < rabbitDen.length; i++) {
            for (int j = 0; j < rabbitDen[i].length; j++) {
                System.out.print(rabbitDen[i][j]);
            }

            System.out.println();
        }

        if (player == 2){
            System.out.printf("won: %d %d%n", playerLastR, playerLastL);
        }else if(player == 0){
            System.out.printf("dead: %d %d%n", playerLastR, playerLastL);
        }

        scan.close();
    }

    // Method that checks if the given index is valid
    private static boolean isValid(int rr, int cc, char[][] rabbitDen) {
        return (rr >= 0 && rr < rabbitDen.length && cc >= 0 && cc < rabbitDen[rr].length);
    }
}
