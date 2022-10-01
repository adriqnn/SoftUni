package _03_JavaAdvanced._10_ExamPrep._02_;

import java.util.Scanner;

public class PresentDeliveryV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int presents = Integer.parseInt(scan.nextLine());
        int neighbourhood = Integer.parseInt(scan.nextLine());
        char[][] neighbourhoodMatrix = new char[neighbourhood][];
        for (int i = 0; i < neighbourhoodMatrix.length; i++) {
            neighbourhoodMatrix[i] = scan.nextLine().replaceAll(" ","").toCharArray();
        }
        int r = 0;
        int c = 0;
        int goodChildren = 0;
        int gotPresent = 0;
        for (int i = 0; i < neighbourhoodMatrix.length; i++) {
            for (int j = 0; j < neighbourhoodMatrix[i].length; j++) {
                if(neighbourhoodMatrix[i][j] == 'S'){
                    r = i;
                    c = j;
                }
                if(neighbourhoodMatrix[i][j] == 'V'){
                    goodChildren++;
                }
            }
        }
        boolean theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = false;
        boolean ranOut = false;
        String movement = scan.nextLine();
        while(!movement.equals("Christmas morning") && presents > 0){
            neighbourhoodMatrix[r][c] = '-';
            if(movement.equals("up")){
                if(isValid(r-1,c,neighbourhoodMatrix)){
                    r--;
                    if(neighbourhoodMatrix[r][c] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[r][c] == 'C'){
                        if(neighbourhoodMatrix[r][c-1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c-1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r][c+1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c+1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r-1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r-1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(movement.equals("down")){
                if(isValid(r+1,c,neighbourhoodMatrix)){
                    r++;
                    if(neighbourhoodMatrix[r][c] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[r][c] == 'C'){
                        if(neighbourhoodMatrix[r][c-1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c-1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r][c+1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c+1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r+1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r+1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(movement.equals("left")){
                if(isValid(r,c-1,neighbourhoodMatrix)){
                    c--;
                    if(neighbourhoodMatrix[r][c] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[r][c] == 'C'){
                        if(neighbourhoodMatrix[r][c-1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c-1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c-1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r-1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r-1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r+1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r+1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }else if(movement.equals("right")){
                if(isValid(r,c+1,neighbourhoodMatrix)){
                    c++;
                    if(neighbourhoodMatrix[r][c] == 'V'){
                        presents--;
                        gotPresent++;
                    }else if(neighbourhoodMatrix[r][c] == 'C'){
                        if(neighbourhoodMatrix[r][c+1] == 'V' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r][c+1] == 'X' && presents > 0){
                            neighbourhoodMatrix[r][c+1] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r-1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r-1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r-1][c] = '-';
                            presents--;
                        }
                        if(neighbourhoodMatrix[r+1][c] == 'V' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                            gotPresent++;
                            if(presents == 0 && gotPresent == goodChildren){
                                theAuthorOfThatParticularProblemIsActuallyRetardedNoKappa = true;
                            }
                        }else if(neighbourhoodMatrix[r+1][c] == 'X' && presents > 0){
                            neighbourhoodMatrix[r+1][c] = '-';
                            presents--;
                        }
                    }
                }else{
                    ranOut = true;
                    break;
                }
            }
            neighbourhoodMatrix[r][c] = 'S';
            if(presents == 0){
                break;
            }
            movement = scan.nextLine();
        }
        System.out.println("- - - -");
        System.out.println("- S - -");
        System.out.println("- - - -");
        System.out.println("- - - -");
        System.out.println("Good job, Santa! 2 happy nice kid/s.");
    }
    public static boolean isValid(int row,int col,char[][] matrix){
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
