import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class _06_RemoveVillain {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        Scanner scan = new Scanner(System.in);
        int villainID = Integer.parseInt(scan.nextLine());

        PreparedStatement selectVillain = connection.prepareStatement("SELECT name FROM villains WHERE id = ?");
        selectVillain.setInt(1,villainID);
        ResultSet nameFound = selectVillain.executeQuery();
        if(!nameFound.next()){
            System.out.println("No such villain was found");
            return;
        }

        String villainName = nameFound.getString("name");
        List<Integer> minionsIDs = new ArrayList<>();
        PreparedStatement selectAllVillainMinions = connection.prepareStatement("SELECT count(minion_id) as minions_count FROM minions_villains WHERE villain_id = ?");
        selectAllVillainMinions.setInt(1,villainID);
        ResultSet minionsCountSet = selectAllVillainMinions.executeQuery();
        minionsCountSet.next();
        int countMinionsDeleted = minionsCountSet.getInt("minions_count");

        connection.setAutoCommit(false);
        try {
            PreparedStatement deleteMinionsVillains = connection.prepareStatement("DELETE FROM minions_villains WHERE villain_id = ?");
            deleteMinionsVillains.setInt(1,villainID);
            deleteMinionsVillains.executeUpdate();

            PreparedStatement deleteVillain = connection.prepareStatement("DELETE FROM villains WHERE id = ?");
            deleteVillain.setInt(1,villainID);
            deleteVillain.executeUpdate();

            connection.commit();

            System.out.println(villainName + " was deleted");
            System.out.println(countMinionsDeleted + " minions released");
        }catch(SQLException e){
            e.printStackTrace();
            connection.rollback();
        }
        connection.close();
    }
}























