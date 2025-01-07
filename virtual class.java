interface Base {
    default void show() {
        System.out.println("Base class method");
    }
}

interface Derived1 extends Base {
    default void show() {
        System.out.println("Derived1 class method");
    }
}

interface Derived2 extends Base {
    default void show() {
        System.out.println("Derived2 class method");
    }
}

class ConcreteClass implements Derived1, Derived2 {
    // Override the show() method to resolve ambiguity
    @Override
    public void show() {
        System.out.println("ConcreteClass method");
        Derived1.super.show(); // Call Derived1's implementation
        Derived2.super.show(); // Call Derived2's implementation
    }
}

public class VirtualBaseClassDemo {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.show();
    }
}
