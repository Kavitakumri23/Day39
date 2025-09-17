package Inheritance;

// Parent class
class animal{
    String name = "Animal";

    animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal can eat");
    }
}

// Child class
class dog extends animal {
    String name = "Dog"; // same variable as parent

    dog() {
        super(); // calls parent constructor
        System.out.println("Dog constructor called");
    }

    void eat() {
        super.eat(); // calls parent method
        System.out.println("Dog also eats");
    }

    void printNames() {
        System.out.println("Parent name: " + super.name); // parent variable
        System.out.println("Child name: " + this.name);   // child variable
    }
}

// Main class
public class SingleUsingSuper {
    public static void main(String[] args) {
        dog d = new dog();

        d.eat();        // overridden method with super
        d.printNames(); // access parent + child variables
    }
}

