import entities.Address;
import entities.Employee;
import entities.Town;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class _13_RemoveTowns {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Scanner scan = new Scanner(System.in);
        String townToDelete = scan.nextLine();

        List<Employee> employeesInTheTown = entityManager.createQuery("SELECT e FROM Employee AS e WHERE e.address.town.name = :town", Employee.class).setParameter("town", townToDelete).getResultList();
        employeesInTheTown.forEach(e -> e.setAddress(null));

        List<Address> addresses = entityManager.createQuery("SELECT a FROM Address a WHERE a.town.name = :town",Address.class).setParameter("town",townToDelete).getResultList();
        addresses.forEach(entityManager::remove);

        Town townDeleted = entityManager.createQuery("SELECT t FROM Town t WHERE t.name = :town",Town.class).setParameter("town",townToDelete).getSingleResult();
        entityManager.remove(townDeleted);

        if(addresses.size() > 1){
            System.out.printf("%d addresses in %s deleted",addresses.size(),townToDelete);
        }else{
            System.out.printf("%d address in %s deleted",addresses.size(),townToDelete);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
