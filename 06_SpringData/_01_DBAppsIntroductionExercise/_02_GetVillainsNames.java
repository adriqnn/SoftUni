import java.sql.*;
import java.util.Properties;

public class _02_GetVillainsNames {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        PreparedStatement statement = connection.prepareStatement(
                "SELECT name,count(DISTINCT mv.minion_id) AS minion_count FROM villains AS v" +
                " JOIN minions_villains AS mv ON mv.villain_id = v.id" +
                " GROUP BY mv.villain_id" +
                " HAVING minion_count > ?" +
                " ORDER BY minion_count DESC;");

        statement.setInt(1,15);

        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            String villainName = resultSet.getString("name");
            int minionCount = resultSet.getInt("minion_count");
            System.out.println(villainName + " " + minionCount);
        }
        connection.close();
    }
}
