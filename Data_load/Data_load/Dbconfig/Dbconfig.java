package Data_load.Dbconfig;

import java.sql.Connection;

public class Dbconfig {

    private static final String URL =
            "jdbc:mysql://localhost:3306/Practice?serverTimezone=Asia/Seoul&rewriteBatchedStatements=true";
    private static final   String user_pwd = "wklim0321!";

    private static final   String user = "jylim0318";

    public static String getURL() {
        return URL;
    }

    public static String getUser() {
        return user;
    }

    public static String getUser_pwd() {
        return user_pwd;
    }
}
