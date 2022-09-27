package _02_ProgrammingFundamentals._05_Lists._03_MoreExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_MixedUpLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersListOne = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersListTwo = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] numbers = new int[2];
        if(numbersListOne.size() > numbersListTwo.size()){
            numbers[0] = numbersListOne.get(numbersListOne.size()-1);
            numbers[1] = numbersListOne.get(numbersListOne.size()-2);
            numbersListOne.remove(numbersListOne.size()-1);
            numbersListOne.remove(numbersListOne.size()-1);
        }else{
            numbers[0] = numbersListTwo.get(0);
            numbers[1] = numbersListTwo.get(1);
            numbersListTwo.remove(0);
            numbersListTwo.remove(1);
        }
        numbersListOne.addAll(numbersListTwo);
        numbersListTwo.clear();
        Arrays.sort(numbers);
        for (int i = 0; i < numbersListOne.size(); i++) {
            if(numbersListOne.get(i) > numbers[0] && numbersListOne.get(i) < numbers[1]){
                numbersListTwo.add(numbersListOne.get(i));
            }
        }
        Collections.sort(numbersListTwo);
        numbersListTwo.stream().forEach(e -> System.out.print(e + " "));
    }
}
