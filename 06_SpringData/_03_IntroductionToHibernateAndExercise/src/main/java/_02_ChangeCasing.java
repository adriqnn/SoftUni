import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class _02_ChangeCasing {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Query from_town = entityManager.createQuery("SELECT t FROM Town t", Town.class);
        List<Town> resultList = from_town.getResultList();

        //entityManager.createQuery("UPDATE Town T SET t.name = lower(t.name) WHERE length(t.name) >= 5);

        for (Town town : resultList) {
            String name = town.getName();
            if(name.length() <= 5){
                String toUpper = name.toUpperCase();
                town.setName(toUpper);
                entityManager.persist(town);
            }
            System.out.println(town);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
