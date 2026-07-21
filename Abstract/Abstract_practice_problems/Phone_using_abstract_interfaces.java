package com.company.Abstract.Abstract_practice_problems;

abstract class Telephone {
    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();
}

class SmartPhone extends Telephone{
    void Ring(){
        System.out.println("The Phone is ringing...");
    }
    void Lift(){
        System.out.println("Lift the phone to answer the call...");
    }
    void Disconnect(){
        System.out.println("Disconnect the phone by swiping the ring button towards Red button");
    }
    void takePhoto(){
        System.out.println("Open camera and take the photo");
    }
}
public class Phone_using_abstract_interfaces {
    public static void main(String[] args){
        Telephone samsung = new SmartPhone();
        samsung.Ring();
        samsung.Lift();
        samsung.Disconnect();

    }
}