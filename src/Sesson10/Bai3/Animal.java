package Sesson10.Bai3;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void introduce();

    interface Swimmable {
        void swim();
    }

    interface Flyable {
        void fly();
    }
}
