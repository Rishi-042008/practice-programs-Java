package com.company.getters_and_setters;

public class Student_details_using_get_set2 {
    static class student{
        private String Name;
        private int Age;

        public student(String MyName,int MyAge) {
             Name = MyName;
             Age = MyAge;
        }

        public void setName(String n){
            Name=n;

        }
        public void setAge(int a){
            if(Age>0) {
                Age = a;
            }
        }
        public String getName(){
            return Name;
        }
        public int getAge(){
            return Age;
        }
    }

    public static void main(String[] args){
        student x=new student("Raj",54);
        System.out.println("Name ="+x.getName());
        System.out.println("Age ="+x.getAge());
    }
}