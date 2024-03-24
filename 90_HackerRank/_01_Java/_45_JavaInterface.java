package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _45_JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        scan.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}