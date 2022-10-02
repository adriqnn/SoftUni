package _04_JavaOOP._03_Inheritance._04_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement(){
        int end = super.size();
        Random rnd = new Random();
        int randIndex = rnd.nextInt(end);
        return remove(randIndex);
    }
}

