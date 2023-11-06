package _04_JavaOOP._11_DesignPatternsExercise._02_Builder;

// Step 1: Create a Person class with attributes
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // Private constructor to prevent direct instantiation
    private Person() {
    }

    // Getters for attributes
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", age=" + this.age +
                ", address='" + this.address + '\'' +
                '}';
    }

    // Step 2: Create a Builder class for Person
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        // Build method to create the Person object
        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.age = this.age;
            person.address = this.address;
            return person;
        }
    }
}
