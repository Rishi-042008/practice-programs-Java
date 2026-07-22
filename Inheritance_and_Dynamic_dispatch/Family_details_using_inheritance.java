package com.company.Inheritance_and_Dynamic_dispatch;

public class Family_details_using_inheritance {
    static class father{
        String name;
        public father(String myname){
         name = myname;
        }
    }
    static class child extends father{
        int roll;
        public child(int myroll,String b){
            super(b);
            roll = myroll;
        }
    }
    static class grandson extends child{
        int marks;
        public grandson(int mymarks,int a ,String b){
            super(a,b);
            marks = mymarks;
        }
    }
    public static void main(String[] args){
        grandson a = new grandson(45,5,"ram");
        System.out.println(a.marks);
        System.out.println(a.roll);
        System.out.println(a.name);
    }
}