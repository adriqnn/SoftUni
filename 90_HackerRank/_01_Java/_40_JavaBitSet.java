package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class _40_JavaBitSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] line = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        BitSet bitSet1 = new BitSet(line[0]);
        BitSet bitSet2 = new BitSet(line[0]);
        BitSet[] bitSets = new BitSet[3];

        bitSets[1] = bitSet1;
        bitSets[2] = bitSet2;

        for (int i = 0; i < line[1]; i++) {
            String[] commands = scan.nextLine().split("\\s+");
            String command = commands[0];
            int indexOne = Integer.parseInt(commands[1]);
            int indexTwo = Integer.parseInt(commands[2]);

            if(command.equals("AND")){
                bitSets[indexOne].and(bitSets[indexTwo]);
            } else if (command.equals("OR")) {
                bitSets[indexOne].or(bitSets[indexTwo]);
            }else if (command.equals("XOR")) {
                bitSets[indexOne].xor(bitSets[indexTwo]);
            }else if (command.equals("FLIP")) {
                bitSets[indexOne].flip(indexTwo);
            }else if (command.equals("SET")) {
                bitSets[indexOne].set(indexTwo);
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
