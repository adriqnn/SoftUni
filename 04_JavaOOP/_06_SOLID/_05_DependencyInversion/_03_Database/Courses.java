package _04_JavaOOP._06_SOLID._05_DependencyInversion._03_Database;

public class Courses {
    public void printAll()
    {
        Data database = new Data();
        Iterable<String> courses = database.courseNames();

        //print courses
    }

    public void printIds()
    {
        Data database = new Data();
        Iterable<Integer>coursesIds = database.courseIds();

        //print course ids
    }

    public void printById(int id)
    {
        Data database = new Data();
        String course = database.getCourseById(id);

        // print course
    }

    public void search(String substring)
    {
        Data database = new Data();
        Iterable<String> courses = database.search(substring);

        // print courses
    }
}
