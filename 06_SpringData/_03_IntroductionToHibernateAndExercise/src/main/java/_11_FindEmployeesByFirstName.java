import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class _11_FindEmployeesByFirstName {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Scanner scan = new Scanner(System.in);
        String startWith = scan.nextLine() + "%";

        entityManager.createQuery("FROM Employee e WHERE e.firstName LIKE :wildcard", Employee.class).setParameter("wildcard", startWith).getResultList().forEach(e -> {
            System.out.printf("%s %s - %s - ($%.2f)%n",e.getFirstName(),e.getLastName(),e.getJobTitle(),e.getSalary());
        });

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
