package it.classesAndObjects;

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;
    public void drinkcoffee() {
        System.out.println("Espresso is the secret!");
    }
    public void printDetails() {
        System.out.println(name + " is a " + age + " yo programmer");
    }
    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses ? " + wearsGlasses);
    }
}

