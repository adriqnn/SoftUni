package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

// A class representing a manager who can manage but not work or eat
public class ManagerEmployee implements Manager {
    public void manage() {
        // Manager-specific management
        System.out.println("Manager is managing.");
    }
}
