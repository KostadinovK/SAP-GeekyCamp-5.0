import java.sql.SQLException;
import java.sql.Statement;

public class Inserts {

    public static void insertStudent(Student s, Statement stmt) {
        try {
            String query = "INSERT INTO STUDENT VALUES(NULL," + "\'" + s.getFirstName() + "\'" + "," + "\'" + s.getLastName() + "\'" + "," + "\'" + s.getFacNumber() + "\'" + ");";
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertFaculty(Faculty f, Statement stmt) {
        try {
            String query = "INSERT INTO FACULTY VALUES(" + f.getNum() + ");";
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertCourse(Course c, Statement stmt) {
        try {
            String query = "INSERT INTO COURSE VALUES(NULL," + "\'" + c.getName() + "\'" + "," + "\'" + c.getDescription() + "\'" + "," + c.getCredits() + ");";
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudentCourse(int course_id, int student_id, Statement stmt) {
        try {
            String query = "INSERT INTO COURSE_STUDENT VALUES(NULL," + course_id + "," + student_id + ");";
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
