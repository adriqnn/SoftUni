package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String input = "";
        while(!"Home".equals(input = scan.nextLine())){
            if(input.equals("back")){
                if(history.size() > 1){
                    forward.push(history.pop());
                    System.out.println(history.peek());
                }else{
                    System.out.println("no previous URLs");
                }
                continue;
            }
            if(input.equals("forward")){
                if(forward.size() > 0){
                    history.push(forward.pop());
                    System.out.println(history.peek());
                    continue;
                }else{
                    System.out.println("no next URLs");
                }
                continue;
            }
            System.out.println(input);
            history.push(input);
            forward.clear();
        }
    }
}
