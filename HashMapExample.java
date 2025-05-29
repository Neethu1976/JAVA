 import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHashMap Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Print Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (Integer): ");
                    int key = sc.nextInt();
                    System.out.print("Enter value (String): ");
                    String value = sc.next();
                    map.put(key, value);
                    System.out.println("Inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter key to delete: ");
                    key = sc.nextInt();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    key = sc.nextInt();
                    if (map.containsKey(key)) {
                        System.out.println("Found: " + map.get(key));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 4:
                    System.out.println("All Elements:");
                    for (Integer k : map.keySet()) {
                        System.out.println("Key: " + k + ", Value: " + map.get(k));
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
