package _01_GringottsDatabase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _01_MainGringottsTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateCodeFirst");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
