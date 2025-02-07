import java.util.*;

class Student {
    int rollNumber;
    String name;
    double marks;

    // Constructor
    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNumber + ": " + name + " - " + marks;
    }
}

public class RankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = scanner.nextInt();
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter roll number, name, and marks for student " + (i + 1) + ": ");
            int rollNumber = scanner.nextInt();
            String name = scanner.next();
            double marks = scanner.nextDouble();
            students[i] = new Student(rollNumber, name, marks);
        }

        Arrays.sort(students, (s1, s2) -> Double.compare(s2.marks, s1.marks));

        System.out.println("\nRank List:");
        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }

        scanner.close();
    }
}
