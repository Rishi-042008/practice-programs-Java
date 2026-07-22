package com.company.Interfaces;


interface Charging {
    void charge();
}
interface bluetooth {
    void connectBluetooth();
}
class wirelessEarbuds implements Charging,bluetooth{
    public void charge(){
        System.out.println("The buds are charging wirelessly");
    }
    public void connectBluetooth(){
        System.out.println("The buds are connected to phone via bluetooth");
    }
}
public class Earbuds_using_interfaces {
    public static void main(String[] args){
        wirelessEarbuds boat = new wirelessEarbuds();
        boat.charge();
        boat.connectBluetooth();
    }
}