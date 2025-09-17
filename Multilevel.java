package Inheritance;

// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class from Person
class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age); // calling Person constructor
        this.salary = salary;
    }

    void displayEmployee() {
        super.displayPerson(); // Person details
        System.out.println("Salary: " + salary);
    }
}

// Derived class from Employee
class Manager extends Employee {
    String department;

    Manager(String name, int age, double salary, String department) {
        super(name, age, salary); // calling Employee constructor
        this.department = department;
    }

    void displayManager() {
        super.displayEmployee(); // Employee details
        System.out.println("Department: " + department);
    }
}

// Main class
public class Multilevel{
    public static void main(String[] args) {
        Manager m1 = new Manager("Kavita", 20, 75000, "IT");
        m1.displayManager();
    }
}

