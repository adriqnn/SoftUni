package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ParkingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split("\\s+");
        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[1]);
        boolean[][] parkingLot = new boolean[row][col];
        Arrays.stream(parkingLot).forEach(e -> Arrays.fill(e,true));
        String console = scan.nextLine();
        while(!console.equals("stop")){
            String[] entryLine = console.split("\\s+");
            int entry = Integer.parseInt(entryLine[0]);
            int rowPark = Integer.parseInt(entryLine[1]);
            int colPark = Integer.parseInt(entryLine[2]);
            int countMoves = Math.abs(entry - rowPark) + 1;
            if(parkingLot[rowPark][colPark] && colPark != 0){
                parkingLot[rowPark][colPark] = false;
                countMoves += colPark;
                System.out.println(countMoves);
                console = scan.nextLine();
                continue;
            }
            int toRight = colPark + 1;
            int toLeft = colPark - 1;
            boolean noParkingSpots = true;
            while(toLeft > 0 || toRight < parkingLot[rowPark].length){
                if((isValidLeft(rowPark,toLeft,parkingLot) && parkingLot[rowPark][toLeft]) && (isValidRight(rowPark,toRight,parkingLot) && parkingLot[rowPark][toRight])){
                    parkingLot[rowPark][toLeft] = false;
                    noParkingSpots = false;
                    countMoves += toLeft;
                    System.out.println(countMoves);
                    break;
                }else if(!(isValidLeft(rowPark,toLeft,parkingLot) && parkingLot[rowPark][toLeft]) && (isValidRight(rowPark,toRight,parkingLot) && parkingLot[rowPark][toRight])){
                    parkingLot[rowPark][toRight] = false;
                    noParkingSpots = false;
                    countMoves += toRight;
                    System.out.println(countMoves);
                    break;
                }else if((isValidLeft(rowPark,toLeft,parkingLot) && parkingLot[rowPark][toLeft]) && !(isValidRight(rowPark,toRight,parkingLot) && parkingLot[rowPark][toRight])){
                    parkingLot[rowPark][toLeft] = false;
                    noParkingSpots = false;
                    countMoves += toLeft;
                    System.out.println(countMoves);
                    break;
                }
                toLeft--;
                toRight++;
            }
            if(noParkingSpots){
                System.out.printf("Row %d full%n",rowPark);
            }
            console = scan.nextLine();
        }
    }
    private static boolean isValidLeft(int rowPark, int col, boolean[][] parkingLot) {
        return (rowPark >= 0 && rowPark < parkingLot.length && col >= 1);
    }
    private static boolean isValidRight(int rowPark, int col, boolean[][] parkingLot) {
        return (rowPark >= 0 && rowPark < parkingLot.length && col < parkingLot[rowPark].length);
    }
}
