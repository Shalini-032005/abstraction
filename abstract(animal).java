abstract class Animal {
    abstract void display();
    void showMessage() {
        System.out.println("This is a dog!");
    }
}
class Dog extends Animal {
    void display() {
        System.out.println("The dog barks...");
    }
    void screen(){
        System.out.println("Hi there!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myPet =new Dog();
        myPet.showMessage();
        myPet.display();
    }
}