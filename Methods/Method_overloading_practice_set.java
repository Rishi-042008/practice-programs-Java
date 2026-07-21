package com.company.Methods;

public class Method_overloading_practice_set {
    static int add(int m,int n){
        return m+n;
    }
    static int add(int m,int n,int o){
        return m+n+o;
    }
    static double add(double m,double n){
        return m+n;
    }
    static int sub(int m, int n){
        return m-n;
    }
    static int mul(int m,int n){
        return m*n;
    }
    static double div(double m, double n){
        if(n==0){
            System.out.println("not defined");
            return 0;
        }
        else {
            return m/n;
        }
    }
    public static void main(String[] args){
        System.out.println(add(5,2));
        System.out.println(add(5,2,4));
        System.out.println(add(5.2,8.9));
        System.out.println(sub(56,6));
        System.out.println(mul(5,8));
        System.out.println(div(8,5));
    }
}