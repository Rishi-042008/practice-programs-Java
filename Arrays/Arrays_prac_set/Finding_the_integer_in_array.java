package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Finding_the_integer_in_array {
    public static void main(String[] args) {
        float[] a = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you need to find:");
        float b = sc.nextInt();
        boolean arr = false;
        for (float i : a) {
            if (i == b) {
                arr = true;
                break;
            }
        }
        if (arr) {
            System.out.println("The integer is present");
        } else {
            System.out.println("The integer is absent");
        }
    }
}