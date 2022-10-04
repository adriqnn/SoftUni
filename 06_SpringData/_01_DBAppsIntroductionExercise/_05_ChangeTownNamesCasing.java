import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class _05_ChangeTownNamesCasing {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        Scanner scan = new Scanner(System.in);
        String countryName = scan.nextLine();

        PreparedStatement updateTownNames =  connection.prepareStatement("UPDATE towns SET name = upper(name) where country = ?;");
        updateTownNames.setString(1,countryName);

        int updatedCount = updateTownNames.executeUpdate();

        if(updatedCount == 0){
            System.out.println("No town names were affected.");
            return;
        }
        System.out.println(updatedCount + " town names were affected.");

        PreparedStatement selectAllTowns = connection.prepareStatement("SELECT name FROM towns WHERE country = ?;");
        selectAllTowns.setString(1,countryName);
        ResultSet townSet = selectAllTowns.executeQuery();

        List<String> towns = new ArrayList<>();
        while(townSet.next()){
            String townName = townSet.getString("name");
            towns.add(townName);
        }
        System.out.println(towns);
        connection.close();
    }
}

























