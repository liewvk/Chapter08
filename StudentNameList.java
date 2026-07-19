import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Student Name List");
        System.out.println("-----------------");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter student name " + i + ": ");
            String name = input.nextLine();
            students.add(name);
        }

        System.out.println();
        System.out.println("Students Entered");
        System.out.println("----------------");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Total students: " + students.size());

        input.close();
    }
}
