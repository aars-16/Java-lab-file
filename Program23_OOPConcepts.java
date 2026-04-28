// Abstract class
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Interface
interface Pet {
    void play();
}

// Inheritance + Implementation
class Dog extends Animal implements Pet {

    void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Program23_OOPConcepts {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();   // from abstract class
        d.sleep();   // normal method
        d.play();    // from interface
    }
}