package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _03_PthBit {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int positionAt = Integer.parseInt(scan.nextLine());

        int binaryNum = num >> positionAt;
        int bitAtPosition = binaryNum & 1;

        System.out.println(bitAtPosition);

        scan.close();
    }
}
