package _02_ProgrammingFundamentals._10_TextProcessing._03_MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_HTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String content = scan.nextLine();
        String comments = scan.nextLine();
        List<String> commentsList = new ArrayList<>();
        while(!comments.equals("end of comments")){
            commentsList.add(comments);
            comments = scan.nextLine();
        }
        System.out.printf("<h1>%n    %s%n</h1>%n",title);
        System.out.printf("<article>%n    %s%n</article>%n",content);
        for (int i = 0; i < commentsList.size(); i++) {
            System.out.printf("<div>%n    %s%n</div>%n",commentsList.get(i));
        }
    }
}
