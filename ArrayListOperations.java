import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nArrayList Operations Menu:");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Print Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    String insertItem = sc.nextLine();
                    list.add(insertItem);
                    System.out.println("Inserted: " + insertItem);
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    String deleteItem = sc.nextLine();
                    if (list.remove(deleteItem)) {
                        System.out.println("Deleted: " + deleteItem);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    String searchItem = sc.nextLine();
                    if (list.contains(searchItem)) {
                        System.out.println("Element found at index: " + list.indexOf(searchItem));
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    System.out.println("Current List Elements: " + list);
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1-5.");
            }
        } while (choice != 5);

        sc.close();
    }
}