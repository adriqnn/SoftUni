package _05_HackerRank._01_Java;

import java.util.*;

public class _49_JavaIteratorV2 {
    static Iterator func(ArrayList list){
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)
                break;
        }
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }

        list.add("###");
        for(int i = 0; i < m; i++){
            list.add(scan.next());
        }

        Iterator it = func(list);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
