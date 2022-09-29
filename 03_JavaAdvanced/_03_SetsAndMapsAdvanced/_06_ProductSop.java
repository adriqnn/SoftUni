package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_ProductSop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Map<String,Double>> shopsWithPrices = new TreeMap<>();
        while(!input.equals("Revision")){
            String[] params = input.split(", ");
            String shop = params[0];
            String product = params[1];
            double price = Double.parseDouble(params[2]);
            shopsWithPrices.putIfAbsent(shop,new LinkedHashMap<>());
            Map<String,Double> productsAndPrices = shopsWithPrices.get(shop);
            productsAndPrices.put(product,price);
            input = scan.nextLine();
        }
        for (String shop : shopsWithPrices.keySet()) {
            System.out.println(shop + "->");
            for (var entry : shopsWithPrices.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
