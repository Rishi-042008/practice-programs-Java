package com.company.Arrays.Arrays_prac_set;
import java.util.Scanner;

public class min_element_of_array {
    public static void main(String[] args) {
        int[] marks = {10, 20, 305, 450, 250};
        int min = Integer.MAX_VALUE;
        for (int e : marks) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println(min);
    }
}