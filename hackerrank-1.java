package com.company;
import java.util.*;
import java.io.*;

class hackerrank_1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int [] x = new int[n];
            int term = a;
            int add = b;
            for(int j=0;j<n;j++){
                term+=add;
                add*=2;
                 x [j]= term;
            }
            for(int l = 0 ; l<n;l++){
                System.out.print(x[l]);
                if(l!=n-1){
                    System.out.print(" ");
                }}
            System.out.println();
            for(int k = n-1 ; k>=0;k--){
                System.out.print(x[k]);
                if(k!=0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}