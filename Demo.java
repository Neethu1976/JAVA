import java.util.Scanner;

abstract class Employee{
   String name;

   Employee(String name){
    this.name=name;
   }

}

// Person class (inherits Employee)
class Person extends Employee {
    String pname;

    Person(String name, String pname) {
        super(name);
        this.pname = pname;
    }
}

// Runnable class to display person details
class PersonPrinter implements Runnable {
    Person[] persons;

    PersonPrinter(Person[] persons) {
        this.persons = persons;
    }

    public void run() {
        System.out.println("Person details:");
        for (Person x : persons) {
            System.out.println("Employee Name: " + x.name + ", Person Name: " + x.pname);
            try {
                    Thread.sleep(500); // Delay to simulate work
                } catch (InterruptedException e) {
                    System.out.println("F.");
                }
        }
    }
}


class Factorial implements Runnable{
    int num;

    Factorial(int num){
        this.num=num;
    }
    public void run(){
        long factorial=1;
    for (int i = 1; i <=num ;i++){
      factorial*=i;
      try {
                    Thread.sleep(500); // Delay to simulate work
                } catch (InterruptedException e) {
                    System.out.println("Fed.");
                }
    }
    System.out.println("factorial is "+factorial);
}
}

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int off=sc.nextInt();
        sc.nextLine();
        
        Person[] person =new Person[off];

        for (int i = 0; i < off; i++) {
            System.out.println("enter details of"+(i+1)+":");
            System.out.println("enter name");
            String n=sc.nextLine();
            System.out.println("enter pname");
            String m=sc.nextLine();

            person[i]=new Person(n, m);

            
        }

        System.out.println("enter limit");
        int nu=sc.nextInt();

        Thread t1=new Thread(new PersonPrinter(person));
        Thread t2=new Thread(new Factorial(nu));
        t1.start();
        t2.start();

    }
}