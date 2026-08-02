package ShapeCalculator;

import ShapeCalculator.shapes.Circle;
import ShapeCalculator.shapes.Rectangle;
import ShapeCalculator.shapes.Triangle;

public class Main{
    public static void main(String[] args) {
        Circle C1 = new Circle(5);
        System.out.println("Area of circle = "+C1.area());
        System.out.println("Circumference of circle = "+C1.perimeter());


        Rectangle R1 = new Rectangle(5,8);
        System.err.println("Area of Rectangle = "+R1.area());
        System.out.println("Perimerter of Rectangle = "+R1.perimeter());

        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println("Area of triangle = " + t1.area());
        System.out.println("Perimeter of triangle = " + t1.perimeter());
    }
}