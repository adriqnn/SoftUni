package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _03_PthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int positionAt = Integer.parseInt(scan.nextLine());

        int bitAtPosition = bitAtPosition(number, positionAt);
        System.out.println(bitAtPosition);

        scan.close();
    }

    public static int bitAtPosition(int number, int position) {
        int binaryNum = number >> position;
        return binaryNum & 1;
    }
}
