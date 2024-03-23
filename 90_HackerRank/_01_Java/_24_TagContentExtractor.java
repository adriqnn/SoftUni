package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _24_TagContentExtractor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "(?<grp1><(?<grp2>(.+))>)(\\1)?(?<string>([^<>]+))(?<grp3><\\/(\\2)>)(\\5)?";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            Matcher matcher = pattern.matcher(console);
            List<String> strings = new ArrayList<>();
            int count = 0;

            while(matcher.find()){
                System.out.println(matcher.group("string"));
                count++;
            }

            if (count == 0){
                System.out.println("None");
            }
        }

        scan.close();
    }
}
