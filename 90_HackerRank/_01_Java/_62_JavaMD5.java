package _05_HackerRank._01_Java;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class _62_JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        StringBuilder sb = new StringBuilder();

        String word = scan.nextLine();

        md5.update(word.getBytes());
        byte[] digest = md5.digest();

        BigInteger bigInt = new BigInteger(1, digest);
        String hash = bigInt.toString(16);

//        while(hash.length() < 32){
//            hash = "0" + hash;
//        }

        System.out.println(hash);
    }
}
