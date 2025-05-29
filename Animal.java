import java.util.Scanner;

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void DogDisplay() {
          System.out.println("Name: " + this.name + ", Color: " + this.color + ", Age: " + this.age);
    }
}

class Owner extends Dog {
    String oname;
    int price;

    public Owner(String name, String color, int age, String oname, int price) {
        super(name, color, age);
        this.oname = oname;
        this.price = price;
    }

    public void ddispliay() {
        DogDisplay();
        System.out.println("The dog's name is " + this.name + ". Owner: " + this.oname + ", Price: " + this.price);
    }
}

class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the Dog Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the Dog Color: ");
        String color = scanner.nextLine();

        System.out.print("Enter the Dog Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
 
        System.out.print("Enter the Dog Owner Name: ");
        String oname = scanner.nextLine();

        System.out.print("Enter the Dog Price: ");
        int price = scanner.nextInt();

        Owner A1 = new Owner(name, color, age, oname, price);
        A1.ddispliay();

        scanner.close();
    }
}
