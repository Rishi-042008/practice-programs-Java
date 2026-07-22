package com.company.Inheritance_and_Dynamic_dispatch;

abstract class Vehicle1{
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

public class vehicle_using_dynamic_dispatch {
    public static void main(String[] args) {
        Vehicle1 obj;
        obj = new Car();
        obj.start();
        Car c = (Car) obj;
        c.playMusic();

    }
}
