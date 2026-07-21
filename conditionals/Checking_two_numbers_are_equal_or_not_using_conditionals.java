package com.company.conditionals;
import java.util.Scanner;

public class Checking_two_numbers_are_equal_or_not_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        }
    }
}