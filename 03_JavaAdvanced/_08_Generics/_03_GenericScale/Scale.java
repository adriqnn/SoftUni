package _03_JavaAdvanced._08_Generics._03_GenericScale;

public class Scale<T extends Comparable<T>> {
    public final T left;
    public final T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        int compared = this.left.compareTo(this.right);

        if (compared > 0){
            return this.left;
        }else if (compared < 0){
            return this.right;
        }

        return null;
    }
}
