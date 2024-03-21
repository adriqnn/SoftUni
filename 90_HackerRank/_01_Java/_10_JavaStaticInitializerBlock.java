package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _10_JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        try{
            if(n1 <= 0 || n2 <= 0){
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
            return;
        }

        int area = n1* n2;
        System.out.println(area);

        scan.close();
    }
}

//public class Solution {
//
//    static Scanner scan = new Scanner(System.in);
//    static int B = scan.nextInt();
//    static int H = scan.nextInt();
//    static boolean flag = true;
//    static{
//        try{
//            if(B <= 0 || H <= 0){
//                flag = false;
//                throw new Exception("Breadth and height must be positive");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
//
//    }
//    public static void main(String[] args){
//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }
//
//    }//end of main
//
//}//end of class

