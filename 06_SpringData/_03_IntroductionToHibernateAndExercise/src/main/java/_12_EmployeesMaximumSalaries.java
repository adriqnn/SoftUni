import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _12_EmployeesMaximumSalaries {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();


        entityManager.createQuery("SELECT e FROM Employee e WHERE e.salary = (select max(em.salary) from Employee em WHERE em.department.name = e.department.name) AND (e.salary < 30000 OR e.salary > 70000)" +
                "GROUP BY e.department.name", Employee.class).getResultList().forEach(e -> {
            System.out.printf("%s - %s%n",e.getDepartment().getName(),e.getSalary());
        });


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}






















