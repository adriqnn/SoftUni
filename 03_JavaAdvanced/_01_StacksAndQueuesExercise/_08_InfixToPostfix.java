package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _08_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split(" ");
        Deque<String> tokensStack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") && !tokens[i].equals("(") && !tokens[i].equals(")")){
                System.out.print(tokens[i] + " ");
            }else{
                if(tokensStack.size() > 0){
                    if (tokens[i].equals("+")) {
                        if (tokensStack.peek().equals("+") || tokensStack.peek().equals("-")) {
                            System.out.print(tokensStack.pop() + " ");
                            tokensStack.push(tokens[i]);
                        } else if (tokensStack.peek().equals("*") || tokensStack.peek().equals("/") || tokensStack.peek().equals("(")) {
                            tokensStack.push(tokens[i]);
                        }else{
                            tokensStack.push(tokens[i]);
                        }
                    }else if (tokens[i].equals("-")) {
                        if(tokensStack.peek().equals("+") || tokensStack.peek().equals("-")) {
                            System.out.print(tokensStack.pop() + " ");
                            tokensStack.push(tokens[i]);
                        }else if(tokensStack.peek().equals("*") || tokensStack.peek().equals("/") || tokensStack.peek().equals("(")) {
                            tokensStack.push(tokens[i]);
                        }else {
                            tokensStack.push(tokens[i]);
                        }
                    }else if(tokens[i].equals("*")) {
                        if (tokensStack.peek().equals("*") || tokensStack.peek().equals("/")) {
                            System.out.print(tokensStack.pop() + " ");
                            tokensStack.push(tokens[i]);
                        } else {
                            tokensStack.push(tokens[i]);
                        }
                    }else if(tokens[i].equals("/")) {
                        if (tokensStack.peek().equals("*") || tokensStack.peek().equals("/")) {
                            System.out.print(tokensStack.pop() + " ");
                            tokensStack.push(tokens[i]);
                        } else {
                            tokensStack.push(tokens[i]);
                        }
                    }else if (tokens[i].equals("(")) {
                        tokensStack.push(tokens[i]);
                    }else if (tokens[i].equals(")")) {
                        if(tokensStack.contains("(")) {
                            while (!tokensStack.peek().equals("(")) {
                                System.out.print(tokensStack.pop() + " ");
                            }
                            tokensStack.pop();
                            if(tokensStack.contains("(")){
                                System.out.print(tokensStack.pop() + " ");
                            }
                        }
                    }
                }else{
                    if(!tokens[i].equals(")")){
                        tokensStack.push(tokens[i]);
                    }
                }
            }
        }
        while(!tokensStack.isEmpty()) {
            if(tokensStack.peek().equals("(")){
                tokensStack.pop();
            }else{
                System.out.print(tokensStack.pop() + " ");
            }
        }
    }
}
/*for (String element: stringArray) {
            newString += element;
        }
        char[] tokens = newString.toCharArray();
        for (int i = 0; i < tokens.length; i++) {
            if(Character.isLetterOrDigit(tokens[i])){
                System.out.print(tokens[i] + " ");
                continue;
            }
            if(characterStack.size() > 0) {
                if (tokens[i] == '+') {
                    if (characterStack.peek() == '+' || characterStack.peek() == '-') {
                        System.out.print(characterStack.pop() + " ");
                        characterStack.push(tokens[i]);
                    } else if (characterStack.peek() == '*' || characterStack.peek() == '/' || characterStack.peek() == '(' || characterStack.peek() == ')') {
                        characterStack.push(tokens[i]);
                    } else {
                        characterStack.push(tokens[i]);
                    }
                } else if (tokens[i] == '-') {
                    if (characterStack.peek() == '+' || characterStack.peek() == '-') {
                        System.out.print(characterStack.pop() + " ");
                        characterStack.push(tokens[i]);
                    } else if (characterStack.peek() == '*' || characterStack.peek() == '/' || characterStack.peek() == '(' || characterStack.peek() == ')') {
                        characterStack.push(tokens[i]);
                    } else {
                        characterStack.push(tokens[i]);
                    }
                } else if (tokens[i] == '*') {
                    if (characterStack.peek() == '*' || characterStack.peek() == '/' || characterStack.peek() == '(' || characterStack.peek() == ')') {
                        System.out.print(characterStack.pop() + " ");
                        characterStack.push(tokens[i]);
                    } else {
                        characterStack.push(tokens[i]);
                    }
                } else if (tokens[i] == '/') {
                    if (characterStack.peek() == '*' || characterStack.peek() == '/' || characterStack.peek() == '(' || characterStack.peek() == ')') {
                        System.out.print(characterStack.pop() + " ");
                        characterStack.push(tokens[i]);
                    } else {
                        characterStack.push(tokens[i]);
                    }
                } else if (tokens[i] == '(') {
                    characterStack.push(tokens[i]);
                } else if (tokens[i] == ')') {
                    while (characterStack.peek() != ('(')) {
                        System.out.print(characterStack.pop() + " ");
                    }
                    characterStack.pop();
                }
            }else{
                characterStack.push(tokens[i]);
            }
        }
        while(!characterStack.isEmpty()){
            System.out.print(characterStack.pop() + " ");
        }*/
