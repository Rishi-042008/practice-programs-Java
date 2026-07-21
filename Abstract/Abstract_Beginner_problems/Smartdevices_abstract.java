package com.company.Abstract.Abstract_Beginner_problems;

abstract class SmartDevices{
    abstract public void Operate();
}

class SmartWatch extends SmartDevices{
    public void Operate(){
        System.out.println("Shows time as well as act as a mini smart phone");
    }
}

class SmartTV extends SmartDevices{
    public void Operate(){
        System.out.println("Watch the movies in OTT before coming for the channels and acts as a large Mobile");
    }
}
public class Smartdevices_abstract {
    public static void main(String[] args){
        SmartWatch Boat = new SmartWatch();
        Boat.Operate();
        SmartTV Samsung = new SmartTV();
        Samsung.Operate();
    }
}