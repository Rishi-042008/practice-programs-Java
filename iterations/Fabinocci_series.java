package com.company.iterations;
import java.util.Scanner;


public class Fabinocci_series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        while (count<n){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
            count++;
        }
    }
}