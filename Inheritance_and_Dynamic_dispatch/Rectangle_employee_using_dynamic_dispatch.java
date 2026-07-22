package com.company.Inheritance_and_Dynamic_dispatch;
/*
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle");
    }
}
public class Rectangle_employee_using_dynamic_dispatch {
    public static void main(String[] args) {
    Shape obj;
    obj = new Rectangle();
        obj.draw();
    obj = new Triangle();
        obj.draw();
    obj = new Circle();
        obj.draw();
}
}*/
class Employee{

}
class Manager1 extends Employee{
    void manageTeam(){
        System.out.println("Manager manages the team of employees");
    }
        }
public class Rectangle_employee_using_dynamic_dispatch {
    public static void main(String[] args) {
        Employee e1 = new Manager1();
        Employee e2 = new Employee();
        if(e1 instanceof Manager1){
            Manager1 d = (Manager1) e1;
             d.manageTeam();
        }else {
            System.out.println("e1 is not a manager");
        }
        if(e2 instanceof Manager1)  {
            Manager1 c = (Manager1) e2;
             c.manageTeam();
        }
        else {
            System.out.println("e2 is not a manager");
        }
    }
}