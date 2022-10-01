package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.*;
import java.util.stream.Collectors;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> mmStack = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ffQueue = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> mStack = new ArrayDeque<>();
        Deque<Integer> fQueue = new ArrayDeque<>();
        mmStack.stream().filter(e -> e > 0).forEach(mStack::push);
        ffQueue.stream().filter(e -> e > 0).forEach(fQueue::offer);
        int matches = 0;
        while (!mStack.isEmpty() && !fQueue.isEmpty()){
            int m = mStack.peek();
            int f = fQueue.peek();
            while (m % 25 == 0 && mStack.size() > 2){
                mStack.pop();
                mStack.pop();
                m = mStack.peek();
            }
            if(m % 25 == 0){
                mStack.clear();
                m = -1;
            }
            while(f % 25 == 0 && fQueue.size() > 2){
                fQueue.poll();
                fQueue.poll();
                f = fQueue.peek();
            }
            if(f % 25 == 0){
                fQueue.clear();
                f = -1;
            }
            if(m != -1 && f != -1){
                if(m != f){
                    m = mStack.pop()-2;
                    fQueue.poll();
                    if(m > 0){
                        mStack.push(m);
                    }
                }else{
                    matches++;
                    mStack.pop();
                    fQueue.poll();
                }
            }
        }
        System.out.println("Matches: " + matches);
        if(mStack.isEmpty()){
            System.out.print("Males left: none");
        }else{
            System.out.print("Males left: ");
            System.out.print(mStack.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        System.out.println();
        if (fQueue.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            System.out.print(fQueue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }
}
