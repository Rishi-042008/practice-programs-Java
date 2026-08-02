package ShapeCalculator.shapes;

public class Rectangle {
    public double length;
    public double breadth;
    
    public Rectangle(double breadth,double length){
        this.breadth=breadth;
        this.length=length;
    }
    public double getlength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
   
}
