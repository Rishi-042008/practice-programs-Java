package com.company;
class x1{
    public int x = 10;
    protected int y = 7;
    int z = 9;
    private int q = 49;
    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(q);
    }
}
class c2 extends x1{
    void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class Access_modifiers {
    public static void main(String[] args){
         x1 a= new x1();
         a.meth1();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
       // System.out.println(a.q);
        c2 b = new c2();
        b.meth();


    }
}