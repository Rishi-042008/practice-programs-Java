package Excercise_cwh.Cylinders;

public class Cylinder {
    public int radius;
    public int height;
    
    public Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }
    
    public int getradius(){
        return radius;
    }
    
    public int getheight(){
        return height;
    }
    
    public int SurfaceArea(){
        return (int)(2*3.14*radius*(radius+height));
    }
    
    public int Volume(){
        return (int)(3.14*radius*radius*height);
    }
}
