package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class max_element_of_array {
    public static void main(String[] args) {
        int[] marks = {10, 20, 305, 450, 250};
        int max = 0;
        for (int e : marks) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);
    }
}