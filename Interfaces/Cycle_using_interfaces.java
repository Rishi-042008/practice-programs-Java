package com.company.Interfaces;


interface Bicycle {
    int speed= 7;
    int applyBrake(int decrement);

    int  speedUp(int increment);
}
class AvonCycle implements Bicycle{

    public int applyBrake(int decrement){
        return  speed-decrement;
    }
    public int  speedUp(int increment){
        return speed+increment;
    }
}
public class Cycle_using_interfaces {
    public static void main(String[] args){
        AvonCycle hero = new AvonCycle();
        System.out.println(hero.applyBrake(3));
        System.out.println(hero.speed);
    }
}