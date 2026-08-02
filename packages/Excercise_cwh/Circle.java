package Excercise_cwh.Circles;

public class Circle {
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public int getradius(){
        return radius;
    }
    public int Area(){
        return (int)(3.14*radius*radius);
    }
    public int perimeter(){
        return (int)(2*3.14*radius);
    }
}
