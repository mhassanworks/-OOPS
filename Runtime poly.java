// Base class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class 1
class Dog extends Animal {
    // Overriding the method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Derived class 2
class Cat extends Animal {
    // Overriding the method
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate runtime polymorphism
public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Reference of the base class pointing to an object of the derived class
        Animal myAnimal;

        myAnimal = new Dog(); // Dog object assigned to Animal reference
        myAnimal.makeSound(); // Output: Bark

        myAnimal = new Cat(); // Cat object assigned to Animal reference
        myAnimal.makeSound(); // Output: Meow
    }
}
