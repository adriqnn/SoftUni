package _03_JavaAdvanced._12_WorkshopBasicAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class _03_SumOfCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String coinsLine = reader.readLine();
        
        LinkedHashMap<Integer, Integer> coinsUsage = new LinkedHashMap<>();
        int[] availableCoins = new int[6];
        int targetSum = 923;
        Map<Integer, Integer> selectedCoins = ChooseCoins(availableCoins, targetSum);

        Arrays.stream(coinsLine.replaceAll("Coins: ", "").split(", ")).map(Integer::parseInt).sorted((f, s) -> Integer.compare(s, f)).forEach((num) -> coinsUsage.put(num, 0));

        String[] line = reader.readLine().split(": ");
        int sum = Integer.parseInt(line[1]);
        int totalCount = 0;

        for (Integer coinValue : coinsUsage.keySet()) {
            int count = sum / coinValue;
            coinsUsage.replace(coinValue, count);

            totalCount += count;
            sum -= count * coinValue;
        }
        
        if (sum > 0) {
            System.out.println("Error");
            return;
        }

        System.out.println("Number of coins to take: " + totalCount);
        coinsUsage.entrySet().stream().filter((entry) -> entry.getValue() != 0).forEach((entry) -> System.out.println(entry.getValue() + " coin(s) with value " + entry.getKey()));

        reader.close();
    }

    private static Map<Integer, Integer> ChooseCoins(int[] availableCoins, int targetSum) {
        throw new IllegalArgumentException();
    }
}
