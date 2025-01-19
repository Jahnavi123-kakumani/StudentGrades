import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create an ArrayList to store the grades
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student grades. Type '-1' to stop entering grades.");

        // Input grades from the teacher
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                break; // Stop input when -1 is entered
            } else if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Please enter a value between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        // Check if grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate the average, highest, and lowest scores
            double sum = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double grade : grades) {
                sum += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = sum / grades.size();

            // Display results
            System.out.println("\nGrade Analysis:");
            System.out.println("Number of students: " + grades.size());
            System.out.println("Average grade: " + String.format("%.2f", average));
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

        scanner.close();
    }
}
