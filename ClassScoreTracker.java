import java.util.Scanner;

public class ClassScoreTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int highest;
        int lowest;
        int passCount = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        highest = marks[0];
        lowest = marks[0];

        for (int mark : marks) {
            total = total + mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }

            if (mark >= 50) {
                passCount++;
            }
        }

        double average = total / (double) marks.length;

        System.out.println();
        System.out.println("Class Score Report");
        System.out.println("------------------");
        System.out.println("Total Marks : " + total);
        System.out.printf("Average     : %.2f%n", average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark : " + lowest);
        System.out.println("Pass Count  : " + passCount);

        input.close();
    }
}
