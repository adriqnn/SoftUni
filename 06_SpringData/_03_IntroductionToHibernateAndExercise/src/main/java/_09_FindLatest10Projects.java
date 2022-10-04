import entities.Address;
import entities.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _09_FindLatest10Projects {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();


        List<Project> projects = entityManager.createQuery("FROM Project p Order BY p.startDate DESC", Project.class)
                .setMaxResults(10).getResultStream().sorted(Comparator.comparing(Project::getName)).collect(Collectors.toList());

        projects.forEach(e -> {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
            String printLine = String.format("Project name: %s%n        Project Description: %s%n        Project Start Date: %s%n        Project End Date: %s",
                    e.getName(),e.getDescription(),e.getStartDate().format(dateFormatter),e.getEndDate() != null ? e.getEndDate().format(dateFormatter):e.getEndDate());
            System.out.println(printLine);
        });

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
