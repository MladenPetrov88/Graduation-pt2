import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int marks = 1;
        double grade = 0;
        double allGrades = 0;
        while (marks <= 12) {
            grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                allGrades += grade;
                marks++;
            }
            if (grade < 4) {
                System.out.printf("%s has been excluded at %d grade", name, marks);
                break;
            }
        }

        if (grade >= 4) {
            double averageGrade = allGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
