package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _03_BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        String bestPlayer = "";
        int max = Integer.MIN_VALUE;
        while(!console.equals("END")){
            int score = Integer.parseInt(scan.nextLine());
            if (score>max){
                max = score;
                bestPlayer = console;
                if (score>=10){
                    break;
                }
            }
            console = scan.nextLine();
        }
        if(max>=10){
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else if(max>=3){
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else{
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals.",max);
        }
    }
}
