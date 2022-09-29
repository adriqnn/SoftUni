package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = scan.nextLine();
        String currentURL = null;
        while(!navigation.equals("Home")){
            if(navigation.equals("back")){
                if(history.isEmpty()){
                    System.out.println("no previous URLs");
                    navigation = scan.nextLine();
                    continue;
                }else{
                    currentURL = history.pop();
                }
            }else{
                if(currentURL != null){
                    history.push(currentURL);
                }
                currentURL = navigation;
            }
            System.out.println(currentURL);
            navigation = scan.nextLine();
        }
    }
}
