package com.company;
import java.util.Scanner;
public class prac_set_OOPS {
    static class rectangle{
        int length;
        int breadth;
        public int area(){
            return length*breadth;
        }
        public int perimeter(){
            return 2*(length+breadth);
        }
    }
static class square{
    int side;
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }
    static class cellphone{
        public void ringing(){
            System.out.println("Ringing");
        }
        public void vibrating(){
            System.out.println("Vibrating");
        }
    }
    static class Tommy{
        public void hit(){
            System.out.println("Tommy hit's the boundary...");
        }
        public void run(){
            System.out.println("Tommy is running between the wickets for single or double...");
        }
        public void defend(){
            System.out.println("Tommy playing the defensive game due to the back to back wickets loss at another end");
        }
    }
    static class Employee{
        int salary;
        String name;
        public int getSalary(){
            return salary;
        }
        public String getName() {
            return name;
        }
        public void setName(String n){
            name=n;
        }}
    static class circle{
        double n;
        public double area(){
            return  ( Math.PI*Math.pow(n,2));
        }
        public double perimeter(){

            return ( 2*Math.PI*n);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //problem 1
       /* Employee ram=new Employee();
        ram.setName("Rameshwar");
        ram.salary=2445;
        System.out.println(ram.getName());
        System.out.println(ram.getSalary());
        */


        //problem2
       /* cellphone itel=new cellphone();[-p
        itel.ringing();
        itel.vibrating();*/


        //problem 3
       /* square r=new square();
        System.out.println("Enter the length of the side of the square: ");
        r.side=sc.nextInt();
        System.out.println("The area is: "+r.area());
        System.out.println("The perimeter is: "+r.perimeter());


       */ //problem 4
        /*rectangle re=new rectangle();
        System.out.println("Enter the length of the rectangle: ");
        re.length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        re.breadth=sc.nextInt();
        System.out.println("The area of the rectangle is: "+re.area());
        System.out.println("The perimeter of the rectangle is: "+re.perimeter());*/

       /* Tommy virat=new Tommy();
        virat.defend();
        virat.hit();
        virat.run();*/

        /*circle r= new circle();
        System.out.println("Enter the radius of the circle:");
        r.n= sc.nextFloat();
        System.out.println("The area of circle is:"+ r.area());
        System.out.println("The perimeter of circle is:"+r.perimeter());
*/
    }
}