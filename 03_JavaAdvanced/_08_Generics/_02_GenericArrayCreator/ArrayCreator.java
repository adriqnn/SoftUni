package _03_JavaAdvanced._08_Generics._02_GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public static<T> T[] create(int length,T def){
        /*T[] arr = ((T[])new Object[length]);
        return arr;*/
        T[] arr = (T[]) Array.newInstance(def.getClass(), length);
        Arrays.fill(arr,def);
        return arr;
    }
    public static<T> T[] create(Class<T> clazz,int length,T def){
        T[] arr = (T[])Array.newInstance(clazz, length);
        Arrays.fill(arr,def);
        return arr;
    }
}
