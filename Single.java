package Inheritance;

class Animal{
    String name = "Animal";
    void eat(){
        System.out.println(name + " can eat");
    }
}

class Dog extends Animal{
    String breed = "German Shepherd";

    void bark() {
        System.out.println(breed + " can bark");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
