package _01_Programming_Basics._04_LoopsPartOne;

import java.util.Scanner;

public class _06_VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++){
            char symbol = text.charAt(i);

            switch (symbol){
                case 'a':{
                    sum+=1;
                }
                break;
                case 'e':{
                    sum+=2;
                }
                break;
                case 'i':{
                    sum+=3;
                }
                break;
                case 'o':{
                    sum+=4;
                }
                break;
                case'u':{
                    sum+=5;
                }
                break;
            }

            if (symbol == 'a');

        }
        System.out.println(sum);
    }
}
