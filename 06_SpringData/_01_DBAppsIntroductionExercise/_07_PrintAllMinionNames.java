import java.sql.*;
import java.util.*;

public class _07_PrintAllMinionNames {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db",properties);
        PreparedStatement getMinionNamesFromTableMinions = connection.prepareStatement("SELECT name FROM minions");

        ResultSet minionNames = getMinionNamesFromTableMinions.executeQuery();

        List<String> minionNamesArray = extractArrayOfMinions(minionNames);
        Deque<String> getNamesOfMinionsRearranged = extractedArrayDeque(minionNamesArray);
        printNames(getNamesOfMinionsRearranged);
        connection.close();
    }

    private static void printNames(Deque<String> getNamesOfMinionsRearranged) {
        while(getNamesOfMinionsRearranged.size() > 0){
            System.out.println(getNamesOfMinionsRearranged.poll());
        }
    }

    private static Deque<String> extractedArrayDeque(List<String> minionNamesArray) {
        Deque<String> names = new ArrayDeque<>();
        for (int i = 0; minionNamesArray.size() > 0; i++) {
            if (i % 2 == 0){
                names.offer(minionNamesArray.get(0));
                minionNamesArray.remove(0);
            }else{
                names.offer(minionNamesArray.get(minionNamesArray.size()-1));
                minionNamesArray.remove(minionNamesArray.size()-1);
            }
        }
        return names;
    }

    private static List<String> extractArrayOfMinions(ResultSet minionNames) throws SQLException {
        List<String> minionNamesArray = new ArrayList<>();
        while (minionNames.next()){
            minionNamesArray.add(minionNames.getString("name"));
        }
        return minionNamesArray;
    }
}
