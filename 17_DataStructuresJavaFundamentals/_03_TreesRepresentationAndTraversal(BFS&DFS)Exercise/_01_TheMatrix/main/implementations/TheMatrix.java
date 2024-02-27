package implementations;

import java.util.ArrayDeque;
import java.util.Deque;

public class TheMatrix {
    private char[][] matrix;
    private char fillChar;
    private char toBeReplaced;
    private int startRow;
    private int startCol;

    public TheMatrix(char[][] matrix, char fillChar, int startRow, int startCol) {
        this.matrix = matrix;
        this.fillChar = fillChar;
        this.startRow = startRow;
        this.startCol = startCol;
        this.toBeReplaced = this.matrix[this.startRow][this.startCol];
    }

    public void solveDFS() {
        Deque<int[]> coordinates = new ArrayDeque<>();
        coordinates.push(new int[]{startRow, startCol});

        while(!coordinates.isEmpty()){
            int[] position = coordinates.pop();

            int row = position[0];
            int col = position[1];

            this.matrix[row][col] = this.fillChar;

            addCoordinatesStack(coordinates, row + 1, col);
            addCoordinatesStack(coordinates, row - 1, col);
            addCoordinatesStack(coordinates, row, col + 1);
            addCoordinatesStack(coordinates, row, col - 1);
        }
    }

    public void solveBFS() {
        Deque<int[]> coordinates = new ArrayDeque<>();
        coordinates.offer(new int[]{startRow, startCol});

        while(!coordinates.isEmpty()){
            int[] position = coordinates.poll();

            int row = position[0];
            int col = position[1];

            this.matrix[row][col] = this.fillChar;

            addCoordinatesQueue(coordinates, row + 1, col);
            addCoordinatesQueue(coordinates, row - 1, col);
            addCoordinatesQueue(coordinates, row, col + 1);
            addCoordinatesQueue(coordinates, row, col - 1);
        }
     }

    private void addCoordinatesStack(Deque<int[]> coordinates, int row, int col) {
        if(isInBounds(row, col) && this.matrix[row][col] == this.toBeReplaced){
            coordinates.push(new int[]{row, col});
        }
    }

    private void addCoordinatesQueue(Deque<int[]> coordinates, int row, int col) {
        if(isInBounds(row, col) && this.matrix[row][col] == this.toBeReplaced){
            coordinates.offer(new int[]{row, col});
        }
    }

    private boolean isInBounds(int row, int col) {
        return !isOutOfBounds(row, col);
    }

    //Recursion
    public void solve() {
        fillMatrix(this.startRow, this.startCol);
    }

    private void fillMatrix(int row, int col) {
        if(isOutOfBounds(row, col) || this.matrix[row][col] != this.toBeReplaced){
            return;
        }

        this.matrix[row][col] = this.fillChar;

        this.fillMatrix(row + 1, col);
        this.fillMatrix(row, col + 1);
        this.fillMatrix(row - 1, col);
        this.fillMatrix(row, col - 1);
    }

    private boolean isOutOfBounds(int row, int col) {
        return  row < 0 || row >= this.matrix.length || col < 0 || col >= this.matrix[row].length;
    }

    public String toOutputString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                builder.append(this.matrix[i][j]);
            }

            builder.append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}