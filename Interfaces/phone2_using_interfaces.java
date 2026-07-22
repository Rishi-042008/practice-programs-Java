package com.company.Interfaces;


interface GPS {
    public void Geo();
}
interface Camera {
    public void photo();
}
interface MediaPlayer{
    public void mp_player();
}
abstract class CellPhone{
    abstract public void Call();
}
class smartphone extends CellPhone implements GPS,Camera,MediaPlayer{
    public void Geo(){
        System.out.println("GPS is included");
    }
    public void photo(){
        System.out.println("Camera is included");
    }
    public void mp_player(){
        System.out.println("Media player is included");
    }
    public void Call(){
        System.out.println("All this things are included to cell phone to create a smartphone");
    }

}
public class phone2_using_interfaces {
    public static void main(String[] args){
        smartphone samsung = new smartphone();
        samsung.Geo();
        samsung.mp_player();
        samsung.photo();
        samsung.Call();
    }
}