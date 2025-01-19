

### Java Code: `StudentGrades.java`

```java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        
        // Input grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        // Calculate average, highest, and lowest
        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        for (double grade : grades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = total / grades.size();

        // Output results
        System.out.println("\nGrade Statistics:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
```

---

### README.md

```markdown
# Student Grades Program

This is a simple Java program that allows teachers to enter students' grades, calculates the average, highest, and lowest scores, and displays the results. The program uses an `ArrayList` to store student grades dynamically.

## Features

- Enter grades for multiple students.
- Calculates the average grade.
- Identifies the highest and lowest grades.
- User-friendly console-based interface.

## Requirements

- Java 8 or later
- A Java IDE or terminal with Java installed

## How to Run

1. Clone this repository to your local machine or download the program.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run the `StudentGrades.java` file.
4. Follow the prompts to enter grades and view the results.

## Example

Input:
```
Enter the number of students:
3
Enter grade for student 1:
85
Enter grade for student 2:
90
Enter grade for student 3:
78
```

Output:
```
Grade Statistics:
Average Grade: 84.33
Highest Grade: 90.0
Lowest Grade: 78.0
```

## Contributing

If you find any issues or have suggestions for improvement, feel free to fork the repository and create a pull request.

## License

This project is open-source and available under the MIT License.

---

Enjoy using the program!
