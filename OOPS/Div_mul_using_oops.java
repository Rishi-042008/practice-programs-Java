package com.company.OOPS;
import java.util.Scanner;

class XYZ{
    static int count = 0;
    int a;
    int b;
    XYZ(int a , int b){
        this.a=a;
        this.b=b;
    }
    static int mul(int a,int b){
        count++;
        return a*b;
    }
    static float div(int a, int b){
        count++;
        return a/b;
    }
}
public class Div_mul_using_oops {
    public static void main(String[] args){
        System.out.println("Multiplication = "+XYZ.mul(4,5));
        System.out.println("Division = "+XYZ.div(8,4));
        System.out.println("count = "+XYZ.count);
    }
}
