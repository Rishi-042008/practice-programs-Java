package com.company;

import java.util.Scanner;

            public class Kilometers_to_mile {
                public static void main(String[] args){

                    Scanner sc=new Scanner(System.in);
                    System.out.println("Distance travelled in kilometers");
                    double k =sc.nextDouble();
                    System.out.println(k);
                   double miles =0.621371*k;
                    System.out.println(" kilometers " + miles + " miles");

                }
}