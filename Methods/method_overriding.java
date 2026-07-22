package com.company.Methods;

class A{
    public void meth(){
        System.out.println("I am method of class A");
    }
}
class B extends A{

    public void meth(){
        System.out.println("I am method of class B ");
    }
}
public class method_overriding {
    public static void main(String[] args){
       A a = new A();
       a.meth();;

       B b = new B();
       b.meth();
    }
}