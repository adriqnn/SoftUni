package _05_HackerRank._01_Java;

import java.math.BigDecimal;
import java.util.*;

public class _25_JavaBigDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> bigDecimals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String number = scan.nextLine();
            bigDecimals.add(number);
        }

        bigDecimals.sort(Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal n1 = new BigDecimal(o1);
                BigDecimal n2 = new BigDecimal(o2);
                return n1.compareTo(n2);
            }
        }));

        for (String number : bigDecimals){
            System.out.println(number);
        }

        scan.close();
    }
}
