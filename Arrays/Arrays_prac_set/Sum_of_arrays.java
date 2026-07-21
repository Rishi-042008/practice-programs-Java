package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class Sum_of_arrays {
    public static void main(String[] args) {
        float[] a = {10.5f, 20.6f, 30.9f, 40.8f, 50.1f};
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}