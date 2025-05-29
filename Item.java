import java.util.*;

public class Item {
    String name;
    int quantity;
    int price;

    static int totalno = 0;

    public Item(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        totalno++;  // increment each time an item is created
    }

    public static int getTotal() {
        return totalno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Item[] s = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // clear buffer

            s[i] = new Item(name, quantity, price);
          
            System.out.println("Total items entered : " + Item.getTotal());
            System.out.println();
        }

      
    }
}