package com.company.Inheritance_and_Dynamic_dispatch;

abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound() {
        System.out.println("Dog Barks");
    }
    void barks(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
    void mewos(){
        System.out.println("Cat is meowing");
    }
}

public class Animal_sound_using_dynamic_dispatch2 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
        if(obj instanceof Dog){
            Dog d = (Dog) obj;
            d.barks();
        }
        else if(obj instanceof Cat){
            Cat c = (Cat) obj;
            c.mewos();
        }

    }
}