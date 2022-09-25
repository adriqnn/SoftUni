package _01_Programming_Basics._04_LoopsPartOneExercise;

public class _01_NumberEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 1000; i++) {

            if (i%10 == 7){
                System.out.println(i);
            }
        }
    }
}
