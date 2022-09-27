package _02_ProgrammingFundamentals._05_Lists._03_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_DrumSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyToSpend = Double.parseDouble(scan.nextLine());
        List<Integer> drumsBaseQuality = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumsActualQualityNow = new ArrayList<>(drumsBaseQuality);
        String commands = scan.nextLine();

        while(!commands.equals("Hit it again, Gabsy!")){
            int hitPower = Integer.parseInt(commands);
            for (int i = 0; i < drumsActualQualityNow.size(); i++) {
                drumsActualQualityNow.set(i,(drumsActualQualityNow.get(i) - hitPower));
            }
            for (int i = 0; i < drumsActualQualityNow.size(); i++) {
                if(drumsActualQualityNow.get(i) <= 0){
                    if(moneyToSpend - (drumsBaseQuality.get(i)*3) >= 0){
                        drumsActualQualityNow.set(i,drumsBaseQuality.get(i));
                        moneyToSpend -= drumsBaseQuality.get(i)*3;
                    }else{
                        drumsBaseQuality.remove(i);
                        drumsActualQualityNow.remove(i);
                    }
                }
            }
            commands = scan.nextLine();
        }
        drumsActualQualityNow.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",moneyToSpend);
    }
}
