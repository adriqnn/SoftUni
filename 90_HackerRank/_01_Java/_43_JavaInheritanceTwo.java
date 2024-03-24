package _05_HackerRank._01_Java;

public class _43_JavaInheritanceTwo {
    public static void main(String []args){
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

class Arithmetic{
    public int add(int one, int two){
        return one + two;
    }
}

class Adder extends Arithmetic{
    @Override
    public int add(int one, int two) {
        return super.add(one, two);
    }
}


