package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String console = scan.nextLine();
        boolean areBalanced = false;
        for (int i = 0; i < console.length(); i++) {
            char currentBracket = console.charAt(i);
            if(currentBracket == '(' || currentBracket == '{' || currentBracket =='['){
                stack.push(currentBracket);
            }else if(currentBracket == ')' || currentBracket == ']' || currentBracket == '}'){
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char lastOpen = stack.pop();
                if(lastOpen == '(' && currentBracket == ')'){
                    areBalanced = true;
                }else if(lastOpen == '{' || currentBracket == '}'){
                    areBalanced = true;
                }else if(lastOpen == '[' && currentBracket == ']'){
                    areBalanced = true;
                }else{
                    areBalanced = false;
                    break;
                }
            }
        }
        if(areBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
