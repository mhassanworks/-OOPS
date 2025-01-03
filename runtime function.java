// Base class
class Animal {
    // Virtual method (all non-static methods are virtual in Java)
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class VirtualFunctionExample {
    public static void main(String[] args) {
        // Reference of type Animal, object of type Dog
        Animal myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        // Reference of type Animal, object of type Cat
        Animal myCat = new Cat();
        myCat.sound(); // Output: Cat meows

        // Reference and object of type Animal
        Animal genericAnimal = new Animal();
        genericAnimal.sound(); // Output: Animal makes a sound
    }
}
