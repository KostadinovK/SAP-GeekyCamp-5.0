import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Shows {

    public static void showStudents(String query, Statement stmt) {
        Scanner sc = new Scanner(System.in);
        try {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("STUDENT");
            System.out.println("Columns: ID, FIRST_NAME, LAST_NAME, FAC_NUM");
            while (rs.next()) {
                String id = rs.getObject(1).toString();
                String firstName = rs.getObject(2).toString();
                String lastName = rs.getObject(3).toString();
                String facNum = rs.getObject(4).toString();
                System.out.println(id + " - " + firstName + " - " + lastName + " - " + facNum);

            }
            System.out.println("Press a key to continue...");

            System.out.println();
            System.out.println();
            System.out.println();
            char c = sc.next().charAt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void showFaculties(String query, Statement stmt) {
        Scanner sc = new Scanner(System.in);
        try {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Columns: NUM");
            while (rs.next()) {
                String num = rs.getObject(1).toString();
                System.out.println(num);

            }
            System.out.println("Press a key to continue...");

            System.out.println();
            System.out.println();
            System.out.println();
            char c = sc.next().charAt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void showCourses(String query, Statement stmt) {
        Scanner sc = new Scanner(System.in);
        try {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("COURSE");
            System.out.println("Columns: ID, NAME, DESCRIPTION, CREDITS");
            while (rs.next()) {
                String id = rs.getObject(1).toString();
                String name = rs.getObject(2).toString();
                String description = rs.getObject(3).toString();
                String credits = rs.getObject(4).toString();
                System.out.println(id + " - " + name + " - " + description + " - " + credits);

            }
            System.out.println("Press a key to continue...");

            System.out.println();
            System.out.println();
            System.out.println();
            char c = sc.next().charAt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void showStudentsCourses(String query, Statement stmt) {
        Scanner sc = new Scanner(System.in);
        try {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("COURSE_STUDENT");
            System.out.println("Columns: ID, COURSE_ID, STUDENT_ID");
            while (rs.next()) {
                String id = rs.getObject(1).toString();
                String course_id = rs.getObject(2).toString();
                String student_id = rs.getObject(3).toString();
                System.out.println(id + " - " + course_id + " - " + student_id);

            }
            System.out.println("Press a key to continue...");

            System.out.println();
            System.out.println();
            System.out.println();
            char c = sc.next().charAt(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
