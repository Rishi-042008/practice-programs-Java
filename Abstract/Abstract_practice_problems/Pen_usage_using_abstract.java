package com.company.Abstract.Abstract_practice_problems;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Pen is used to write");
    }
    public void refill(){
        System.out.println("Pen contains refill which have ink");
    }
    public void ChangeNib(){
        System.out.println("Changing the Nib");
    }
}
public class Pen_usage_using_abstract {
    public static void main(String[] args){
        FountainPen Hausar = new FountainPen();
        Hausar.refill();
        Hausar.write();
        Hausar.ChangeNib();
    }
}