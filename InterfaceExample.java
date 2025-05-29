// Interface definition
interface Animal {
    void makeSound(); // abstract method
}

// Class Dog implements Animal
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Class Cat implements Animal
class Cat implements Animal {
    public void makeSound() {
        System.out.println ("Cat says: Meow Meow!");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Animal reference to Dog object
        Animal myCat = new Cat(); // Animal reference to Cat object

        myDog.makeSound();  // Calls Dog's version
        myCat.makeSound();  // Calls Cat's version
    }
}