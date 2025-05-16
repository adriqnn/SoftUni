package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> courseList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scan.nextLine();

        // Read and execute commands based on the input
        while (!commands.equals("course start")) {
            String[] commandLine = commands.split(":");
            String command = commandLine[0];
            String lessonTitleOne = commandLine[1];

            if (command.equals("Add")) {
                if (!courseList.contains(lessonTitleOne)) {
                    courseList.add(lessonTitleOne);
                }
            } else if (command.equals("Insert")) {
                int indexInsert = Integer.parseInt(commandLine[2]);

                if (!courseList.contains(lessonTitleOne)) {
                    courseList.add(indexInsert, lessonTitleOne);
                }
            } else if (command.equals("Remove")) {
                String removeExercise = lessonTitleOne + "-Exercise";

                courseList.remove(lessonTitleOne);
                courseList.remove(removeExercise);
            } else if (command.equals("Swap")) {
                String lessonTitleTwo = commandLine[2];

                if (courseList.contains(lessonTitleOne) && courseList.contains(lessonTitleTwo)) {
                    int indexLessonOne = courseList.indexOf(lessonTitleOne);
                    int indexLessonTwo = courseList.indexOf(lessonTitleTwo);

                    courseList.set(indexLessonOne, lessonTitleTwo);
                    courseList.set(indexLessonTwo, lessonTitleOne);

                    String swapLessonOneExercise = lessonTitleOne + "-Exercise";
                    String swapLessonTwoExercise = lessonTitleTwo + "-Exercise";

                    if (courseList.contains(swapLessonOneExercise)) {
                        courseList.remove(swapLessonOneExercise);

                        if (courseList.indexOf(lessonTitleOne) == courseList.size() - 1) {
                            courseList.add(swapLessonOneExercise);
                        } else {
                            courseList.add(indexLessonTwo+1, swapLessonOneExercise);
                        }
                    }

                    if (courseList.contains(swapLessonTwoExercise)) {
                        courseList.remove(swapLessonTwoExercise);

                        courseList.add(indexLessonOne + 1, swapLessonTwoExercise);
                    }
                }
            } else if (command.equals("Exercise")) {
                String exercise = lessonTitleOne + "-Exercise";

                if (courseList.contains(lessonTitleOne) && !courseList.contains(exercise)) {
                    int indexExercise = courseList.indexOf(lessonTitleOne);

                    if (indexExercise == courseList.size() - 1) {
                        courseList.add(exercise);
                    } else {
                        courseList.add(indexExercise + 1, exercise);
                    }
                } else if (!courseList.contains(lessonTitleOne)) {
                    courseList.add(lessonTitleOne);

                    courseList.add(exercise);
                }
            }

            commands = scan.nextLine();
        }

        // Print result
        for (int i = 0; i < courseList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courseList.get(i));
        }

        scan.close();
    }
}
