class Animal{
    private String species;
    int age;
    float weight;
    protected String colour;
    public Animal(String species, int age, float weight, String colour) {
            this.species=species;
            this.age=age;
            this.weight=weight;
            this.colour=colour;
}
public void displayAnimal(){
    System.out.println(age +" years & "+ weight + " kg "+ species + " in " + colour);
}
}
class Dog extends Animal{
    private String name;
    private String owner;
    public Dog(String species,int age,float weight,String colour,String name,String owner){
        super(species,age,weight,colour);
        this.name=name;
        this.owner=owner;
    }
    public void displayDog(){
        System.out.println(name + " owned by " + owner);
    }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Dog d= new Dog("Pomeranian",3, 20,"White","Bruno","Neethu");
        d.displayAnimal();
        d.displayDog();

    
}
    }