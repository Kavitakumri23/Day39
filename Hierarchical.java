package Inheritance;

//Parent class
class Shape {
    void area() {
        System.out.println("Area of a shape");
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Child class 3
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Main class
public class Hierarchical {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        s1.area();

        Shape s2 = new Rectangle(4, 6);
        s2.area();

        Shape s3 = new Triangle(3, 8);
        s3.area();
    }
}
