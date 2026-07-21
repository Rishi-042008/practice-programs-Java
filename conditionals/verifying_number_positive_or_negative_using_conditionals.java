package com.company.conditionals;
import java.util.Scanner;

public class verifying_number_positive_or_negative_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        System.out.println("the number is " + a);
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is zero");
        }
    }
}
