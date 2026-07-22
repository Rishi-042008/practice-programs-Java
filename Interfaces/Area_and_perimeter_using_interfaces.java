package com.company.Interfaces;


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

public class Area_and_perimeter_using_interfaces {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(10,20);
        Circle cir = new Circle(15);
        System.out.println("The area of the rectangle is :"+rect.compute());
        System.out.println("The area of the circle is :"+cir.compute());
    }
}
