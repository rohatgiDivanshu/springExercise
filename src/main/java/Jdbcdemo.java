import java.sql.*;
import java.util.Properties;

public class Jdbcdemo {
    public static void main(String[] args) throws Exception {
        Jdbcdemo.preparedStatement(getConnection4());
    }

    private static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        String connection = "jdbc:mysql://localhost:3306/jdbc_demo";
        return DriverManager.getConnection(connection, "root", "root");

    }

/*
    private static Connection getConnection2() throws Exception {
        DriverManager.registerDriver(new Driver());
        String connectionString = "jdbc:mysql://localhost:3306/jdbc_demo";
        return DriverManager.getConnection(connectionString, "root", "root");

    }*/

/*
    private static Connection getConnection3() throws Exception {
        java.sql.Driver driver = new Driver();
        Properties dbProp = new Properties();
        dbProp.put("user", "root");
        dbProp.put("password", "root");
        return driver.connect("jdbc:mysql://localhost:3306/jdbc_demo", dbProp);
    }*/


    private static Connection getConnection4() throws Exception {
        System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
        Properties dbProp = new Properties();
        dbProp.put("user", "root");
        dbProp.put("password", "root");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", dbProp);
    }

    private static void preparedStatement(Connection connection) throws Exception {

        PreparedStatement ps = getConnection4().prepareStatement("select * from user");

        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {

            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
            System.out.println(resultSet.getString(5));

        }

    }
}