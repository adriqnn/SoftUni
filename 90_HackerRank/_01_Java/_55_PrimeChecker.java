package _05_HackerRank._01_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class _55_PrimeChecker {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);

            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();

            boolean overload = false;
            for(int i = 0; i < methods.length; i++) {
                if(set.contains(methods[i].getName())){
                    overload = true;
                    break;
                }
                
                set.add(methods[i].getName());
            }

            if(overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch(Exception e){
            System.out.println(e);
        }
        
        br.close();
    }
}

class Prime{
    public void checkPrime(int... a){
        for (int of : a) {
            if(isPrime(of)){
                System.out.printf("%d ", of);
            }
        }
        
        System.out.println();
    }

    public boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        
        return true;
    }
}
