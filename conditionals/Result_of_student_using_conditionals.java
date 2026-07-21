package com.company.conditionals;
import java.util.Scanner;


public class Result_of_student_using_conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all the three subjects:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float per = (a + b + c) / 3.0f;
        if (per < 40 || a < 33 || b < 33 || c < 33) {
            System.out.println("Fail");
        }

        else{
            System.out.println("pass");
        }
    }
}
