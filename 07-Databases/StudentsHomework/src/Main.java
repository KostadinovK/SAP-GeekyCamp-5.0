import java.sql.*;

public class Main {

    public static void main(String [] args){
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String CONNECTION = "jdbc:mysql://localhost/data?user=KostadinovK&password=maiden123&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        String query = "create table STUDENTS(NAME VARCHAR(32) PRIMARY KEY)";

        DatabaseConnector dcon = new DatabaseConnector(DRIVER,CONNECTION);
        dcon.createConnection();
        dcon.executeQuery(query);
    }
}
