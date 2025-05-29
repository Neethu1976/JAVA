import java.util.*;

interface Printable {
    void display();
    void show();
}

interface Computable {
    double area();
    double peri();
    double volume();
}

interface Drawable {
    void draw();
}

class Rectangle implements Printable, Computable, Drawable {
    double length, breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double area() {
        return length * breadth;
    }

    public double peri() {
        return 2 * (length + breadth);
    }

    public double volume() {
        // Rectangle is 2D, so volume is not applicable
        return -1;
    }

    public void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public void show() {
        System.out.println("Showing Rectangle...");
    }

    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

class Sphere implements Printable, Computable, Drawable {
    double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double peri() {
        return 2 * Math.PI * radius; // Not very meaningful for sphere
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public void display() {
        System.out.println("Sphere Details:");
        System.out.println("Radius: " + radius);
    }

    public void show() {
        System.out.println("Showing Sphere...");
    }

    public void draw() {
        System.out.println("Drawing Sphere...");
    }
}

public class Rdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input and display
        System.out.print("Enter the length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of Rectangle: ");
        double b = sc.nextDouble();

        Rectangle rect = new Rectangle(l, b);
        rect.display();
        rect.show();
        rect.draw();
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.peri());
        System.out.println("Volume of Rectangle: " + rect.volume()); // Not applicable

        System.out.println();

        // Sphere input and display
        System.out.print("Enter the radius of Sphere: ");
        double r = sc.nextDouble();

        Sphere sp = new Sphere(r);
        sp.display();
        sp.show();
        sp.draw();
        System.out.println("Surface Area of Sphere: " + sp.area());
        System.out.println("Perimeter (Circumference) of Sphere: " + sp.peri());
        System.out.println("Volume of Sphere: " + sp.volume());

        sc.close();
    }
}
