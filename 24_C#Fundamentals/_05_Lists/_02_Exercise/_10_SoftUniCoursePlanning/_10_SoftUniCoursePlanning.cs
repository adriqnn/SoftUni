using System;
using System.Linq;

public class _10_SoftUniCoursePlanning
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> courseList = Console.ReadLine().Split(", ").ToList();
        string commands = Console.ReadLine();

        // Read and execute commands based on the input
        while (!commands.Equals("course start"))
        {
            string[] commandLine = commands.Split(":");
            string command = commandLine[0];
            string lessonTitleOne = commandLine[1];

            if (command.Equals("Add"))
            {
                if (!courseList.Contains(lessonTitleOne))
                {
                    courseList.Add(lessonTitleOne);
                }
            }
            else if (command.Equals("Insert"))
            {
                int indexInsert = int.Parse(commandLine[2]);

                if (!courseList.Contains(lessonTitleOne))
                {
                    courseList.Insert(indexInsert, lessonTitleOne);
                }
            }
            else if (command.Equals("Remove"))
            {
                string removeExercise = lessonTitleOne + "-Exercise";

                courseList.Remove(lessonTitleOne);
                courseList.Remove(removeExercise);
            }
            else if (command.Equals("Swap"))
            {
                string lessonTitleTwo = commandLine[2];

                if (courseList.Contains(lessonTitleOne) && courseList.Contains(lessonTitleTwo))
                {
                    int indexLessonOne = courseList.IndexOf(lessonTitleOne);
                    int indexLessonTwo = courseList.IndexOf(lessonTitleTwo);

                    courseList[indexLessonOne] = lessonTitleTwo;
                    courseList[indexLessonTwo] = lessonTitleOne;

                    string swapLessonOneExercise = lessonTitleOne + "-Exercise";
                    string swapLessonTwoExercise = lessonTitleTwo + "-Exercise";

                    if (courseList.Contains(swapLessonOneExercise))
                    {
                        courseList.Remove(swapLessonOneExercise);

                        if (courseList.IndexOf(lessonTitleOne) == courseList.Count - 1)
                        {
                            courseList.Add(swapLessonOneExercise);
                        }
                        else
                        {
                            courseList.Insert(indexLessonTwo + 1, swapLessonOneExercise);
                        }
                    }

                    if (courseList.Contains(swapLessonTwoExercise))
                    {
                        courseList.Remove(swapLessonTwoExercise);

                        courseList.Insert(indexLessonOne + 1, swapLessonTwoExercise);
                    }
                }
            }
            else if (command.Equals("Exercise"))
            {
                string exercise = lessonTitleOne + "-Exercise";

                if (courseList.Contains(lessonTitleOne) && !courseList.Contains(exercise))
                {
                    int indexExercise = courseList.IndexOf(lessonTitleOne);

                    if (indexExercise == courseList.Count - 1)
                    {
                        courseList.Add(exercise);
                    }
                    else
                    {
                        courseList.Insert(indexExercise + 1, exercise);
                    }
                }
                else if (!courseList.Contains(lessonTitleOne))
                {
                    courseList.Add(lessonTitleOne);

                    courseList.Add(exercise);
                }

            }

            commands = Console.ReadLine();
        }

        // Print result
        for (int i = 0; i < courseList.Count; i++)
        {
            Console.WriteLine($"{i + 1}.{courseList[i]}");
        }
    }
}
