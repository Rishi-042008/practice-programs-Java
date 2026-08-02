package Excercise_cwh;
import Excercise_cwh.Circles.Circle;
import Excercise_cwh.Rectangles.Rectangle;
import Excercise_cwh.Spheres.Sphere;
import Excercise_cwh.Squares.Square;
import Excercise_cwh.Cylinders.Cylinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(5);
        System.out.println("Area of circle is: "+c1.Area());
        System.out.println("Perimeter of circle is: "+c1.perimeter());

        Rectangle r1=new Rectangle(5,6);
        System.out.println("Area of rectangle is: "+r1.Area());
        System.out.println("Perimeter of rectangle is: "+r1.perimeter());

        Square s1=new Square(5);
        System.out.println("Area of square is: "+s1.Area());
        System.out.println("Perimeter of square is: "+s1.perimeter());

        Sphere sp1=new Sphere(5);
        System.out.println("Surface area of sphere is: "+sp1.SurfaceArea());
        System.out.println("Volume of sphere is: "+sp1.Volume());

        Cylinder cy1=new Cylinder(5,10);
        System.out.println("Surface area of cylinder is: "+cy1.SurfaceArea());
        System.out.println("Volume of cylinder is: "+cy1.Volume());
    }   
}
