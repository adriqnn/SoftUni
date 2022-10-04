import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class _09_IncreaseAgeStoredProcedure {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);
        Scanner scan = new Scanner(System.in);
        int minionID = Integer.parseInt(scan.nextLine());

        CallableStatement minionsAgeIncreaseProcedure = connection.prepareCall("CALL usp_get_older(?)");
        minionsAgeIncreaseProcedure.setInt(1,minionID);
        minionsAgeIncreaseProcedure.executeQuery();
        connection.close();

    }
}
