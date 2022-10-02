package _04_JavaOOP._01_WorkingWithAbstraction;

public class _01_RhombusOfStars {
    private final int n;

    public _01_RhombusOfStars(int n){
        this.n = n;
    }

    public String getRhombus(){
        return printTop() + printMiddle() + printBottom();
    }
    private String printTop(){
        StringBuilder out = new StringBuilder();
        for (int i = 1; i < n; i++) {
            out.append(repeatAndPrintString(n-i," ")).append(repeatAndPrintString(i,"* ")).append(System.lineSeparator());
        }
        return out.toString();

    }
    private String printMiddle(){
        return repeatAndPrintString(n,"* ") + System.lineSeparator();

    }
    private String printBottom(){
        StringBuilder out = new StringBuilder();
        for (int i = 1; i < n; i++) {
            out.append(repeatAndPrintString(i," ")).append(repeatAndPrintString(n-i,"* ")).append(System.lineSeparator());
        }
        return out.toString();
    }
    private String repeatAndPrintString(int count, String str){
        return str.repeat(count);
    }
}
