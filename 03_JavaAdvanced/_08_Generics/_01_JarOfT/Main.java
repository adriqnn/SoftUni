package _03_JavaAdvanced._08_Generics._01_JarOfT;

public class Main {
    public static void main(String[] args) {
        // Test Jar
        Jar<Integer> integerJar = new Jar<>();
        Jar<String> stringJar = new Jar<>();
        
        integerJar.add(13);
        stringJar.add("yep");
    }
}
