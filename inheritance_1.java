package com.company;

class person{
    String name;
    person(String stud_name){
        this.name = stud_name;
    }
}
class student extends person{
    int marks;
    student(int stud_marks,String name){
        super(name);
        this.marks = stud_marks;
    }
    public boolean ispassed(){
        boolean ispassed = true;
        return marks>=40;
    }
}
public class inheritance_1 {
    public static void main(String[] args) {
    student s = new student(98,"Ram");
        System.out.println("Name = "+ s.name);
        System.out.println("Marks = "+ s.marks);
    if(s.ispassed()){
        System.out.println("The student "+ s.name + " is pass");
    }
    else
        System.out.println("The student "+ s.name + " is fail");
    }
}