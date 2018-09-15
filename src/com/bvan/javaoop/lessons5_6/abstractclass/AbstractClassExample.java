package com.bvan.javaoop.lessons5_6.abstractclass;

/**
 * @author bvanchuhov
 */
public class AbstractClassExample {

    public static void main(String[] args) {
        Developer d = new Developer("Petya", 40, "Google");
        d.sayHello();
        d.writeCode();

        Person p3 = d;
        p3.sayHello();
    }
}

abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unnamed", 0);
    }

    protected String getName() {
        return name;
    }

    public abstract void sayHello();
}

class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm dev " + getName() + " from " + company);
    }
}

class Student extends Person {
    @Override
    public void sayHello() {
        System.out.println("I'm student");
    }
}
