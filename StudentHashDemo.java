import java.util.HashMap;
import java.util.Scanner;

public class StudentHashDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> student = new HashMap<>();

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll number:");
            int rollno = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            student.put(rollno, name);
        }

        int choice;
        while (true) {
            System.out.println("\nMENU\n1. Display names\n2. Exit\nEnter choice:");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Enter the roll number:");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.println("The name is: " + student.get(id));
                    break;
                case 2:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
