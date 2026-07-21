package com.company.conditionals;
import java.util.Scanner;

public class Checking_age3_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a boy");
        int age = sc.nextInt();
        if(age>=18 && age<=30)
        {
            System.out.println("he is young ");
        }
        else if(age<18)
        {
            System.out.println("he is child");
        }
        else{
            System.out.println("he is older");
        }
    }}
