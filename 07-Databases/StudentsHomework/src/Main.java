import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    final static String STUDENT_TABLE = "student";
    final static String FACULTY_TABLE = "faculty";
    final static String COURSE_TABLE = "course";
    final static String STUDENT_COURSE_TABLE = "student_course";

    public static void main(String[] args) {

        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String CONNECTION = "jdbc:mysql://localhost/data?user=KostadinovK&password=maiden123&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        DatabaseConnector dcon = new DatabaseConnector(DRIVER, CONNECTION);
        dcon.createConnection();
        Scanner sc = new Scanner(System.in);

        int number = 0;
        do {
            printMenu();
            number = sc.nextInt();
            switch (number) {
                case 1:
                    dcon.show(STUDENT_TABLE);
                    break;
                case 2:
                    dcon.insert(STUDENT_TABLE);
                    break;
                case 3:
                    dcon.delete();
                    break;
                case 4:
                    dcon.show(FACULTY_TABLE);
                    break;
                case 5:
                    dcon.insert(FACULTY_TABLE);
                    break;
                case 6:
                    dcon.delete();
                    break;
                case 7:
                    dcon.show(COURSE_TABLE);
                    break;
                case 8:
                    dcon.insert(COURSE_TABLE);
                    break;
                case 9:
                    dcon.delete();
                    break;
                case 10:
                    dcon.show(STUDENT_COURSE_TABLE);
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        } while (number != 11);


    }

    public static void printMenu() {
        System.out.println("1.SHOW ALL STUDENTS");
        System.out.println("2.INSERT STUDENT");
        System.out.println("3.DELETE STUDENT");
        System.out.println();
        System.out.println("4.SHOW ALL FACULTIES");
        System.out.println("5.INSERT FACULTY");
        System.out.println("6.DELETE FACULTY");
        System.out.println();
        System.out.println("7.SHOW ALL COURSES");
        System.out.println("8.INSERT COURSE");
        System.out.println("9.DELETE COURSE");
        System.out.println("10.SHOW ALL STUDENTS AND COURSES");
        System.out.println("11.EXIT");
        System.out.println("To choose a command you need to enter its number: ");
    }

}
