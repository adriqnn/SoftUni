import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _03_GetMinionNames {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        Scanner scan = new Scanner(System.in);
        int villainID = Integer.parseInt(scan.nextLine());

        PreparedStatement villainStatement = connection.prepareStatement("SELECT name FROM villains WHERE id = ?;");
        villainStatement.setInt(1,villainID);

        ResultSet villainSet = villainStatement.executeQuery();

        if(!villainSet.next()){
            System.out.println("No villain with ID " + villainID + " exists in the database.");
            return;
        }

        String villainName = villainSet.getString("name");
        System.out.println("Villain: " + villainName);

        PreparedStatement minionStatement = connection.prepareStatement(
                "SELECT name, age FROM minions AS m" +
                " JOIN minions_villains AS mv ON mv.minion_id = m.id" +
                " WHERE mv.villain_id = ?;");
        minionStatement.setInt(1,villainID);

        ResultSet minionSet = minionStatement.executeQuery();

        for (int i = 0; minionSet.next(); i++) {
            String minionName = minionSet.getString("name");
            int minionAge = minionSet.getInt("age");
            System.out.printf("%d. %s %d%n",i+1,minionName,minionAge);
        }
        connection.close();
    }
}
