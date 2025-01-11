package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

public class _01_RectangleOf10x10Stars {
    public static void main(String[] args) {
        // Print a square 10x10 of stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
