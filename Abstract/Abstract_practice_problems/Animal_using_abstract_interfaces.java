package com.company.Abstract.Abstract_practice_problems;

class Monkey{
    void Jump(){
        System.out.println("Jumping...");
    }
    void Bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    public void Sleep();
    public void Eat();
}

class Human extends Monkey implements BasicAnimal{
    public void Sleep(){
        System.out.println("Sleeping");
    }
    public void Eat(){
        System.out.println("Eating");
    }

}
public class Animal_using_abstract_interfaces {
    public static void main(String[] args){
        Monkey xyz = new Human();
        xyz.Bite();
        xyz.Jump();
        BasicAnimal abc = new Human();
        abc.Eat();
        abc.Sleep();
    }
}