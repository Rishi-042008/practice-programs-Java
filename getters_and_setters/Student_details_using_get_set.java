package com.company.getters_and_setters;

public class Student_details_using_get_set {
    static class Student{
        private String Name;
        private int Marks;

        public Student(String MyName,int MyMarks){
            Name=MyName;
            if(MyMarks>=0 && MyMarks<=100){
                Marks=MyMarks;
            }
            else {
                System.out.println("Invalid marks,Default 1 is assigned");
                MyMarks=1;
            }
        }

        public void setName(String name) {
            this.Name = Name;
        }

        public void setMarks(int Marks) {
            if(Marks>=0 && Marks<=100){
                this.Marks=Marks;
            }
            else
                System.out.println("Invalid marks,Default 1 is assigned");
            this.Marks=1;
        }

        public String getName() {
            return Name;
        }

        public int getMarks() {
            return Marks;
        }
        public String ispassed(){
            if(Marks>=40) {
                return "Passed";
            }
            else
                return "Fail";
        }
    }

    public static void main(String[] args){
    Student roll101= new Student("Ram",50);
        System.out.println("The student "+roll101.getName()+" is "+ roll101.ispassed());
    }
}