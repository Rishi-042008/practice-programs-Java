package com.company.Methods;
import java.util.Scanner;
public class Method_overloading_prac_set {
    static int add(int x, int y) {
        int w = x + y;
        return w;
    }
    int sub(int m, int n){
        int q= m-n;
        return q;
    }
    static void arr(int [] a){
        a[1]=24;
    }
    static void call(){
        System.out.println("Hi, I'm Rishikesh");
    }
    static void call(String a){
        System.out.println("Ram's wife is "+ a);
    }
    static void call(String a, String b){
        System.out.println("Ram's wife is "+a+" and brother is "+b);
    }
    static int res(int...arr){
        int mul= 1;
        for(int e:arr){
            mul*=e;
        }
        return mul;
    }
    static int fab(int n){
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return (fab(n-1)+fab(n-2));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /* int a=45;
        int b=81;
        int c=add(a,b);
        jumk o=new jumk();
        int d=o.sub(a,b);
        System.out.println(c);
        System.out.println(d);
        int [] marks= {100,98,45,69,87};
        arr(marks);
        System.out.println(marks[1]);
         call();
        String p="Sita";
        call(p);
        String v= "Lakshman";
        call(p,v);
        System.out.println("the product of 8,5,6,4 is "+res(8,5,6,4));*/
        /*int n=sc.nextInt();
        for(int i=0; i<n;i++){
        System.out.print(fab(i)+" ");}*/
        int m=sc.nextInt();
       /* int first=0;
        int second=1;
        for(int j=0; j<m;j++){
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
         sc.close();*/

    }
    }
