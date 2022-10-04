import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _04_AddMinion {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);

        Scanner scan = new Scanner(System.in);

        String[] inputArrayMinion = scan.nextLine().split("\\s+");
        String minionName = inputArrayMinion[1];
        int minionAge = Integer.parseInt(inputArrayMinion[2]);
        String minionTown = inputArrayMinion[3];

        String[] inputArrayVillain = scan.nextLine().split("\\s+");
        String villainName = inputArrayVillain[1];

        int townID = getOrInsertTown(connection, minionTown);
        int villainID = getOrInsertVillainName(connection,villainName);

        PreparedStatement insertMinion = connection.prepareStatement("INSERT INTO minions(name,age,town_id) VALUES(?,?,?)");
        insertMinion.setString(1,minionName);
        insertMinion.setInt(2,minionAge);
        insertMinion.setInt(3,townID);
        int updateRowCount = insertMinion.executeUpdate();
        //updateRowCount = 1; if its successful

        PreparedStatement getLastMinion = connection.prepareStatement("SELECT id FROM minions ORDER BY id DESC LIMIT 1");
        ResultSet lastMinionSet = getLastMinion.executeQuery();
        lastMinionSet.next();
        int lastMinionID = lastMinionSet.getInt("id");

        PreparedStatement insertMinionsVillains = connection.prepareStatement("INSERT INTO minions_villains VALUES(?,?)");
        insertMinionsVillains.setInt(1,lastMinionID);
        insertMinionsVillains.setInt(2,villainID);
        insertMinionsVillains.executeUpdate();

        System.out.printf("Successfully added %s to be minion of %s.%n",minionName,villainName);
        connection.close();
    }

    private static int getOrInsertVillainName(Connection connection, String villainName) throws SQLException {
        PreparedStatement selectVillainName = connection.prepareStatement("SELECT id FROM villains WHERE name = ?");
        selectVillainName.setString(1, villainName);

        ResultSet villainQueryForName = selectVillainName.executeQuery();
        int villainID = 0;
        if(!villainQueryForName.next()){
            PreparedStatement insertVillain = connection.prepareStatement("INSERT INTO villains(name,evilness_factor) VALUES(?,?)");
            insertVillain.setString(1,villainName);
            insertVillain.setString(2,"evil");
            insertVillain.executeUpdate();

            ResultSet newVillainSet = selectVillainName.executeQuery();
            newVillainSet.next();
            villainID = newVillainSet.getInt("id");
            System.out.printf("Villain %s was added to the database.%n",villainName);
        }else{
            villainID = villainQueryForName.getInt("id");
        }

        return villainID;
    }

    private static int getOrInsertTown(Connection connection, String minionTown) throws SQLException {
        PreparedStatement selectTown = connection.prepareStatement("SELECT id FROM towns WHERE name = ?");
        selectTown.setString(1, minionTown);

        ResultSet minionQueryForTown = selectTown.executeQuery();
        int townID = 0;
        if(!minionQueryForTown.next()){
            //insert town
            PreparedStatement insertTown = connection.prepareStatement("INSERT INTO towns(name) VALUES (?)");
            insertTown.setString(1, minionTown);
            insertTown.executeUpdate();
            ResultSet newMinionQueryForTown = selectTown.executeQuery();
            newMinionQueryForTown.next();
            townID = newMinionQueryForTown.getInt("id");
            System.out.printf("Town %s was added to the database.%n",minionTown);
        }else{
            townID = minionQueryForTown.getInt("id");
        }
        return townID;
    }
}
