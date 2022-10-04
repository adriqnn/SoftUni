package zzz;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _02_Diablo {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","MySQL99zzzMySQL99zzzMySQL99zzz");

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/diablo", properties);

        PreparedStatement statement = connection.prepareStatement(
                "SELECT user_name, first_name, last_name, COUNT(users_games.id) as games_played FROM users" +
                        " JOIN users_games ON users_games.user_id = users.id" +
                        " WHERE user_name = ?" +
                        " GROUP BY users_games.user_id");

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();

        statement.setString(1, username);

        ResultSet resultSet = statement.executeQuery();

        if(resultSet.next()) {
            String dbUsername = resultSet.getString("user_name");
            String dbFirstName =  resultSet.getString("first_name");
            String dbLastName = resultSet.getString("last_name");
            Integer dbGamesCount = resultSet.getInt("games_played");

            System.out.printf("User: %s\n%s %s has played %d games\n",
                    dbUsername, dbFirstName, dbLastName, dbGamesCount);
        } else {
            System.out.println("No such user exists");
        }
    }
}
