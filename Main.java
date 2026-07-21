// Write a program to calculate percentage of  a given student in CBSE board.
// His marks from the subjects must be taken as input from The keyboard?

package com.company;
import java.util.Scanner;
public class Main{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Marks of sub 1");
        float sub1= sc.nextFloat();
        if(sub1 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }
        System.out.println("Marks of sub 2");
        float sub2= sc.nextFloat();
        if(sub2 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }

        System.out.println("Marks of sub 3");
        float sub3= sc.nextFloat();
        if(sub3 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }
        System.out.println("Marks of sub 4");
        float sub4= sc.nextFloat();
        if(sub4 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }
        System.out.println("Marks of sub 5");

        float sub5= sc.nextFloat();
        if(sub5 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }
        System.out.println("Marks of sub 6");
        float sub6= sc.nextFloat();
        if(sub6 >100) {
            System.out.println("Invalid marks!Marks should not be more than 100.");

            return;
        }
        float sum = sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("The sum of marks in all subject");
        System.out.println(sum);
        float percentage = sum/600 *100;
        System.out.println("The percentage is given by");
        System.out.println(percentage);
    }
}