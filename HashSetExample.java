import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String element;

        do {
            System.out.println("\nHashSet Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Print Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = sc.nextLine();
                    if (set.add(element)) {
                        System.out.println("Inserted successfully.");
                    } else {
                        System.out.println("Element already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    element = sc.nextLine();
                    if (set.remove(element)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    element = sc.nextLine();
                    if (set.contains(element)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    System.out.println("All Elements:");
                    for (String s : set) {
                        System.out.println(s);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
