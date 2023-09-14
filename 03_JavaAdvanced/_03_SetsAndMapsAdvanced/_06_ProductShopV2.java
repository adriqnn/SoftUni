package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_ProductShopV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add variable
        Map<String, Map<String, Double>> shopsWithPrices = new TreeMap<>();

        // Food shop information
        String input;
        while (!(input = scan.nextLine()).equals("Revision")) {
            String[] params = input.split(", ");

            String shop = params[0];
            String product = params[1];
            double price = Double.parseDouble(params[2]);

            shopsWithPrices.putIfAbsent(shop, new LinkedHashMap<>());
            Map<String, Double> productsAndPrices = shopsWithPrices.get(shop);

            productsAndPrices.put(product, price);
        }

        // Print result
        shopsWithPrices.forEach((shop, productsAndPrices) -> {
            System.out.println(shop + "->");
            productsAndPrices.forEach((product, price) ->
                    System.out.printf("Product: %s, Price: %.1f%n", product, price)
            );
        });

        scan.close();
    }
}
