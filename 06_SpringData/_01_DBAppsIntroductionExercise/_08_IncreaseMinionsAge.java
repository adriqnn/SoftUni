import java.sql.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_IncreaseMinionsAge {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        Scanner scan = new Scanner(System.in);
        String arrayToStringMinions = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).mapToObj(Integer::toString).collect(Collectors.joining(","));
        //String[] minionsIDsArray = scan.nextLine().split("\\s+");
        //String arrayToStringMinions2 = String.join(",",minionsIDsArray);

        PreparedStatement minionsIncreaseAge = connection.prepareStatement("UPDATE minions SET age = age + 1, name = lower(name) WHERE id IN (" + arrayToStringMinions + ")");
        minionsIncreaseAge.executeUpdate();

        PreparedStatement minionsGetResult = connection.prepareStatement("SELECT name, age FROM minions");
        ResultSet resultSetMinionsUpdated = minionsGetResult.executeQuery();

        while(resultSetMinionsUpdated.next()){
            System.out.println(resultSetMinionsUpdated.getString("name") + " " + resultSetMinionsUpdated.getInt("age"));
        }
        connection.close();
    }
}
