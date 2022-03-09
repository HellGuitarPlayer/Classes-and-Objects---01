package it.classesAndObjects;

public class TestProgrammers {
    public static void main(String args[]) {
        Programmer Danilo = new Programmer();
        Programmer Cristiano = new Programmer();
        Danilo.name = "Danilo";
        Danilo.age = 34;
        Danilo.wearsGlasses = true;
        Cristiano.name = "Cristiano";
        Cristiano.age = 39;
        Cristiano.wearsGlasses = false;
        Danilo.drinkcoffee();
        Danilo.printDetails();
        Cristiano.printDetails();
        Cristiano.hasGlasses();
    }

}