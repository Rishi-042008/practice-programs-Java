package com.company;

/*interface camera{
   void takephoto();
}

interface MusicPlayer{
   void playMusic();
}

class SmartPhone implements camera,MusicPlayer{
    public void takephoto(){
        System.out.println("Click the photo");
    }
    public void playMusic(){
        System.out.println("Play the music");
    }
}
public class interfaces_1 {
    public static void main(String[] args){
    SmartPhone samsung = new SmartPhone();
    samsung.playMusic();
    samsung.takephoto();
    }
}*/
/*
interface Bicycle {
    int speed = 7;
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
public class interfaces_1 {
    public static void main(String[] args){
        AvonCycle hero = new AvonCycle();
        System.out.println(hero.applyBrake(3));
        System.out.println(hero.speed);
    }
}*/
/*
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
public class interfaces_1 {
    public static void main(String[] args){
    smartphone samsung = new smartphone();
    samsung.Geo();
    samsung.mp_player();
    samsung.photo();
        samsung.Call();
    }
}*/
/*
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
public class interfaces_1 {
    public static void main(String[] args){
    wirelessEarbuds boat = new wirelessEarbuds();
    boat.charge();
    boat.connectBluetooth();
    }
}*/

interface Area{
    double pi = 3.14;
    double compute();
}

class Rectangle implements Area{
    double l;
    double b;

    Rectangle (double l,double b){
        this.l=l;
        this.b=b;
    }

    public double compute(){
        return l*b;
    }
}

class Circle implements Area{

    double rad;
    Circle(double rad){
        this.rad=rad;
    }
    public double compute(){
        return pi*rad*rad;
    }
}

public class interfaces_1 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(10,20);
        Circle cir = new Circle(15);
        System.out.println("The area of the rectangle is :"+rect.compute());
        System.out.println("The area of the circle is :"+cir.compute());
    }
}
