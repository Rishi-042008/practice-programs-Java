package ShapeCalculator.shapes;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getside1() {
        return side1;
    }

    public double getside2() {
        return side2;
    }

    public double getside3() {
        return side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2.0;  
        double result = s * (s - side1) * (s - side2) * (s - side3);
        return Math.sqrt(result);
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}