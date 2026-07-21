package com.company.conditionals;
import java.util.Scanner;

public class Electricity_bill_using_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial meter reading: ");
        float i = sc.nextFloat();
        System.out.print("Enter final meter reading: ");
        float f = sc.nextFloat();
        float c = f - i;
        System.out.println("The consumption is " + c);
        if (c >= 500) {
            System.out.println("Rate per unit: " + c * 5.50);
        } else if (c < 500 && c >= 200) {
            System.out.println("Rate per unit: "+c * 3.50);
        } else if (c < 200 && c >= 100) {
            System.out.println("Rate per unit: " +c * 2.50);
        } else {
            System.out.println("Rate per unit: " +c * 1.50);
        }
    }
}