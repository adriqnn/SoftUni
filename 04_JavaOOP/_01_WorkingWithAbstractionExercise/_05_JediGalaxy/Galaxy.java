package _04_JavaOOP._01_WorkingWithAbstractionExercise._05_JediGalaxy;

public class Galaxy {
    private Field field;

    public Galaxy(Field field){
        this.field = field;
    }

    public void moveEvil(int row, int col){
        while(row >= 0 && col >= 0){
            if(this.field.isInBounds(row, col)){
                this.field.setValue(row, col, 0);
            }
            
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col){
        return JediMovement.move(row, col, this.field);
    }
}
