package _04_JavaOOP._05_Polymorphism._01_MathOperation;

public class MathOperation {
    public int add(int f,int s){
        return f+s;
    }
    public int add(int f,int s,int t){
        return add(add(f,s),t);
    }
    public int add(int f,int s,int t, int o){
        return add(add(f,s,t),o);
    }
}
