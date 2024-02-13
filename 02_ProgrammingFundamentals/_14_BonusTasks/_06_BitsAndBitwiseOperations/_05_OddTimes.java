package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

public class _05_OddTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersArray = scan.nextLine().split("\\s+");

        int oddNumber = findTheNumberWithOddOccurrences(numbersArray);
        System.out.println(oddNumber);

        scan.close();
    }

    private static int findTheNumberWithOddOccurrences(String[] numbersArray) {
        int result = 0;

        for(String numStr: numbersArray){
            int num = Integer.parseInt(numStr);
            result ^= num;
        }

        return result;
    }
}
