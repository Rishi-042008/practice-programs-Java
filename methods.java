package com.company;

public class methods {
    static void s(int[] a){
        a[0]=12;
    }
    static void j(){
        System.out.println("Dad is home");;
    }

    static void j(String x){
        System.out.println("Bloody Sweet " + x);
    }
    static void j(String x,String y){
        System.out.println(" Bloody Sweet by "+x+" and ''If you are bad,I'm your dad'' by "+y);;
    }
     int x(int a,int b){        //calling method
        int c;
        c=a+b;
        return c;
    }
    static int res(int... arr){
        int sum=0;
        for(int e : arr){
            sum=sum+e;
        }
        return sum;
    }
    static int rec(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*rec(n-1);
        }
    }
    public void main(String[] args) {
    int g=10;
    int f=45;
    int l;
    methods obj = new methods();//calling method
    l=obj.x(g,f);
        System.out.println(l);//void return type
        int []m={45,21,36,78,96,18};
        s(m);
        System.out.println(m[0]);//arrays
        j();//method overloading type 1
        j("leo");//method overloading type 2
        j("leo","Marri");//method overloading type 3
        System.out.println("The sum of 4 and 8 is :"+res(4,5,5,8,7));
        System.out.println(rec(5));;

    }
}