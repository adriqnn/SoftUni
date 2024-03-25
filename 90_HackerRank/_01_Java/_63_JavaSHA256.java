package _05_HackerRank._01_Java;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class _63_JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        String word = scan.nextLine();

        byte[] encoded = digest.digest(word.getBytes(StandardCharsets.UTF_8));
        System.out.println(bytesToHex(encoded));
    }


    private static String bytesToHex(byte[] hash){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1){
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}


