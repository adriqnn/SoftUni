package _05_HackerRank._01_Java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class _53_JavaReflection {
    public static void main(String[] args) {
        Class St = St.class;
        Method[] methods = St.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}

class St{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void anothermethod(){}
}
