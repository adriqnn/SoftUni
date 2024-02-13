package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _06_TriBitSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int positionAt = Integer.parseInt(scan.nextLine());

        int triBitSwitch = triBitSwitch(number, positionAt);
        System.out.println(triBitSwitch);

        scan.close();
    }

    public static int triBitSwitch(int number, int position) {
        int mask = 7 << position;
        return (number ^ mask);
    }
}
