package com.company;
import java.util.Scanner;

public class prac_set_methods {
    static void mul(int m) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", m, i, m * i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
}
static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
static int feb(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }else {
            return (feb(n-1))+(feb(n-2));
        }
}
static double avg(double...a){
         double sum=0;
         for(double e:a){
         sum+=e;
        }
         return  (sum/a.length);
    }
    static int pat1(int n) {
        if (n > 0) {
            pat1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    static void pat2(int n){

        for ( int i=n;i>0;i--){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.println();
        }}

    static void far(double cel){
        double far=cel*(1.8)+32;
        System.out.println("The temperature in farenheit is "+far);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //problem 1
        /*System.out.println("Enter the number you want the multiple of : ");
        int n=sc.nextInt();
        mul(n);*/
        //problem 2
        //pattern1(4);
        //problem 3
        //System.out.println(sum(4));
        //problem 4
        // pattern2(4);
        //problem 5
       /* int n=sc.nextInt();
        for (int i=0;i<n;i++)
        System.out.println(feb(i));*/
        //problem 6
        //System.out.println( "The average is :"+avg(4,5,6,7,2));
        //problem 7
        //pat1(4);

        //problem 8
        //pat2(4);
        //problem 9
       /* System.out.println("Enter the temperature in celcius:");
        far(sc.nextInt());*/
       /* System.out.println("Enter the n natural numbers :");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<=n; i++){
            sum+=i;
        }
        System.out.println("The sum of the n natural number is "+sum);*/

    }

    }