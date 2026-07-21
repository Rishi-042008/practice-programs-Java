package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;
//Create a class circle and use inheritance to create another class cylinder grom it
/*
class Circle{
    double rad;
    Circle(double rad){
        if( rad >0){
            this.rad =rad;
        }
        else {
            System.out.println("Invalid radius so the 1 is taken");
            this.rad=1;
        }
    }
    double area(){
        return  Math.PI * Math.pow(rad,2);
    }
}
class Cylinder extends Circle {
    double height;
    Cylinder(double height,double rad){
        super(rad);
        if(height>0){
            this.height = height;
        }
        else {
            System.out.println("Invalid height so the 1 is taken");
            this.height = 1;
        }
    }
    double area(){
        return 2* Math.PI* rad * (rad + height);
    }
    double volume(){
        return Math.PI * Math.pow(rad,2)*this.height;
    }
}*/


//Create a class Rectangle and use inheritance to create another class cuboid try keep it as close to real world scenario as possible

/*class Rectangle{
    double length;
    double breadth;
    Rectangle(double length , double breadth){
        if(length>0){
            this.length = length;
        }
        else{
            System.out.println("Invalid value , so length assigned to 1");
            this.length = 1;
        }
        if(breadth>0){
            this.breadth = breadth;
        }
        else{
            System.out.println("Invalid value , so breadth assigned to 1");
            this.breadth = 1;
        }
    }
    double Area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle {
    double height;

    Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid value , so breadth assigned to 1");
            this.height = 1;
        }
    }

    @Override
    double Area() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }
    double volume(){
        return (length*breadth*height);
    }
}*/



public class prac_set_inheritance {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        // 1st question
       /* System.out.println("Enter the radius of the circle:");
        Circle c = new Circle(sc.nextInt());
        System.out.println("The area of the circle is "+ c.area());
        System.out.println("Enter the height of the cylinder");
        Cylinder cy = new Cylinder(sc.nextInt(),c.rad);
        System.out.println("The area of the cylinder is " + cy.area());
        System.out.println("The volume of the cylinder is "+ cy.volume());*/


        //2nd question
        /*System.out.println("Enter the length and breadth of the Rectangle :");
        Rectangle rec = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("The Area of the Rectangle is "+rec.Area());
        System.out.println("Enter the height to get the area and volume of the cuboid formed by previous rectangle");
       Cuboid cu = new Cuboid(rec.length,rec.breadth, sc.nextDouble());
        System.out.println("The Area of the Cuboid is "+cu.Area());
        System.out.println("The volume of the Cuboid is "+cu.volume());*/

        
    }
}