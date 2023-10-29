package _04_JavaOOP._06_SOLIDExercise.interfaces;

public interface File {
    int getSize();
    
    boolean write(String text);
    
    void append(String text);
}
