package org.oyach.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by oych on 15/1/26.
 *
 * @author oyach
 * @since 0.0.1
 */
public class MysqlJdbc {
    private static final String url = "jdbc:mysql://localhost:3306/dust";


    public static void setUpDriver() throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");

//        Driver driver = new Driver();


        Connection conn = DriverManager.getConnection(url, "root", "root");




        Properties properties = conn.getClientInfo();

        Statement stmt = conn.createStatement();


//        stmt.execute()
    }
}
