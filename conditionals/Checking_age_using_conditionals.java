package com.company.conditionals;
import java.util.Scanner;

public class Checking_age_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a boy");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("he is adult");
        } else {
            System.out.println("he is not an adult");
        }
    }
}
