import entities.Employee;
import entities.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_GetEmployeeWithProject {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Scanner scan = new Scanner(System.in);
        int idFromConsole = Integer.parseInt(scan.nextLine());

        Employee employee = null;

        try{
            employee = entityManager.createQuery("FROM Employee e WHERE e.id = :id",Employee.class).setParameter("id",idFromConsole).getSingleResult();
        }catch(NoResultException e){
            System.out.println("No Result!");
        }

        if(employee != null){
            String printString = String.format("%s %s - %s%n      %s",employee.getFirstName(),employee.getLastName(),employee.getJobTitle(),
                    employee.getProjects().stream().sorted(Comparator.comparing(Project::getName)).map(Project::getName).collect(Collectors.joining(System.lineSeparator() + "      ")));
            System.out.println(printString);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}


















