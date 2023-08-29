package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String type = scan.nextLine();

        // Create methods for each possible input and print result
        if (type.equals("int")){
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            
            System.out.println(whatIsBigger(num1,num2));
        }else if (type.equals("char")){
            char one = scan.nextLine().charAt(0);
            char two = scan.nextLine().charAt(0);
            
            System.out.println(whatIsBigger(one,two));
        }else if (type.equals("string")){
            String first = scan.nextLine();
            String second = scan.nextLine();
            
            System.out.println(whatIsBigger(first,second));
        }
        
        scan.close();
    }

    private static int whatIsBigger(int num1, int num2) {
        return Math.max(num1,num2);
    }
    
    private static char whatIsBigger(char one, char two){
        return ((char) (Math.max(one,two)));
    }
    
    private static String whatIsBigger(String first,String second){
        if (first.compareTo(second) >= 0){
            return first;
        }else {
            return second;
        }
    }
}
