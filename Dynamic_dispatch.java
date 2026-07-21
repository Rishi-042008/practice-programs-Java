package com.company;

/*class Animal{
    void makeSound(){
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}

public class Dynamic_dispatch {
    public static void main(String[] args) {
    Animal obj ;
    obj = new Dog();
        obj.makeSound();
        obj = new Cat();
        obj.makeSound();
    }
}*/


/*abstract class Vehicle1{
    void start(){
        System.out.println("Start the vehicle");
    }
}

class Car extends Vehicle1 {
  @Override
    void start(){
      System.out.println("Start the car");
    }
    void playMusic(){
        System.out.println("Play the music");
    }
}

public class Dynamic_dispatch {
    public static void main(String[] args) {
        Vehicle1 obj;
        obj = new Car();
        obj.start();
        Car c = (Car) obj;
        c.playMusic();

    }}*/


/*abstract class Animal{
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

public class Dynamic_dispatch {
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

    }}*/

/*abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle");
    }
}
public class Dynamic_dispatch {
    public static void main(String[] args) {
    Shape obj;
    obj = new Rectangle();
        obj.draw();
    obj = new Triangle();
        obj.draw();
    obj = new Circle();
        obj.draw();
}}*/
/*class Employee{

}
class Manager1 extends Employee{
    void manageTeam(){
        System.out.println("Manager manages the team of employees");
    }
        }
public class Dynamic_dispatch {
    public static void main(String[] args) {
        Employee e1 = new Manager1();
        Employee e2 = new Employee();
        if(e1 instanceof Manager1){
            Manager1 d = (Manager1) e1;
             d.manageTeam();
        }else {
            System.out.println("e1 is not a manager");
        }
        if(e2 instanceof Manager1)  {
            Manager1 c = (Manager1) e2;
             c.manageTeam();
        }
        else {
            System.out.println("e2 is not a manager");
        }
    }}*/