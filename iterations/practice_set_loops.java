package com.company.iterations;
import java.util.Scanner;

public class practice_set_loops {
    public static void main(String[] args) {
        for (int i=4;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        /*int i=0;
        int sum = 0;
        while( i<=10){
            sum+=i;
            i=i+2;
        }
        System.out.println(sum);*/
        /*int i=0;
        while (i<10){
            System.out.println("5");
            i++;
        }*/
        /*int i=8;
        int sum=0;
        while(i<=80){
            sum+=i;
            i=i+8;
        }
        System.out.println(sum);*/

         /*   int sum=0;
            for (int i=0;i<=100; i++){
                sum+=i;
            }
        System.out.println(sum);*/
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\t");
        }*/
        /*for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }*/
        /*for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            m=n*i;
            System.out.println(n+" * "+i+" = "+m);
        }*/
        /*Scanner sc=new Scanner(System.in);
        int m;

        int n=10;
        for(int i=10;i>0;i--) {   m=n*i;
            System.out.println(n+" X "+i+" = "+m);
        }*/
        Scanner sc = new Scanner(System.in);
        /*int n=sc.nextInt();
        int fact=1;
        System.out.print(n+"! = ");
        for(int i=n;i>=1;i--){
            fact=fact*i;
            if (i!=1)
              System.out.print(i+" X ");
            else
                System.out.print(i+" = ");
        }
        System.out.println(fact);*/
        /*int n= 8;
        int i= 1;
        int sum = 0;
        while (i<=10){
            System.out.printf("%d X %d = %d\n",n,i,n*i );
            sum += n*i;
            i++;
        }
        System.out.println("The sum of the multiples of 8 is "+sum);*/
        /*for(int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
            System.out.print(j);
        }
            System.out.println();
        }*/
        /*for(int i=1; i<5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*
        for(int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*for(int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*for(int i=5; i>=1; i--){
            for (int j=5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }*/
        /*for(int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/


    }
}

