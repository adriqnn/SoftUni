package _04_JavaOOP._01_WorkingWithAbstractionExercise._06_GreedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scan.nextLine());
        String[] itemsString = scan.nextLine().split("\\s+");

        ValuablesBag valuables = new ValuablesBag(bagCapacity);

        for (int i = 0; i < itemsString.length; i += 2) {
            String nameOf = itemsString[i];
            long value = Long.parseLong(itemsString[i+1]);

            if(itemsString[i].equalsIgnoreCase("GOLD")){
                Gold gold = new Gold(value);
                valuables.addGold(gold);
            }else if(itemsString[i].toUpperCase().endsWith("GEM") && itemsString[i].length() > 3){
                Gem gem = new Gem(nameOf, value);
                valuables.addGems(gem);
            }else if(itemsString[i].length() == 3){
                Cash cash = new Cash(nameOf, value);
                valuables.addCash(cash);
            }else{
                continue;
            }
        }

        System.out.println(valuables.printValuablesBag());

        scan.close();
    }
}
