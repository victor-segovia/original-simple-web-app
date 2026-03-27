package com.vsp.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {

  public static Connection getMySQLConnection()
  throws ClassNotFoundException, SQLException {

    // Note: Change the connection parameters accordingly.
    String hostName = "localhost:3306";
    String dbName = "simplewebapp_db";
    String userName = "simplewebapp_db_user";
    String password = "StG4412288!1";
    return getMySQLConnection(hostName, dbName, userName, password);
  }

  public static Connection getMySQLConnection(String hostName, String dbName,
      String userName, String password) throws SQLException,
    ClassNotFoundException {

    // Declare the class driver for MySQL DB
    Class.forName("com.mysql.jdbc.Driver");

    // URL Connection for MySQL
    // Example: jdbc:mysql://localhost:3306/simplehr
    String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    Connection conn = DriverManager.getConnection(connectionURL, userName,
                      password);
    return conn;
  }

}
