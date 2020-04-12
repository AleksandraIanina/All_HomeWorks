package hw_31_mart.actor;

import hw_02_april.Dog;

public class Person {
    public static void eat()
    {
        System.out.println("Person eat");
    }

    private static void drink()
    {
        System.out.println("Person drink");
    }

    public static void playWithDog(){
        Dog.gaf();
        Dog.getAge();
        Dog.showAge();
        Dog.appendYear(3);
        Dog.getSex();
        Dog.changeSex(Dog.showSex());

    }

    public static void startExecution(){
        Person.eat();
        Person.playWithDog();
        }
}


