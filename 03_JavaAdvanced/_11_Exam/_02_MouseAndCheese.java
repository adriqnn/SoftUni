package _03_JavaAdvanced._11_Exam;

import java.util.Scanner;

public class _02_MouseAndCheese {
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
                if(territoryMatrix[i][j] == 'M'){
                    r = i;
                    c = j;
                }
            }
        }
        
        String command = scan.nextLine();
        boolean isOut = false;
        int cheeseEaten = 0;
        
        while(!command.equals("end")){
            territoryMatrix[r][c] = '-';
            
            if(command.equals("up")){
                if(isValid(r-1, c, territoryMatrix)){
                    r--;
                    
                    if(territoryMatrix[r][c] == 'c'){
                        cheeseEaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '-';
                        r--;
                        
                        if(territoryMatrix[r][c] == 'c') {
                            cheeseEaten++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("down")){
                if(isValid(r+1, c, territoryMatrix)){
                    r++;
                    
                    if(territoryMatrix[r][c] == 'c'){
                        cheeseEaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '-';
                        r++;
                        
                        if(territoryMatrix[r][c] == 'c') {
                            cheeseEaten++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("left")){
                if(isValid(r, c-1, territoryMatrix)){
                    c--;
                    
                    if(territoryMatrix[r][c] == 'c'){
                        cheeseEaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '-';
                        c--;
                        
                        if(territoryMatrix[r][c] == 'c') {
                            cheeseEaten++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }else if(command.equals("right")){
                if(isValid(r, c+1, territoryMatrix)){
                    c++;
                    
                    if(territoryMatrix[r][c] == 'c'){
                        cheeseEaten++;
                    }else if(territoryMatrix[r][c] == 'B'){
                        territoryMatrix[r][c] = '-';
                        c++;
                        
                        if(territoryMatrix[r][c] == 'c') {
                            cheeseEaten++;
                        }
                    }
                }else{
                    isOut = true;
                }
            }
            
            if(isOut){
                break;
            }
            
            territoryMatrix[r][c] = 'M';
            command = scan.nextLine();
        }
        
        if(isOut){
            System.out.println("Where is the mouse?");
        }
        
        if(cheeseEaten < 5){
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheeseEaten);
        }else{
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseEaten);
        }
        
        for (int i = 0; i < territoryMatrix.length; i++) {
            for (int j = 0; j < territoryMatrix[i].length; j++) {
                System.out.print(territoryMatrix[i][j]);
            }
            
            System.out.println();
        }
        
        scan.close();
    }
    
    public static boolean isValid(int r, int c, char[][] matrix){
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
