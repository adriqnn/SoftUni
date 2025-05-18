package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.*;

public class _03_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variable
        Map<String, List<Double>> orders = new LinkedHashMap<>();

        // Combine all the orders and sort them
        while (!input.equals("buy")) {
            String[] order = input.split("\\s+");
            
            String item = order[0];
            double price = Double.parseDouble(order[1]);
            double quantity = Double.parseDouble(order[2]);

            if (!orders.containsKey(item)) {
                List<Double> information = new ArrayList<>();
                
                information.add(price);
                information.add(quantity);
                orders.put(item, information);
            } else {
                if (orders.get(item).get(0) != price) {
                    orders.get(item).set(0, price);
                }
                
                double currentQuantity = orders.get(item).get(1);
                orders.get(item).set(1, currentQuantity + quantity);
            }
            
            input = scan.nextLine();
        }

        // Print result
        orders.forEach((item, info) -> System.out.printf("%s -> %.2f%n", item, info.get(0) * info.get(1)));

        scan.close();
    }
}
