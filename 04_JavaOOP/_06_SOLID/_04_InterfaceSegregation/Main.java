package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        // Interface Segregation example

        RegularWorker regularWorker = new RegularWorker();
        SupervisorWorker supervisorWorker = new SupervisorWorker();
        RobotWorker robotWorker = new RobotWorker();
        ManagerEmployee managerEmployee = new ManagerEmployee();

        regularWorker.work();

        supervisorWorker.work();
        supervisorWorker.eat();

        robotWorker.work();

        managerEmployee.manage();
    }
}
