package TemPlates;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBC_templastes {

    public Connection getConnection() {

        // 커넥션, 프로퍼티스 객체 생성
        Connection conn = null;
        Properties pro  = null;

        try {
            pro.load(new FileReader("src/main/java/TemPlates/db.properties.properties"));

            String driver = pro.getProperty("driver");
            String url = pro.getProperty("url");
            String user = pro.getProperty("user");
            String password = pro.getProperty("password");

            Class.forName(driver);

            conn = DriverManager.getConnection(url,pro);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public void close(Connection conn) {

        try {
            if(conn != null || !conn.isClosed()) {

                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void close(Statement stmt) {

        try {
            if(stmt != null || !stmt.isClosed()) {

                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void close(ResultSet rst) {

        try {
            if(rst != null || !rst.isClosed()) {

                rst.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
