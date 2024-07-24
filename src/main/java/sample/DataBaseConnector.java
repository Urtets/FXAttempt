package sample;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataBaseConnector {

    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "user_account";
        String databaseUser = "MSQL80";
        String databasePassword = "Irishka000@";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}
