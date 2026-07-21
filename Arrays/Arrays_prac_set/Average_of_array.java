package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Average_of_array {
    public static void main(String[] args) {
        float[] marks = {10, 20, 30, 40, 50};
        int avg;
        int sum = 0;
        for (float a : marks) {
            sum += a;
        }
        avg = sum / marks.length;
        System.out.println("The average marks is " + avg);
    }
}