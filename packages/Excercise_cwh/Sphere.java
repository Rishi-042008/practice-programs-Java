package Excercise_cwh.Spheres;

public class Sphere {
    public int radius;
    public Sphere(int radius){
        this.radius=radius;
    }
    public int getradius(){
        return radius;
    }
    public int SurfaceArea(){
        return (int)(4*3.14*radius*radius);
    }
    public int Volume(){
        return (int)((4/3)*3.14*radius*radius*radius);
    }
}
