package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _04_BitDestroyer {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int positionAt = Integer.parseInt(scan.nextLine());

        int mask = ~(1 << positionAt);
        int result = num & mask;

        System.out.println(result);

        scan.close();
    }
}
