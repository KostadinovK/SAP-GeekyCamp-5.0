import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {

    private String driver;
    private String connection;

    public DatabaseConnector(String driver, String connection){
        this.driver = driver;
        this.connection = connection;
    }

    public String getDriver(){
        return this.driver;
    }

    public String getConnection(){
        return this.connection;
    }

    public void createConnection(){
        try{
            Class.forName(this.driver).newInstance();

        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }


    }

    public void executeQuery(String SqlQuery){
        try(Connection connection = DriverManager.getConnection(this.connection);
            Statement statement = connection.createStatement()){
            statement.executeUpdate(SqlQuery);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
