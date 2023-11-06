package _04_JavaOOP._11_DesignPatternsExercise._02_Builder;

public class Main {
    public static void main(String[] args) {
        // Step 3: Use the Builder to create a Person object
        Person person = new Person.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .build();

        System.out.println(person);
    }
}
