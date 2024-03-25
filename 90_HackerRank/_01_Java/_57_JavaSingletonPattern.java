package _05_HackerRank._01_Java;

public class _57_JavaSingletonPattern {
    public static void main(String[] args) {
    }
}

class Singleton{
    private static Singleton instance = null;
    public String str;
    private Singleton(){}
    public static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}