package com.company.Constructors;



class Student{
    int rollNo ;
    String name;
    double [] marks = new double[3];
    double average;

    Student(int rollNo, String name,double [] marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks= marks;
    }


    void details(){
        System.out.println("Name = "+name);
        System.out.println("Roll number = "+ rollNo);
    }

    void CalculateAverage(){
        double sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        average = sum/marks.length;
    }

    void Display(){
        for(int i=0;i<marks.length;i++){
            System.out.println("The marks of the subject "+(i+1) + " is "+marks[i]);
        }
        System.out.println("The Average marks of the student is: "+average);
    }
}
public  class Student_details_using_constructors1 {
    public static void main(String[] args){

        Student ram = new Student(49,"Ramcharan",new double[]{85,95,78,48});
        ram.details();
        ram.CalculateAverage();
        ram.Display();
    }
}