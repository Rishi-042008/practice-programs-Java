package com.company.Abstract.Abstract_Beginner_problems;

abstract class AnimalSound{
    abstract void sound();
}

class dog extends AnimalSound{
    @Override
    public void sound(){
        System.out.println("BOW");
    }
}
class cat extends AnimalSound{
    public void sound(){
        System.out.println("MEOW");
    }
}
public class Animal_Sound_using_abstract {
    public static void main(String[] args){
        dog GermanShepard = new dog();
        GermanShepard.sound();
        cat Barbie = new cat();
        Barbie.sound();
    }
}