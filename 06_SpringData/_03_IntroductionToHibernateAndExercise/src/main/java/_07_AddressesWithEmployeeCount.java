import entities.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _07_AddressesWithEmployeeCount {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.createQuery("FROM Address a Order BY a.employees.size DESC", Address.class).setMaxResults(10).getResultStream()
                .forEach(System.out::println);


        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
