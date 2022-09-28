package _02_ProgrammingFundamentals._10_TextProcessing._03_MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        List<String> morseCode = Arrays.stream(code.split(" \\| ".trim())).collect(Collectors.toList());
        for (int i = 0; i < morseCode.size(); i++) {
            String[] actualDecode = morseCode.get(i).split("\\s+".trim());
            for (int j = 0; j < actualDecode.length; j++) {
                String thisPart = actualDecode[j].trim();
                switch (thisPart) {
                    case ".-":
                        System.out.print("A");
                        break;
                    case "-...":
                        System.out.print("B");
                        break;
                    case "-.-.":
                        System.out.print("C");
                        break;
                    case "-..":
                        System.out.print("D");
                        break;
                    case ".":
                        System.out.print("E");
                        break;
                    case "..-.":
                        System.out.print("F");
                        break;
                    case "--.":
                        System.out.print("G");
                        break;
                    case "....":
                        System.out.print("H");
                        break;
                    case "..":
                        System.out.print("I");
                        break;
                    case ".---":
                        System.out.print("J");
                        break;
                    case "-.-":
                        System.out.print("K");
                        break;
                    case ".-..":
                        System.out.print("L");
                        break;
                    case "--":
                        System.out.print("M");
                        break;
                    case "-.":
                        System.out.print("N");
                        break;
                    case "---":
                        System.out.print("O");
                        break;
                    case ".--.":
                        System.out.print("P");
                        break;
                    case "--.-":
                        System.out.print("Q");
                        break;
                    case ".-.":
                        System.out.print("R");
                        break;
                    case "...":
                        System.out.print("S");
                        break;
                    case "-":
                        System.out.print("T");
                        break;
                    case "..-":
                        System.out.print("U");
                        break;
                    case "...-":
                        System.out.print("V");
                        break;
                    case ".--":
                        System.out.print("W");
                        break;
                    case "-..-":
                        System.out.print("X");
                        break;
                    case "-.--":
                        System.out.print("Y");
                        break;
                    case "--..":
                        System.out.print("Z");
                        break;
                }
            }
            System.out.print(" ");
        }
    }
}
