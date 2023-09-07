package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        String navigation = scan.nextLine();
        
        // Add variables
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentURL = null;
        
        // Create browser history
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
            
            // Print Result
            System.out.println(currentURL);
            
            navigation = scan.nextLine();
        }
        
        scan.close();
    }
}
