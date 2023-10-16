package _04_JavaOOP._01_WorkingWithAbstractionExercise._05_JediGalaxy;

public class Field {
    private  int[][] matrix;

    public Field(int rows, int cols, int beginValue) {
        this.matrix = new int [rows][cols];
        this.fillValues(beginValue);
    }

    public Field(int rows, int cols) {
        this(rows, cols, 0);
    }

    private void fillValues(int beginValue){
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = beginValue++;
            }
        }
    }

    public boolean isInBounds(int row, int col){
        return row >= 0 && col >= 0 && row < this.matrix.length && col < this.matrix[row].length;
    }

    public void setValue(int row, int col, int newValue){
        this.matrix[row][col] = newValue;
    }

    public int getValue(int row, int col){
        return  this.matrix[row][col];
    }

    public int getColLength(int row){
        return this.matrix[row].length;
    }
}
