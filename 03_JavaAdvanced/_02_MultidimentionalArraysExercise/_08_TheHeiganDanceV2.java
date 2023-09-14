package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _08_TheHeiganDanceV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        double dmg = Double.parseDouble(scan.nextLine());
        
        // Add variables
        int[][] room = new int[15][15];
        String position = "7 7";
        double raidHP = 18500;
        double bossHP = 3000000;
        int dot = 0;
        String finalSpell = "";
        
        // Boss tactic
        while(raidHP > 0 & bossHP > 0){
            String console = scan.nextLine();
            
            bossHP -= dmg;
            
            if (dot > 0){
                raidHP -= 3500;
                
                if(raidHP <= 0){
                    finalSpell = "Plague Cloud";
                }
                
                dot -= 1;
                
            }
            
            if (bossHP <= 0 || raidHP <= 0){
                continue;
            }
            
            String[] actions = console.split("\\s+");
            
            String spell = actions[0];
            int r = Integer.parseInt(actions[1]);
            int c = Integer.parseInt(actions[2]);
            int rr = Integer.parseInt(position.split("\\s+")[0]);
            int cc = Integer.parseInt(position.split("\\s+")[1]);
            
            if(spell.equals("Cloud")){
                room = damageIndexes(r, c, room);
                String newPosition = move(position, room);
                
                if(newPosition.equals(position) && room[rr][cc] == -1){
                    raidHP -= 3500;
                    
                    if(raidHP <= 0){
                        finalSpell = "Plague Cloud";
                    }
                    
                    dot = 1;
                    
                }else{
                    position = newPosition;
                }
                
            }else if (spell.equals("Eruption")){
                room = damageIndexes(r, c, room);
                String newPosition = move(position, room);
                
                if(newPosition.equals(position) && room[rr][cc] == -1){
                    raidHP -= 6000;
                    
                    if(raidHP <= 0){
                        finalSpell = "Eruption";
                    }
                    
                }else{
                    position = newPosition;
                }
            }
            
            room = new int[15][15];
        }

        // Print result
        if(bossHP > 0) {
            System.out.printf("Heigan: %.2f%n", bossHP);
        }else{
            System.out.println("Heigan: Defeated!");
        }

        if(raidHP > 0) {
            System.out.printf("Player: %.0f%n", raidHP);
        }else{
            System.out.printf("Player: Killed by %s%n", finalSpell);
        }

        System.out.printf("Final position: %s, %s%n", position.split("\\s+")[0], position.split("\\s+")[1]);

        scan.close();
    }

    // Method that moves the raid
    private static String move(String position, int[][] room) {
        String[] positionArray = position.split("\\s+");
        int row = Integer.parseInt(positionArray[0]);
        int col = Integer.parseInt(positionArray[1]);

        if (isValidIndex(row-1,col,room) && room[row-1][col] != -1 && room[row][col] == -1){
            int thisUp = row-1;
            return thisUp + " " + col;
        }

        if (isValidIndex(row,col+1,room) && room[row][col+1] != -1 && room[row][col] == -1){
            int thisRight = col+1;
            return row + " " + thisRight;
        }

        if (isValidIndex(row+1,col,room) && room[row+1][col] != -1 && room[row][col] == -1){
            int thisDown = row+1;
            return thisDown + " " + col;
        }

        if (isValidIndex(row,col-1,room) && room[row][col-1] != -1 && room[row][col] == -1){
            int thisLeft = col-1;
            return row + " " + thisLeft;
        }

        return row + " " + col;
    }

    // Method that determines if the checked index is valid
    private static boolean isValidIndex(int row, int col, int[][] room) {
        return row >= 0 && row < room.length && col >= 0 && col < room[row].length;
    }

    // Method that determines if the index is damaging
    private static int[][] damageIndexes(int r, int c, int[][] room) {
        if (isValidIndex(r, c, room)){
            room[r][c] = -1;
        }

        if (isValidIndex(r, c-1, room)){
            room[r][c-1] = -1;
        }

        if (isValidIndex(r, c+1, room)){
            room[r][c+1] = -1;
        }

        if (isValidIndex(r-1, c-1, room)){
            room[r-1][c-1] = -1;
        }

        if (isValidIndex(r-1, c, room)){
            room[r-1][c] = -1;
        }

        if (isValidIndex(r-1, c+1, room)){
            room[r-1][c+1] = -1;
        }

        if (isValidIndex(r+1, c-1, room)){
            room[r+1][c-1] = -1;
        }

        if (isValidIndex(r+1, c, room)){
            room[r+1][c] = -1;
        }

        if (isValidIndex(r+1, c+1, room)){
            room[r+1][c+1] = -1;
        }

        return room;
    }
}

