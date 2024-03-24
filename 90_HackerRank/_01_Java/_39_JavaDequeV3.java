package _05_HackerRank._01_Java;

import java.util.*;

public class _39_JavaDequeV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max_count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size() == m){
                if(max_count < set.size()){
                    max_count = set.size();
                }
                
                int remove_val = deque.pollFirst();
                if(!deque.contains(remove_val)){
                    set.remove((remove_val));
                }
            }
        }
        
        System.out.println(max_count);

        scan.close();
    }
}
