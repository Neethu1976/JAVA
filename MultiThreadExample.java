import java.util.Scanner;

class OddNumberPrinter implements Runnable {
    private int n;

    public OddNumberPrinter(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Thread 1: Printing first " + n + " odd numbers:");
        int count = 0, num = 1;
        while (count < n) {
            System.out.println(num);
            num += 2;
            count++;
            try {
                Thread.sleep(300); // pause for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println("OddNumberPrinter interrupted.");
            }
        }
    }
}

class MultiplicationTablePrinter implements Runnable {
    private int n;

    public MultiplicationTablePrinter(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Thread 2: Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(300); // pause for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println("MultiplicationTablePrinter interrupted.");
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Create Runnable objects
        Runnable oddTask = new OddNumberPrinter(n);
        Runnable tableTask = new MultiplicationTablePrinter(n);

        // Create Threads
        Thread thread1 = new Thread(oddTask);
        Thread thread2 = new Thread(tableTask);

        // Start Threads
        thread1.start();
        thread2.start();
    }
}