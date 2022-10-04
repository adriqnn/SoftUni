import entities.Town;
import javax.persistence.*;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Name");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter town name:");
        String townName = scan.nextLine();
        Optional<Town> optional = entityManager.createQuery("FROM Town t WHERE t.name = :town_param", Town.class).setParameter("town_param", townName).getResultStream().findFirst();
        if(optional.isPresent()) {
            Integer townId = optional.get().getId();


            Stream<Integer> idsStream = entityManager.createQuery(" SELECT e.id FROM Employee AS e WHERE e.address.town.id = :town_id", Integer.class).setParameter("town_id", townId).getResultStream();
            String employeeIds = idsStream.map(String::valueOf).collect(Collectors.joining(", "));
            String sql = String.format("Update Employee AS e SET e.address.id = null WHERE e.id IN (%s)", employeeIds);
            entityManager.createQuery(sql).executeUpdate();
            int affectedAddresses = entityManager.createQuery("DELETE FROM Address AS a WHERE a.town.id = :town_id").setParameter("town_id", townId).executeUpdate();
            entityManager.createQuery("DELETE FROM Town AS t WHERE t.name = :town_name").setParameter("town_name", townName).executeUpdate();


            System.out.printf("%d address in %s deleted", affectedAddresses, townName);
        } else {
            System.out.printf("Town %s doesn't exist in the database", townName);
        }





        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
