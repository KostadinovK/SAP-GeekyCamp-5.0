import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseConnector {

    private String driver;
    private String connection;

    public DatabaseConnector(String driver, String connection) {
        this.driver = driver;
        this.connection = connection;
    }

    public String getDriver() {
        return this.driver;
    }

    public String getConnection() {
        return this.connection;
    }

    public void createConnection() {
        try {
            Class.forName(this.driver).newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void show(String table) {

        final String STUDENTS_QUERY = "select * from student ;";
        final String FACULTIES_QUERY = "select * from faculty ;";
        final String COURSES_QUERY = "select * from course ;";
        final String COURSE_STUDENT_QUERY = "select * from course_student ;";

        try (Connection connection = DriverManager.getConnection(this.connection)) {
            Statement stmt = connection.createStatement();
            if (table == Main.STUDENT_TABLE) {
                Shows.showStudents(STUDENTS_QUERY, stmt);
            } else if (table == Main.FACULTY_TABLE) {
                Shows.showFaculties(FACULTIES_QUERY, stmt);
            } else if (table == Main.COURSE_TABLE) {
                Shows.showCourses(COURSES_QUERY, stmt);
            } else if (table == Main.STUDENT_COURSE_TABLE) {
                Shows.showStudentsCourses(COURSE_STUDENT_QUERY, stmt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            for (Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }
    }

    public void insert(String table) {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection(this.connection)) {
            Statement stmt = connection.createStatement();
            if (table == Main.STUDENT_TABLE) {
                System.out.println("Enter student's first name: ");
                String firstName = sc.nextLine();
                System.out.println("Enter student's last name: ");
                String lastName = sc.nextLine();
                System.out.println("Enter student's faculty number: ");
                int facNum = sc.nextInt();

                Student s = new Student(firstName, lastName, facNum);
                Inserts.insertStudent(s, stmt);
            } else if (table == Main.FACULTY_TABLE) {
                System.out.println("Enter faculty's number: ");
                int num = sc.nextInt();

                Faculty f = new Faculty(num);
                Inserts.insertFaculty(f, stmt);
            } else if (table == Main.COURSE_TABLE) {
                System.out.println("Enter course's name: ");
                String name = sc.nextLine();
                System.out.println("Enter course's description: ");
                String description = sc.nextLine();
                System.out.println("Enter course's credits: ");
                int credits = sc.nextInt();

                Course c = new Course(name, description, credits);
                Inserts.insertCourse(c, stmt);
            } else if (table == Main.STUDENT_COURSE_TABLE) {
                System.out.println("Enter course id: ");
                int course_id = sc.nextInt();
                System.out.println("Enter student id: ");
                int student_id = sc.nextInt();

                Inserts.insertStudentCourse(course_id, student_id, stmt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            for (Throwable ex : e) {
                System.err.println("Error occurred " + ex);
            }
            System.out.println("Error in fetching data");
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        String query;
        System.out.println("Insert a SQL query: ");
        query = sc.nextLine();

        String[] queryArray = query.split(" ");
        if (queryArray[0].equals("delete") || queryArray[0].equals("DELETE")) {
            try (Connection connection = DriverManager.getConnection(this.connection)) {
                Statement stmt = connection.createStatement();
                stmt.executeQuery(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("This is not a valid MySQL delete query!");
        }
    }


}
