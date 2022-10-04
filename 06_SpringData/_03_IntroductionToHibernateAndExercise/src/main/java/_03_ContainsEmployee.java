import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;

public class _03_ContainsEmployee {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Scanner scan = new Scanner(System.in);
        String[] nameToSearchFor = scan.nextLine().split("\\s+");


        //CriteriaBuilder option

        /*Query namesMatch = entityManager.createQuery("SELECT e FROM Employee e WHERE e.firstName = :first_name AND e.lastName = :last_name", Employee.class)
                .setParameter("first_name",nameToSearchFor[0]).setParameter("last_name",nameToSearchFor[1]);*/

        /*Employee result = entityManager.createQuery("SELECT e FROM Employee e WHERE e.firstName = :first_name AND e.lastName = :last_name", Employee.class)
                .setParameter("first_name",nameToSearchFor[0]).setParameter("last_name",nameToSearchFor[1]).getSingleResult();*/

        Long employeeCount = entityManager.createQuery("SELECT count(e) FROM Employee e WHERE e.firstName = :first_name AND e.lastName = :last_name", Long.class)
                .setParameter("first_name",nameToSearchFor[0]).setParameter("last_name",nameToSearchFor[1]).getSingleResult();

        if(employeeCount > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
