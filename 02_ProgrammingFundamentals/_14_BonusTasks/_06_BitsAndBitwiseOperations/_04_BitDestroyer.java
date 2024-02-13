package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _04_BitDestroyer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int positionAt = Integer.parseInt(scan.nextLine());

        int setBitTo0 = setBitTo0(number, positionAt);
        System.out.println(setBitTo0);

        scan.close();
    }

    public static int setBitTo0(int number, int position) {
        int mask = ~(1 << position);
        return number & mask;
    }
}
