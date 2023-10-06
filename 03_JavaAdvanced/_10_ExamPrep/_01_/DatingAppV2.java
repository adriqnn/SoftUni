package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.*;
import java.util.stream.Collectors;

public class DatingAppV2 {
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
            int m = mStack.pop();

            while(m <= 0 && !mStack.isEmpty()){
                m = mStack.pop();
            }

            while(m % 25 == 0 && mStack.size() >= 2){
                mStack.pop();
                m = mStack.pop();
            }

            if(m % 25 == 0 && mStack.size() == 1){
                mStack.clear();
                m = 0;
            }

            int f = fQueue.poll();
            while(f <= 0 && !fQueue.isEmpty()){
                f = fQueue.poll();
            }

            while(f % 25 == 0 && fQueue.size() >= 2){
                fQueue.poll();
                f = fQueue.poll();
            }

            if(f % 25 == 0 && fQueue.size() == 1){
                mStack.clear();
                f = 0;
            }

            if(m > 0 && f > 0 && m % 25 != 0 && f % 25 != 0) {
                if (m != f) {
                    mStack.push(m - 2);
                } else {
                    matches++;
                }
            }else{
                if(m > 0 && m % 25 != 0){
                    mStack.push(m);
                }

                if(f > 0 && f % 25 != 0){
                    fQueue.push(f);
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
        
        scan.close();
    }
}
