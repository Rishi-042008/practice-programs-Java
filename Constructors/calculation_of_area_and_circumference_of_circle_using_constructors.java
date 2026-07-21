package com.company.Constructors;

    public class calculation_of_area_and_circumference_of_circle_using_constructors {
        static class Circle{
            private int radius;
            public Circle(int r){
                    if (r>0)
                        radius=r;
                    else
                        System.out.println("Invalid radius default 1 is taken");
                        r=1;
            }

            public void setRadius(int rad) {
                if(rad>0)
                    this.radius = rad;
                else
                    System.out.println("Invalid radius");
            }

            public int getRadius() {
                return radius;
            }
            public double getArea(){
                return Math.PI*Math.pow(radius,2);

            }
            public double getperimeter(){
                return  2*Math.PI*radius;
            }
            public boolean isBigger(Circle other){
                return this.getArea()>other.getArea();

            }
        }
        public static void main(String[] args){
            Circle a=new Circle(2);
            System.out.println("The radius of the circle is:"+a.getRadius());
            System.out.println("The area of the circle is: "+a.getArea());
            System.out.println("The perimeter of the circle is: "+a.getperimeter());
            Circle b= new Circle(5);
            if(a.isBigger(b)) {
                System.out.println("Circle a is Bigger");
            } else
                System.out.println("Circle b is Bigger");
        }
}